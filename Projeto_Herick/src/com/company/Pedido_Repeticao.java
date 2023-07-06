package com.company;

import java.util.Scanner;

public class Pedido_Repeticao
{
    public static void main(String[] args)
    {
        String nome;
        int codigo, quantidade;
        boolean outro_pedido = true;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        nome = scanner.nextLine();
        while (outro_pedido == true) {
            System.out.print("Informe o código: ");
            codigo = scanner.nextInt();

            while (codigo < 100 || codigo > 104) {
                System.out.print("Códgo inválido! | Informe o código: ");
                codigo = scanner.nextInt();
            }

            System.out.print("Informe a quantidade de lanches: ");
            quantidade = scanner.nextInt();

            if (codigo == 100 || codigo == 103) {
                System.out.println("Preço: R$" + (15 * quantidade));
            } else if (codigo == 101) {
                System.out.println("Preço: R$" + (10 * quantidade));
            } else if (codigo == 102) {
                System.out.println("Preço: R$" + (12 * quantidade));
            } else if (codigo == 104) {
                System.out.println("Preço: R$" + (16 * quantidade));
            }
            System.out.print("Deseja fazer outro pedido (true/false)? ");
            outro_pedido = scanner.nextBoolean();
        }
    }
}