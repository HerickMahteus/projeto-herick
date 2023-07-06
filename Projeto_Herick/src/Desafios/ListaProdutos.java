package Desafios;

import java.util.Random;
import java.util.Scanner;

public class ListaProdutos {

    public static void mostrarProdutos(String [][] matriz, int linhas, int colunas) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("======================================================");
        System.out.println("Produto | Quantidade | Valor");
        for (int i = 0; i < linhas; i++) {
            System.out.print((i+1) + " - ");
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static void inserirProdutos(String [][] matriz, int linhas, int colunas) {
        Scanner scanner = new Scanner(System.in);
        int linha;

        mostrarProdutos(matriz, linhas, colunas);

        System.out.println("======================================================");
        System.out.println("Batata: R$2,00 | Cenoura: R$3,00 | Frango: R$5,00");
        System.out.print("Insira o nome do produto: ");
        matriz[linhas-1][0] = scanner.next();
        while (!matriz[linhas-1][0].equals("Batata") && !matriz[linhas-1][0].equals("Cenoura") && !matriz[linhas-1][0].equals("Frango") ) {
            System.out.println("Produto não encontrado!");
            System.out.print("Insira o nome do produto: ");
            matriz[linhas-1][0] = scanner.next();
        }
        System.out.print("Insira a quantidade de produtos: ");
        linha = scanner.nextInt();
        while (linha <= 0) {
            System.out.print("Insira um valor positivo!: ");
            linha = scanner.nextInt();
        }
        matriz[linhas-1][1] = Integer.toString(linha);
        switch (matriz[linhas-1][0]) {
            case "Batata":
                matriz[linhas-1][2] = Float.toString(2.0f * Integer.parseInt(matriz[linhas-1][1]));
                break;
            case "Cenoura":
                matriz[linhas-1][2] = Float.toString(3.0f * Integer.parseInt(matriz[linhas-1][1]));
                break;
            case "Frango":
                matriz[linhas-1][2] = Float.toString(5.0f * Integer.parseInt(matriz[linhas-1][1]));
                break;
        }
        System.out.println("Produto adicionado.");
        mostrarProdutos(matriz, linhas, colunas);
    }

    public static void removerProduto(String [][] matriz, int linhas, int codigoProduto) {
        matriz[codigoProduto][0] = null;
        matriz[codigoProduto][1] = null;
        matriz[codigoProduto][2] = null;
        System.out.println("Produto removido.");
        for (int i = codigoProduto; i < linhas - 1; i++) {
            matriz[i][0] = matriz[i+1][0];
            matriz[i][1] = matriz[i+1][1];
            matriz[i][2] = matriz[i+1][2];
        }
    }

    public static void alterarQuantidade(String [][] matriz, int linhas, int colunas, int codigoProduto) {
        Scanner scanner = new Scanner(System.in);
        int linha;
        System.out.print("Insira a quantidade de produtos: ");
        linha = scanner.nextInt();
        while (linha <= 0) {
            System.out.print("Insira um valor positivo!: ");
            linha = scanner.nextInt();
        }
        matriz[codigoProduto][1] = Integer.toString(linha);
        System.out.println("Quantidade alterada!");
        mostrarProdutos(matriz, linhas, colunas);
    }

    public static float jogoDeAdivinhacao(float grana, int limite) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        float aposta;
        int numero, x;

        System.out.print("Aposta: ");
        aposta = scanner.nextFloat();
        while (aposta <= 0 || aposta > grana) {
            System.out.println("Valor inválido!");
            System.out.print("Aposta: ");
            aposta = scanner.nextFloat();
        }
        x = random.nextInt(limite);
        x += 1;
        System.out.print("Adivinhe o número entre 1 e " + limite + ": ");
        numero = scanner.nextInt();
        if (numero == x) {
            grana += aposta;
        }
        if (numero < x) {
            if (numero > (x - 10.0f)) {
                grana += aposta * ((10.0f - (x - numero)) / 10.0f);
            }
            if (numero < (x - 10.0f)) {
                grana -= aposta * (((x - numero) - 10) / 10.0f);
            }
        }
        if (numero > x) {
            if (numero < (x + 10.0f)) {
                grana += aposta * ((10 - (numero - x)) / 10.0f);
            }
            if (numero > (x + 10.0f)) {
                grana -= aposta * (((numero - x) - 10.0f) / 10.0f);
            }
        }
        System.out.println("Número: " + x);
        return grana;
    }

