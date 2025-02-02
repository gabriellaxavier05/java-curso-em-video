package com.metodoestaticoexemplo;

import java.util.Scanner;

public class Main {
    // Método estático (pertencente à própria classe)
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

        // Calculando a divisão com o método estático criado e exibindo o resultado pro usuário
        System.out.printf("O resultado da divisão dos números informados é %.1f", Main.dividir(n1, n2));
    }
}