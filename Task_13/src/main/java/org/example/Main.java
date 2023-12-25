package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Map<String, List<User>> groupedGender = Stream.generate(Generator::generateUser)
                .limit(20)
                .filter(user -> user.getAge() > 18)
                .sorted(Comparator.comparing(User::getName))
                .filter(user -> !"".equals(user.getEmail()))
                .sorted(Comparator.comparing(User::getGender))
                .collect(Collectors.groupingBy(User::getGender));

        groupedGender.forEach((gender, userList) -> {
            System.out.println("Gender: " + gender);
            userList.forEach(System.out::println);
        });
    }
}