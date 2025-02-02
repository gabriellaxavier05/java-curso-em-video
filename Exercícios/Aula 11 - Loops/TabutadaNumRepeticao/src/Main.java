import java.util.Scanner;

/*
Crie um programa que calcule a tabuada de um número informado pelo usuário
 */

public class Main {
    public static void main(String[] args) {
        // Criando um objeto para leitura de dados
        Scanner leitura = new Scanner(System.in);

        // Pedindo pro usuário informar um número
        System.out.println("** CÁLCULO DE TABUADA **");
        System.out.println("Informe um número: ");

        // Fazendo a leitura de dados
        int numero = leitura.nextInt();

        // Cálculo e apresentação da tabuada usando while
        /*
        int c = 1;
        while (c <= 10) {
            int tabuada = numero * c;
            System.out.println("Tabuada de " + numero + " x " + c + " = " + tabuada);
            c = c + 1;
        }
         */

        // Cálculo e apresentação da tabuada usando do while
        /*
        int c = 1;
        do {
            int tabuada = numero * c;
            System.out.println("Tabuada de " + numero + " x " + c + " = " + tabuada);
            c = c + 1;
        } while (c <= 10);
         */

        // Cálculo e apresentação da tabuada usando for
        for (int c = 1; c <= 10; c++) {
            int tabuada = numero * c;
            System.out.println("Tabuada de " + numero + " x " + c + " = " + tabuada);
        }
    }
}