import java.util.Scanner;

public class TiposPrimitivos {

    // método principal
    public static void main(String[] args){
        /*
        // variável do tipo float:
        float nota = 8.5f;
        // variável String
        String nome = "Gabriella";

        // saída de dados do tipo float:
        // Jeito 1: System.out.print("A nota é " + nota);
        // Jeito 2: System.out.println("A nota é " + nota);
        // System.out.printf("A nota é %.2f", nota);
        // Explicação do código acima: o .2f significa 2 casas decimais depois da vírgula

        // Saída de dados dupla:
        System.out.format("A nota de %s é %.1f", nome, nota);
        */

        // criando um objeto da classe Scanner para realizar leitura de dados
        Scanner teclado = new Scanner(System.in);

        // fazendo a leitura de dados informados pelo usuário:
        System.out.print("Digite o nome do(a) aluno(a): ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do(a) aluno(a): ");
        float nota = teclado.nextFloat();

        // apresentação:
        System.out.format("A nota de %s é %.1f", nome, nota);
    }

}