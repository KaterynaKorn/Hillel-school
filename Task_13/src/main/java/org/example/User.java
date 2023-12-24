package org.example;

import java.util.Objects;
import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.stream.Stream;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Builder
@Data
@Getter
public class User {
    public String name;
    public int age;
    public String email;
    public String gender;

}
