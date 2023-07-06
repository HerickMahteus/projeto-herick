package com.company;

import java.util.Scanner;

public class MenorValor_PrimeiraPosição {
    public static void main(String[] args) {
        int size, cont, cont2, vet0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tamanho do vetor: ");
        size = scanner.nextInt();

        int[] vet = new int[size];
        int[] vet2 = new int[size];

        for (cont = 0; cont < size; cont++) {
            System.out.print("Índice " + cont + ": ");
            vet[cont] = scanner.nextInt();
        }

        cont = 0;

        for (cont = 0; cont < size; cont++) {
            for (cont2 = 0; cont2 < size; cont2++) {
                if (vet[cont] < vet[cont2]) {
                    vet2[cont] += 1;
                }
            }
        }

        cont = 0;

        for (cont = 0; cont < size; cont++) {
            if (vet2[cont] == (size - 1)) {
                vet0 = vet[0];
                vet[0] = vet[cont];
                vet[cont] = vet0;
            }
        }

        cont = 0;

        for (cont = 0; cont < size; cont++) {
            System.out.println("Índice " + cont + ": " + vet[cont]);
        }
    }
}
