package horadosistema;

import java.util.Date; // Importação da classe Date

public class HoraDoSistema {

    public static void main(String[] args) {
        // Criar um programa para mostrar data e hora atual
        
        // Usando a classe Date 
        Date relogio = new Date(); // Necessário importar a classe em questão. 
        /* A palavra 'new' é usada para criar um objeto. Nesse caso, está sendo criado o objeto 'relogio' a partir da classe Date, que 
        foi impartada
        */
        
        // Exibindo mensagem para o usuário
        System.out.println("A hora do sistema é ");
        System.out.println(relogio.toString()); // apresenta a hora do sistema e chama o método 'toString' para converter a data em String
    }
    
}
