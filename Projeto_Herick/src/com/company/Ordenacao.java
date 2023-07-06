package com.company;

import java.util.Scanner;

public class Ordenacao
{
    public static void main(String[] args)
    {
        int num1, num2, num3, num4, num5;
        int seq1, seq2, seq3 = 0, seq4 = 0, seq5 = 0;
        Scanner scanner = new Scanner(System.in);

        //1º número
        System.out.print("1º número: ");
        num1 = scanner.nextInt();
        while (num1 <= 0) {
            System.out.print("Insira um valor positivo: ");
            num1 = scanner.nextInt();
        }
        seq1 = num1;

        //2º número
        System.out.print("2º número: ");
        num2 = scanner.nextInt();
        while (num2 <= 0) {
            System.out.print("Insira um valor positivo: ");
            num2 = scanner.nextInt();
        }
        if (num2 > num1) {
            seq2 = num2;
        } else {
            seq1 = num2;
            seq2 = num1;
        }

        //3º número
        System.out.print("3º número: ");
        num3 = scanner.nextInt();
        while (num3 <= 0) {
            System.out.print("Insira um valor positivo: ");
            num3 = scanner.nextInt();
        }
        if (num3 > seq2 && num3 > seq1) {
            seq3 = num3;
        } else if (num3 <= seq2 && num3 > seq1) {
            seq3 = seq2;
            seq2 = num3;
        } else if (num3 <= seq2 && num3 <= seq1) {
            seq3 = seq2;
            seq2 = seq1;
            seq1 = num3;
        }

        //4º número
        System.out.print("4ª número: ");
        num4 = scanner.nextInt();
        while (num4 <= 0) {
            System.out.print("Insira um valor positivo: ");
            num4 = scanner.nextInt();
        }
        if (num4 > seq3 && num4 > seq2 && num4 > seq1) {
            seq4 = num4;
        } else if (num4 <= seq3 && num4 > seq2 && num4 > seq1) {
            seq4 = seq3;
            seq3 = num4;
        } else if (num4 <= seq3 && num4 <= seq2 && num4 > seq1) {
            seq4 = seq3;
            seq3 = seq2;
            seq2 = num4;
        } else if (num4 <= seq3 && num4 <= seq2 && num4 <= seq1) {
            seq4 = seq3;
            seq3 = seq2;
            seq2 = seq1;
            seq1 = num4;
        }

        //5º número
        System.out.print("5ª número: ");
        num5 = scanner.nextInt();
        while (num5 <= 0) {
            System.out.print("Insira um valor positivo: ");
            num5 = scanner.nextInt();
        }
        if (num5 > seq4 && num5 > seq3 && num5 > seq2 && num5 > seq1) {
            seq5 = num5;
        } else if (num5 <= seq4 && num5 > seq3 && num5 > seq2 && num5 > seq1) {
            seq5 = seq4;
            seq4 = num5;
        } else if (num5 <= seq4 && num5 <= seq3 && num5 > seq2 && num5 > seq1) {
            seq5 = seq4;
            seq4 = seq3;
            seq3 = num5;
        } else if (num5 <= seq4 && num5 <= seq3 && num5 <= seq2 && num5 > seq1) {
            seq5 = seq4;
            seq4 = seq3;
            seq3 = seq2;
            seq2 = num5;
        } else if (num5 <= seq4 && num5 <= seq3 && num5 <= seq2 && num5 <= seq1) {
            seq5 = seq4;
            seq4 = seq3;
            seq3 = seq2;
            seq2 = seq1;
            seq1 = num5;
        }

        System.out.println("Ordem crescente: " + seq1 + ", " + seq2 + ", " + seq3 + ", " + seq4 + ", " + seq5);
    }
}
