package com.company;

import java.util.Scanner;

public class Tamanho_Vetor {
    public static void main(String[] args) {
        int size, cont;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tamanho do vetor: ");
        size = scanner.nextInt();

        int[] vet = new int[size];

        for (cont = 0; cont < size; cont++) {
            System.out.print("Índice " + cont + ": ");
            vet[cont] = scanner.nextInt();
        }

        cont = 0;

        for (cont = 0; cont < size; cont++) {
            System.out.println("Índice " + cont + ": " + vet[cont]);
        }
    }
}
