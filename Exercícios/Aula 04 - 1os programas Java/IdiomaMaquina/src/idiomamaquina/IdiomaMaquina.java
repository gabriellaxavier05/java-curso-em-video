package idiomamaquina;

import java.util.Locale; // Importação para uso da classe Locale

public class IdiomaMaquina {

    public static void main(String[] args) {
        // Criar um programa para descobrir o idioma da máquina (PC)
        
        // Usando a classe Locale para descobrir a região
        Locale local = Locale.getDefault(); // Uso da classe Locale e criação do objeto 'local'
        /* 
        Explicação: 
            - O método getDefault() retorna a localidade do sistema, que pode ser o idioma, país etc.
            - 'local' é um objeto criado da classe Locale contendo as informações sobre a localidade padrão do sistema
        */
        
        // Exibindo o idioma da máquina
        System.out.println("O idioma do seu computador é " + local.getLanguage()); // Retorna o idioma do objeto 'local', que armazenou a localidade da máquina
    }
    
}
