import java.io.IOException; //Importação da classe IOExcpetion para tratar exceções 


public class EntradaNaoFormatada {

    public static void main {String args[]} trhows IOException { //Clausula throws permite que um erro seja
                                                                //descartado, mesmo que ele ocorra
        System.out.println("Entrada Não Formatada!"); //Mensagem inicial
        System.out.print("Pressione um caractere:"); //Mensagem de orientação
        int i = System.out.println.read(); //Lê um caractere como inteiro
        System.out.println("ASCII =" + i); // Exibe o valor lido
    }
}