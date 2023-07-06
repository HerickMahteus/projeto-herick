package com.company;

import java.util.Scanner;

public class PráticasComVetoresEmJava {
    public static void main(String[] args) {
        int size, cont, greater_index = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tamanho do vetor: ");
        size = scanner.nextInt();

        int[] vet = new int[size];

        for (cont = 0; cont < size; cont++) {
            System.out.print("Índice " + cont + ": ");
            vet[cont] = scanner.nextInt();
        }

        //1 - Maior elemento
        for (cont = 0; cont < size; cont++) {
            if (vet[cont] > greater_index) {
                greater_index = vet[cont];
            }
        }

        //2 - Média dos elementos
        float acumulador = 0;

        for (cont = 0; cont < size; cont++) {
            acumulador += vet[cont];
        }

        //3 - Ordem crescente
        boolean ordem_crescente = true;

        for (cont = 1; cont < size; cont++) {
            if (vet[cont] < vet[cont - 1]) {
                ordem_crescente = false;
            }
        }

        //4 - Ordem decrescente
        boolean ordem_decrescente = true;

        for (cont = 1; cont < size; cont++) {
            if (vet[cont] > vet[cont - 1]) {
                ordem_decrescente = false;
            }
        }

        //5 - Elemento existente
        int elem;
        boolean elem_exists = false;

        System.out.print("Elemento: ");
        elem = scanner.nextInt();

        for (cont = 0; cont < size; cont++) {
            if (vet[cont] == elem) {
                elem_exists = true;
            }
        }

        //6 - Ordem invertida
        int[] vet2 = new int[size];

        for (cont = 0; cont < size; cont++) {
            vet2[cont] = vet[(size - 1) - cont];
        }

        //7 - Números primos
        int num_pri = 0, cont2;
        boolean[] elem_pri = new boolean[size];

        for (cont = 0; cont < size; cont++) {
            elem_pri[cont] = true;
        }
        for (cont = 0; cont < size; cont++) {
            for (cont2 = 2; cont2 < vet[cont]; cont2++) {
                if (vet[cont] % cont2 == 0) {
                    elem_pri[cont] = false;
                }
            }
        }
        for (cont = 0; cont < size; cont++) {
            if (elem_pri[cont] == true) {
                num_pri += 1;
            }
        }

        System.out.println("1 - Maior elemento do vetor: " + greater_index);
        System.out.println("2 - Média dos elementos do vetor: " + (acumulador / size));
        System.out.println("3 - Ordem crescente: " + ordem_crescente);
        System.out.println("4 - Ordem decrescente: " + ordem_decrescente);
        System.out.println("5 - Elemento existe: " + elem_exists);
        System.out.println("6 - Ordem inversa:");
        for (cont = 0; cont < size; cont++) {
            System.out.println("  - Índice " + cont + ": " + vet2[cont]);
        }
        System.out.println("7 - Números primos: " + num_pri);
    }
}
