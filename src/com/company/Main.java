package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int inputNumber = scanner.nextInt();
        if (inputNumber >= 0 && inputNumber <= 44) {
            System.out.println("The number is in 0->44 range");
        } else if (inputNumber >= 45 && inputNumber <= 89) {
            System.out.println("The number is in 45->89 range");
        } else if (inputNumber >= 90 && inputNumber <= 134) {
            System.out.println("The number is in 45->89 range");
        } else {
            System.out.println("The number is out of range");
        }

    }
}
