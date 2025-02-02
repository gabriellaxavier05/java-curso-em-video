/*
Crie um programa que realize uma contagem regressiva de um número fornecido pelo usuário até 0, utilizando uma estrutura
de repetição. Após a contagem, exiba "FIM".
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto para leitura de dados
        Scanner leitura = new Scanner(System.in);

        System.out.println("** CONTAGEM REGRESSIVA **");
        System.out.println("Informe um número: ");
        int num = leitura.nextInt();

        // Contador:
        int c = num;

        System.out.println("\nContagem: ");

        // Fazendo a contagem regressiva usando while
        while (c >= 0){
            System.out.println(c);
            c = c - 1;
        }
        System.out.println("FIM.");
    }
}