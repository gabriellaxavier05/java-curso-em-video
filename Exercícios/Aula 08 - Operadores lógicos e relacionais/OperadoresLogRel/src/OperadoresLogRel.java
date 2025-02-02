public class OperadoresLogRel {

    public static void main (String[] args){
        // Exemplo 1: usando operadores relacionais
        /*
        int a = 5;
        int b = 10;
        System.out.println("** Verificando o que é verdadeiro e o que é falso **\n");
        System.out.println("a == b");
        System.out.println(a == b);  // false
        System.out.println("--------------------");

        System.out.println("a != b");
        System.out.println(a != b);  // true
        System.out.println("--------------------");

        System.out.println("a > b");
        System.out.println(a > b);   // false
        System.out.println("--------------------");

        System.out.println("a < b");
        System.out.println(a < b);   // true
        System.out.println("--------------------");

        System.out.println("a >= b");
        System.out.println(a >= b);  // false
        System.out.println("--------------------");

        System.out.println("a <= b");
        System.out.println(a <= b);  // true
        System.out.println("--------------------");
        */

        // Exemplo 2: usando operadores lógicos
        boolean x = true;
        boolean y = false;

        System.out.println("** Verificando qual expressão é verdadeira e qual é falsa **\n");

        System.out.println("x && y");
        System.out.println(x && y);  // false (porque y é false)
        System.out.println("--------------------");

        System.out.println("x || y");
        System.out.println(x || y);  // true (porque x é true)
        System.out.println("--------------------");

        System.out.println("!x");
        System.out.println(!x);      // false (inverte o valor de x)
        System.out.println("--------------------");
    }
}