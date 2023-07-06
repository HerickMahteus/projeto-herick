package com.company;

import java.util.Scanner;

public class ListaDeCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int produto, qt = 0;
        int[] quantidade = new int[2];
        boolean mac = true;
        float dinheiro, preço;

        System.out.print("Grana: ");
        dinheiro = scanner.nextFloat();
        while (mac) {
            System.out.print("Produto: ");
            produto = scanner.nextInt();
            qt = quantidade[produto];
            System.out.print("Quantidade: ");
            qt += scanner.nextInt();
            while (qt < 0) {
                System.out.println("Quantidade negativa!");
                System.out.print("Quantidade: ");
                qt += scanner.nextInt();
            }
            quantidade[produto] += qt;
            System.out.println("Tomates: " + quantidade[0] + ", Água: " + quantidade[1] + ", Carne: " + quantidade[2]);
            System.out.print("Mais alguma coisa? ");
            mac = scanner.nextBoolean();
        }
        preço = (quantidade[0] * 3) + (quantidade[1] * 5) + (quantidade[2] * 8);
        System.out.println("Valor a pagar: " + preço);
        while (preço > dinheiro) {
            System.out.println("Dineiro insuficiente! Remova algum produto");
        }
    }
}
