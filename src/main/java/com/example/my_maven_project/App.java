package com.example.my_maven_project;

import java.util.Properties;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        try {

            Properties properties = new Properties();

            var input = App.class
                    .getClassLoader()
                    .getResourceAsStream("config.properties");

            properties.load(input);

            System.out.println("App Name: "
                    + properties.getProperty("app.name"));

            System.out.println("App Version: "
                    + properties.getProperty("app.version"));

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double sum = num1 + num2;

            System.out.println("Sum: " + sum);

            System.out.println("Patch applied successfully!");

            sc.close();
            input.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}