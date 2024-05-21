package com.calculator;

import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static boolean isArmstrongNumber(int number) {
        int originalNumber, remainder, result = 0, n = 0;
        originalNumber = number;

        // Count digits
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }

        originalNumber = number;

        // Calculate result
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        // Check if the number is Armstrong
        return result == number;
    }

    public static void main(String[] args) {
//        int inputNumber = 153;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Number: ");
    	int inputNumber = sc.nextInt();
        boolean isArmstrong = isArmstrongNumber(inputNumber);
        if (isArmstrong) {
            System.out.println(inputNumber + " is an Armstrong number.");
        } else {
            System.out.println(inputNumber + " is not an Armstrong number.");
        }
    }
}

