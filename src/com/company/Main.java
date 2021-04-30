package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int inputNumber = scanner.nextInt();
        int result = (inputNumber / 100) + 1;
        switch (result) {
            case 1 -> System.out.println("The number is in 0->99 range");
            case 2 -> System.out.println("The number is in 100->199 range");
            case 3 -> System.out.println("The number is in 200->299 range");
            default -> System.out.println("The number is out of range");
        }
    }
}