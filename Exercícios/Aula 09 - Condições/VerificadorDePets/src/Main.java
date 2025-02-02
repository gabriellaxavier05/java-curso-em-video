/*
Crie um programa que identifique o tipo de pet que a pessoa tem.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto para leitura de dados
        Scanner leitura = new Scanner(System.in);

        // Fazendo a leitura de dados
        System.out.println("Você tem pets? 1- Sim, 2- Não ");
        int resp = leitura.nextInt();

        if (resp == 1){
            System.out.println("Seu pet faz: 1- 'AU AU AU', 2- 'MIAU MIAU MIAU'? ");
            int falaPet = leitura.nextInt();
                if (falaPet == 1){
                    System.out.println("Que legal! Seu pet é um cãozinho! :D");
                }
                else {
                    System.out.println("Hummmm! Você tem um gatinho! <3");
                }
        }
        else {
            System.out.println("Desculpe, não vai dar para fazer uma brincadeira contigo! :/");
        }
    }
}