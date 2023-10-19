package org.example;
public class PatternMatching {
    public static void main(String[] args) {
        String response="Hello";
        switch (response) {
            case "Hello","hello","Hi" -> System.out.println("Hello");
            case "Bye" -> System.out.println("Bye");
            default -> System.out.println("No Match");
        }

    }
}
