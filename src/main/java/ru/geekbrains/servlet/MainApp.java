package ru.geekbrains.servlet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext appCntx = new AnnotationConfigApplicationContext(ProductRepository.class);
    }
}
