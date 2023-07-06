package com.company;

import java.util.Scanner;

public class ExemplosVetor {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] temp = new int[10];
        int i = 0;

        for (i = 0; i <= 9; i++) {
            System.out.print("temp[" + i + "] = ");
            temp[i] = scanner.nextInt();
        }
        i = 0;

        for (i= 0; i <= 9; i++) {
            System.out.println("temp[" + i + "] = " + temp[i]);
        }
    }
}
