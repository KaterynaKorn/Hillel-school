package org.example;

import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.generate(Generator::generateUser)
                .limit(20)
                .filter(user -> user.getAge() > 18)
                .sorted(Comparator.comparing(User::getName))
                .filter(user -> !"".equals(user.getEmail()))
                .sorted(Comparator.comparing(User::getGender))
                .forEach(System.out::println);
    }
}