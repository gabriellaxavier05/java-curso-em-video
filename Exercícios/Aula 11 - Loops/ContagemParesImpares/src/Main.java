/*
Crie um programa que leia 5 números inteiros e, utilizando uma estrutura de repetição, conte quantos desses números
são pares e quantos são ímpares. Exiba o resultado ao final.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto para leitura de dados
        Scanner leitura = new Scanner(System.in);

        // Variáveis
        int c = 1; // contador
        int num, par = 0, impar = 0;

        do {
            System.out.println("Informe o " +c + "o. número inteiro: ");
            num = leitura.nextInt();
            c++;

            // Verificando se o número informado é par ou ímpar
            if (num % 2 == 0){ // se o resto de num dividido por 2 for igual a 0...
                par = par + 1; // contador de números pares
            }
            else {
                impar = impar + 1; // contador de números ímpares
            }
        } while (c <= 5);

        // Apresentando a quantidade de números pares e números impares
        System.out.println("\nTotal de números pares: " + par);
        System.out.println("Total de números ímpares: " + impar);
    }
}