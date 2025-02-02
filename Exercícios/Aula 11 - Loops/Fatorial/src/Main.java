/*
Crie um programa que leia um número N e calcule seu fatorial utilizando uma estrutura de repetição. O fatorial de um
número N é o produto de todos os números de 1 até N
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto para leitura de dados
        Scanner leitura = new Scanner(System.in);

        // Fazendo a elitura de dados
        System.out.println("** FATORIAL **");
        System.out.println("Informe um número inteiro: ");
        int n = leitura.nextInt();

        int fat = 1;

        // Calculando o fatorial
        for (int c = n; c > 1; c--){
            fat = fat * c;
        }

        // Apresentação dos resultados:
        System.out.println("\nNúmero informado: " + n);
        System.out.println("Fatorial de " + n + ": " + fat);
    }
}