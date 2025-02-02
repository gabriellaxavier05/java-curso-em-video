/*
Crie um programa em Java que leia 5 números inteiros do usuário e os armazene em um vetor. Em seguida, calcule e exiba
a soma de todos os elementos do vetor.
*/

import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        // Criando um objeto para leitura de dados:
        Scanner leitura = new Scanner(System.in);

        // Criando o vetor de 5 posições:
        int [] numeros = new int[5];

        // Pedindo informações ao usuário:
        System.out.println("** SOMA DOS NÚMEROS DO VETOR**\n");
        System.out.println("Informe 5 números inteiros: ");

        // Criando o laço de repetição para que o usuário informe os dados 5x:
        for (int c = 0; c < 5; c++) {
            System.out.println("Informe o " + (c  + 1) + "o. número: ");
            numeros[c] = leitura.nextInt(); // armazena o valor lido na posição atual do vetor
        }

        int soma = 0;
        System.out.println(" ");
        System.out.println("-----------------------");
        System.out.println(" ");
        System.out.println("Soma dos números informados: ");


        // Calculando a soma dos números informados:
        for (int i = 0; i < 5; i++) {
            soma = soma + numeros[i];

        }
        System.out.println(soma);
    }
}