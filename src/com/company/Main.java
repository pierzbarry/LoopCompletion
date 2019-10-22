package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter ten integers:");
        int num, total = 0;

        // Loop should start here
        for (int i=1; i<11; i++){
            num = keyboard.nextInt();
            total += num;
            // Loop should end here
        }
        System.out.println("The total of all 10 numbers is " + total);
    }
}