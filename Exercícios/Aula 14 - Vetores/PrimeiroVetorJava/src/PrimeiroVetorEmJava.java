// Criar um vetor de inteiros com 5 elementos e inicializá-lo com valores dados. Depois, imprimir todos os valores.

public class PrimeiroVetorEmJava {
    public static void main(String[] args) {
        // Criando o vetor:
        int[] vetor = {10, 20, 30, 40, 50}; // Vetor do tipo inteiro com 5 posições

        // Criando o contador para usar no laço de repetição:
        int c = 0;

        System.out.println("** PRIMEIRO PROGRAMA EM JAVA USANDO VETOR :D **");

        // Exibindo o vetor usando laço de repetição
        while (c < vetor.length){
            System.out.println("Número atual do vetor: " + vetor[c]);
            c++; // incremento
        }
    }
}