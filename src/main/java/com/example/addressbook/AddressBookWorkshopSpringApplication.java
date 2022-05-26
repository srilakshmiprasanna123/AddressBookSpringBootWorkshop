package com.example.addressbook;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class AddressBookWorkshopSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(AddressBookWorkshopSpringApplication.class, args);
        System.out.println("Hello Welcome To AddressBook ");
        log.info("Logger is Activated");
        System.out.println("Hello Log How Are U");
    }
}
