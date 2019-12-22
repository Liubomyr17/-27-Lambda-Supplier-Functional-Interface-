package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        Supplier<Integer> supplier = DemoApplication::getNum;
        for (int i = 1; i < 21; i++) {
            System.out.println(supplier.get());
        }
    }

    private static Integer getNum() {
        Random random = new Random();
        return random.nextInt(100);
    }
}
