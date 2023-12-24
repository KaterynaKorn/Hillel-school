package org.example;

import com.github.javafaker.Faker;

public class Generator {

    public static User generateUser(){
        Faker fakerAge = new Faker();
        Faker fakerName = new Faker();
        Faker fakerEmail = new Faker();
        Faker fakerGender = new Faker();


        return  User.builder()
                .age(fakerAge.number().numberBetween(10,80))
                .name(fakerName.name().firstName())
                .email(fakerEmail.internet().emailAddress())
                .gender(fakerGender.demographic().sex())
                .build();
    }
}
