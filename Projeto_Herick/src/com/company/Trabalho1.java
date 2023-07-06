package com.company;

import java.util.Scanner;

public class Trabalho1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho_vet, tipo_vet;

        System.out.print("0 - Insira o tamanho do vetor: ");
        tamanho_vet = scanner.nextInt();

        boolean[] vet_bool = new boolean[tamanho_vet];
        String[] vet_string = new String[tamanho_vet];
        int[] vet_int = new int[tamanho_vet];
        float[] vet_float = new float[tamanho_vet];

        System.out.println("0 - Insira o tipo de dados do vetor: ");
        System.out.println("1 - boolean");
        System.out.println("2 - string");
        System.out.println("3 - int");
        System.out.println("4 - float");
        System.out.print("Escolha: ");
        tipo_vet = scanner.nextInt();
        while (tipo_vet < 1 || tipo_vet > 4) {
            System.out.print("Valor inválido! Escolha: ");
            tipo_vet = scanner.nextInt();
        }

        int escolha;
        boolean final_programa = false;
        int cont;

        while (!final_programa) {
            System.out.println("1 - Inserir todos elementos do vetor");
            System.out.println("2 - Mostrar todos elementos do vetor");
            System.out.println("3 - Buscar um elemento do vetor pelo seu índice");
            System.out.println("4 - Remover um elemento do vetor pelo seu índice");
            System.out.println("5 - Finalizar o programa");
            System.out.print("Escolha: ");
            escolha = scanner.nextInt();
            while (escolha < 1 || escolha > 5) {
                System.out.print("Valor inválido! Escolha: ");
                escolha = scanner.nextInt();
            }

            if (escolha == 1) {
                for (cont = 0; cont < tamanho_vet; cont++) {
                    System.out.print("Insira um valor para o índice " + cont + ": ");
                    if (tipo_vet == 1) { vet_bool[cont] = scanner.nextBoolean(); }
                    if (tipo_vet == 2) { vet_string[cont] = scanner.next(); }
                    if (tipo_vet == 3) { vet_int[cont] = scanner.nextInt(); }
                    if (tipo_vet == 4) { vet_float[cont] = scanner.nextFloat(); }
                }
            }
            if (escolha == 2) {
                for (cont = 0; cont < tamanho_vet; cont++) {
                    System.out.print("Índice " + cont + ": ");
                    if (tipo_vet == 1) { System.out.println("Índice " + cont + ": " + vet_bool[cont]); }
                    if (tipo_vet == 2) { System.out.println(vet_string[cont]); }
                    if (tipo_vet == 3) { System.out.println("Índice " + cont + ": " + vet_int[cont]); }
                    if (tipo_vet == 4) { System.out.println("Índice " + cont + ": " + vet_float[cont]); }
                }
            }
            if (escolha == 3) {
                cont = 0;
                System.out.print("Índice: ");
                cont = scanner.nextInt();
                while (cont < 0 || cont >= tamanho_vet) {
                    System.out.print("Valor inválido! Índice: ");
                    cont = scanner.nextInt();
                }
                if (tipo_vet == 1) { System.out.println("Índice " + cont + ": " + vet_bool[cont]); }
                if (tipo_vet == 2) { System.out.println("Índice " + cont + ": " + vet_string[cont]); }
                if (tipo_vet == 3) { System.out.println("Índice " + cont + ": " + vet_int[cont]); }
                if (tipo_vet == 4) { System.out.println("Índice " + cont + ": " + vet_float[cont]); }
            }
            if (escolha == 4) {
                cont = 0;
                System.out.print("Índice: ");
                cont = scanner.nextInt();
                while (cont < 0 || cont >= tamanho_vet) {
                    System.out.print("Valor inválido! Índice: ");
                    cont = scanner.nextInt();
                }
                if (tipo_vet == 1) {
                    if (vet_bool[cont] == true) {
                        vet_bool[cont] = false;
                    } else {
                        vet_bool[cont] = true;
                    }
                    System.out.println("Índice " + cont + ": " + vet_bool[cont]);
                }
                if (tipo_vet == 2) { vet_string[cont] = ""; System.out.println("Índice " + cont + ": " + vet_string[cont]); }
                if (tipo_vet == 3) { vet_int[cont] = 0; System.out.println("Índice " + cont + ": " + vet_int[cont]); }
                if (tipo_vet == 4) { vet_float[cont] = 0; System.out.println("Índice " + cont + ": " + vet_float[cont]); }
            }
            if (escolha == 5) {
                final_programa = true;
            }
        }
    }
}
