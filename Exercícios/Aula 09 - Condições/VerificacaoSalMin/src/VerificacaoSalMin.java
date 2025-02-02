/*
    Crie um programa que leia o salário de um usuário e informe se o salário lido está abaixo ou acima do salário mínimo.
    Salário mínimo em 2024: R$ 1.412,00
 */

import java.util.Scanner;

public class VerificacaoSalMin {
    public static void main(String[] args) {
        // criando um objeto para fazer leitura de dados?
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe o seu salário em R$: ");
        double sal = leitura.nextDouble(); // armazena o valor informado na variável sal

        // verificando se o salário lido é maior, menor ou igual ao valor do salário mínimo em 2024
        System.out.println("Salário mínimo em 2024: R$ 1.412,00");
        System.out.println("-------------------------------------");

        if (sal < 1412.00){
            System.out.printf("Seu salário: R$ %.2f \n", sal);
            System.out.println("Valor abaixo do salário mínimo de 2024.");
        }
        else if (sal == 1412.00){
            System.out.println("Seu salário é o mesmo de um salário mínimo.");
        }
        else {
            System.out.printf("Seu salário: R$ %.2f \n", sal);
            System.out.println("Valor acima do salário mínimo de 2024.");
        }
    }
}