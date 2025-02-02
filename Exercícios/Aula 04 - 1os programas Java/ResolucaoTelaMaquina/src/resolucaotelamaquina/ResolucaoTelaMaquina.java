package resolucaotelamaquina;

import java.awt.Dimension; // Importação da classe Dimension para armazenar a resolução da tela (representa dimensão altura e largura)
import java.awt.Toolkit; // Importação da classe Toolkit, que permite interagir com o ambiente gráfico do sistema através dos seus métodos. Dá pra pegar informações da tela

public class ResolucaoTelaMaquina {

    public static void main(String[] args) {
        // Crie um programa que descubra a resolução de tela da máquina que o executa
        
        // Criando um objeto a partir da classe Dimension
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        /*
        Explicação do código acima:
            - Toolkit.getDefaultToolkit() retorna informações do ambiente gráfico
            - getScreenSize() retorna a resolução da tela em pixels (largura e altura)
            - As informações obtidas são armazenas no objeto 'tela' da classe Dimension, que funciona como uma variável
        */
        
        // Exibindo os resultados para o usuário
        System.out.println("Resolução da tela: " + tela.width + "px x " + tela.height + "px"); // Apresenta a largura e altura 
        
    }
    
}
