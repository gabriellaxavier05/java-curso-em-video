package com.metodoestaticoexemplo;

import java.util.Scanner;

public class Main {
    // Métodos estático (pertencentes à própria classe)
    // soma
    /*
    public static double somar(double a, double b){
        return a + b; // soma a e b
    }
    */

    // subtração
    /*
    public static double subtrair(double a, double b){
        return a - b; // subtrai b de a
    }
    */

    // multiplicação
    /*
    public static double multiplicar(double a, double b){
        return a * b; // multiplica a por b
    }
     */

    // divisão
    public static double dividir(double a, double b){
        if (b == 0) {
            return a; // se b for 0, retorna a (alternativa para a impossibilidade da divisão por 0)
        }
        return a / b; // divide a por b
    }


    public static void main(String[] args) {
        // Criando um objeto para fazer leitura de dados
        Scanner leitura = new Scanner(System.in);

        System.out.println("** EXERCÍCIO COM MÉTODO ESTÁTICO **\n");

        // Pedindo informações ao usuário
        System.out.println("Informe o 1o número: ");
        double n1 = leitura.nextDouble();
        System.out.println("Informe o 2o número: ");
        double n2 = leitura.nextDouble();

        System.out.println("\nOs números informados foram: " + n1 + " e " + n2);

        // Calculando as operações com os métodos estáticos criados e exibindo o resultado na tela
        /*
        System.out.printf("O resultado da soma dos números informados é %.1f\n", Main.somar(n1, n2));
        System.out.printf("O resultado da subtração dos números informados é %.1f\n", Main.subtrair(n1, n2));
        System.out.printf("O resultado da multiplicação dos números informados é %.1f\n", Main.multiplicar(n1, n2));
        */
        System.out.printf("O resultado da divisão dos números informados é %.1f", Main.dividir(n1, n2));

    }
}