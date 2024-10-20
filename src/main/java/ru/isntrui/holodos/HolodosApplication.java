package ru.isntrui.holodos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
public class HolodosApplication {

    public static void main(String[] args) {
        for (Map.Entry<?, ?> entry : System.getenv().entrySet()) {
            System.out.printf("%-15s : %s%n", entry.getKey(), entry.getValue());
        }
        SpringApplication.run(HolodosApplication.class, args);
    }

}
