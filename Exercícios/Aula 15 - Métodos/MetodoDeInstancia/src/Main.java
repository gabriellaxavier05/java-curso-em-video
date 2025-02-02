import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instanciando a classe 'Calculadora'
        Calculadora calc = new Calculadora();
        // Instanciando a classe Scanner para fazer leitura de dados informados pelo usuário
        Scanner leitura = new Scanner(System.in);

        // Chamando o método 'multiplicar' da classe 'Calculadora' e realizando um cálculo
        System.out.println("** MULTIPLICAÇÃO DE NÚMEROS COM MÉTODO INSTANCIADO **\n");
        System.out.println("-------------------------------------------------------\n");

        System.out.println("Informe o valor de a: ");
        int a = leitura.nextInt();
        System.out.println("Informe o valor de b: ");
        int b = leitura.nextInt();

        System.out.println("\nNúmeros informados: " + a + "e " + b);
        System.out.println("Multiplicação dos números informados: " + calc.multiplicar(a, b));
    }
}