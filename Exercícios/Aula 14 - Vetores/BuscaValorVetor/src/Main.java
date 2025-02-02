/*
Crie um vetor com 4 números inteiros. Pergunte ao usuário um número e verifique se ele está presente no vetor.
Se o número estiver no vetor, imprima a posição (índice) em que ele foi encontrado. Caso contrário, imprima
uma mensagem informando que o número não foi encontrado.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Criando um objeto para leitura de dados
        Scanner leitura = new Scanner(System.in);

        // Criando o vetor para armazenar os números
        int [] numeros = new int[4];

        // Pedindo informações ao usuário:
        System.out.println("** BUSCA DE VALORES NO VETOR **");
        System.out.println("Informe 4 números: ");
        System.out.println("");

        // Criando o laço de repetição para pegar os 7 valores informados pelo usuário:
        for (int i = 0; i < 4; i++) {
            System.out.println((i+1) + "o número: ");
            numeros[i] = leitura.nextInt(); // armazena o valor lido na posição atual percorrida do vetor
        }

        // Pedindo ao usuário que informe o número que deseja encontrar no vetor criado
        System.out.println("\nQue número deseja encontrar no vetor? ");
        int numProcurado = leitura.nextInt();

        // Variável para identificar se o número foi encontrado:
        boolean encontrado = false;

        // Verificando se o número informado está no vetor criado:
        for (int c = 0; c < 4; c++) {
            if (numeros[c] == numProcurado) { // se o valor da posição atual percorrida do vetor for igual ao número procurado...
                encontrado = true;
                System.out.println("Número " + numProcurado + " encontrado na posição " + c);
                break; // interrompe o loop ao encontrar o número encontrado.
            }
        }
        // Se o número não foi encontrado:
        if (!encontrado){ // lembrando que '!' é uma negação. Se encontrado continuar sendo falso, então...
            System.out.println("\nNúmero " + numProcurado + " não encontrado! :s");
        }
    }
}