    public static void main(String[] args) {
        String [][] lista, lista2;
        int produtos = 0;
        int limite = 40;
        int opcao, codigoProduto;
        int colunas = 3;
        float saldo = 12;
        float gasto = 0;
        boolean apostaFeita = false;
        Scanner scanner = new Scanner(System.in);

        lista = new String[produtos][colunas];

        System.out.println(" 1 - Inserir produtos na lista de compras. " +
                "\n 2 - Remover produto da lista de compras. " +
                "\n 3 - Alterar a quantidade de um produto" +
                "\n 4 - Efetuar compra" +
                "\n 5 - Jogo de Adivinhação" +
                "\n 6 - Sair.");

        do {
            System.out.println("======================================================");
            Float valorFinal = 0.0f;
            for (int i = 0; i < produtos; i++) {
                valorFinal = valorFinal + Float.parseFloat(lista[i][2]);
            }
            System.out.println("Preço final: R$" + valorFinal + " | Sua grana: R$" + saldo + " | Dinheiro gasto até agora (pontuação): R$" + gasto);
            System.out.print("Opção escolhida (0 para mostrar opções): ");
            opcao = scanner.nextInt();
            while (opcao < 0 || opcao > 6) {
                System.out.print("Opção inválida! ");
                opcao = scanner.nextInt();
            }
            switch(opcao) {
                case 0:
                    System.out.println(" 1 - Inserir produtos na lista de compras. " +
                            "\n 2 - Remover produto da lista de compras. " +
                            "\n 3 - Alterar a quantidade de um produto" +
                            "\n 4 - Efetuar compra" +
                            "\n 5 - Jogo de Adivinhação" +
                            "\n 6 - Sair.");
                    break;
                case 1:
                    produtos += 1;
                    lista2 = lista;
                    lista = new String[produtos][colunas];
                    for (int i = 0; i < produtos - 1; i++) {
                        for (int j = 0; j < colunas; j++) {
                            lista[i][j] = lista2[i][j];
                        }
                    }
                    inserirProdutos(lista, produtos, colunas);
                    break;
                case 2:
                    System.out.println("======================================================");
                    System.out.print("Insira o código do produto (de 1 a " + produtos + "): ");
                    codigoProduto = scanner.nextInt();
                    while (codigoProduto <= 0 || codigoProduto > produtos) {
                        System.out.println("Código inválido! " + "Insira o código do produto (de 1 a " + produtos + "): ");
                        codigoProduto = scanner.nextInt();
                    }
                    removerProduto(lista, produtos, codigoProduto - 1);
                    produtos -= 1;
                    lista2 = lista;
                    lista = new String[produtos][colunas];
                    for (int i = 0; i < produtos; i++) {
                        for (int j = 0; j < colunas; j++) {
                            lista[i][j] = lista2[i][j];
                        }
                    }
                    mostrarProdutos(lista, produtos, colunas);
                    break;
                case 3:
                    System.out.println("======================================================");
                    System.out.print("Insira o código do produto (de 1 a " + produtos + "): ");
                    codigoProduto = scanner.nextInt();
                    while (codigoProduto <= 0 || codigoProduto > produtos) {
                        System.out.println("Código inválido! " + "Insira o código do produto (de 1 a " + produtos + "): ");
                        codigoProduto = scanner.nextInt();
                    }
                    alterarQuantidade(lista, produtos, colunas, codigoProduto - 1);
                    break;
                case 4:
                    System.out.println("======================================================");
                    if (valorFinal <= saldo) {
                        if (valorFinal != 0) {
                            gasto += valorFinal;
                            saldo -= valorFinal;
                            produtos = 0;
                            lista = new String[produtos][colunas];
                            apostaFeita = false;
                            System.out.println("Compra feita!");
                        } else {
                            System.out.println("Carrinho vazio!");
                        }
                    } else {
                        System.out.println("Dinheiro insuficiente!");
                    }
                    break;
                case 5:
                    if (!apostaFeita) {
                        saldo = jogoDeAdivinhacao(saldo, limite);
                        limite += 2;
                        apostaFeita = true;
                    } else {
                        System.out.println("======================================================");
                        System.out.println("Faça alguma compra para poder jogar de novo!");
                    }
                    break;
                case 6:
                    break;
            }
        } while (opcao != 6 && saldo > 2);
        if (opcao != 6) {
            System.out.println("======================================================");
            System.out.println("Você foi à falência! | Sua grana: R$" + saldo + " | Pontuação: " + gasto);
        }
    }
}
