public class TesteTipos {

    // método principal
    public static void main(String[] args){
        // convertendo de int para String
        /*
        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);
        */

        // convertendo de String para int
        /*
        String valor = "30";
        int idade = Integer.parseInt(valor);
        System.out.println(idade);
        */

        // convertendo de String para float
        String valor = "30.5";
        float num = Float.parseFloat(valor);
        System.out.printf("Valor convertido de String para float: %.2f", num);
    }
}