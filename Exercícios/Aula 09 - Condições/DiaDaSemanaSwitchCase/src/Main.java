import java.util.Scanner;

/*
Crie um programa que verifique o dia da semana conforme informação passada pelo usuário.
*/
public class Main {
    public static void main(String[] args) {
        // Criando um objeto para fazer a leitura de dados:
        Scanner leitura = new Scanner(System.in);

        // Fazendo a leitura de dados
        System.out.println("Informe o dia da semana (1, 2, 3, 4, 5, 6 ou 7): ");
        int diaSem = leitura.nextInt();

        switch (diaSem){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido!");
        }
    }
}