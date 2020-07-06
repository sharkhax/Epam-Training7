package com.drobot.task7.main;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String country = "";
        String language = "";

        System.out.println("1 - Русский\n2 - Белорусский\nDefault - English, US");
        Scanner scanner = new Scanner(System.in);
        byte input = scanner.nextByte();

        switch (input) {
            case (1) -> {
                country = "RU";
                language = "ru";
            }
            case (2) -> {
                country = "BY";
                language = "be";
            }
        }

        Locale locale = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("property.text", locale);
        String s1 = rb.getString("str1");
        String s2 = rb.getString("str2");
        System.out.println(s1 + "\n" + s2);
    }
}
