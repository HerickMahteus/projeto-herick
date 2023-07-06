package com.company;

import java.util.Scanner;

public class Numero_Primo {
    public static void main(String[] args) {
        boolean repeat = true;
        while (repeat) {
            int numero, cont = 0;
            boolean primo = true;
            Scanner scanner = new Scanner(System.in);

            System.out.print("Número: ");
            numero = scanner.nextInt();

            for (cont = 2; cont < numero; cont++) {
                if (numero % cont == 0) {
                    primo = false;
                }
            }

            if (primo) {
                System.out.println("O número é primo");
            } else {
                System.out.println("O número não é primo");
            }
            System.out.print("Repetir? ");
            repeat = scanner.nextBoolean();
        }
    }
}
