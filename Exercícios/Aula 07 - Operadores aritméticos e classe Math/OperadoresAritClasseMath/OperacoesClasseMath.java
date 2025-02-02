public class OperacoesClasseMath {

    public static void main(String[] args) {
        int x = 10;
        int y = 25;

        // Exercícios usando a classe Math

        // Retornando o valor absoluto de um número
        System.out.println("Valor absoluto de " + x + ": " + Math.abs(x));

        // Retornando a raiz quadrada de um número
        System.out.println("Raiz quadrada de " + x + ": " + Math.sqrt(x));

        // Retornando o valor máximo entre 2 números
        System.out.println("O valor máximo entre " + x + " e " + y + ": " + Math.max(x, y));

        // Retornando o valor mínimo entre 2 números
        System.out.println("O valor máximo entre " + x + " e " + y + ": " + Math.min(x, y));

        // Retornando o valor de x elevado a y
        System.out.println("O valor de 10 elevado a 2 é: " + Math.pow(10, 2));

        // Retornando o arrendamento de um número
        System.out.println("Arredondamento de 3.0490309: " + Math.round(3.0490309));

        // Retornando o exponencial de um número
        System.out.println("Exponencial de 17: " + Math.exp(17));

        // Retornando o log de um número
        System.out.println("Log de 17: " + Math.log(17));

        // Retornando um número aleatório entre 0 e 1
        double numAleatorio = Math.random();
        System.out.printf("Número aleatório entre 0 e 1: %.2f \n", numAleatorio);

        // Retornando um número aleatório entre 0 e 100
        int numAleatorioInt = (int) (Math.random() * 100); // Typecast; gera um número entre 0 e 100
        System.out.println("Número aleatório entre 0 e 100: " + numAleatorioInt);
    }
}
