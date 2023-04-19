# Aluno 
João Eduardo Marques


# Curso 
## Tecnologia em Análise e Desenvolvimento de Sistemas - IPFR 


# Código

```
package Atv02;

// importação da Classe Scanner
import java.util.Scanner;

public class Atv02 {     

        public static void main(String[] args) {
            
            // criando a instancia sacanner para receber o valor
            Scanner sc = new Scanner(System.in);

            //declaração de variaveis 
            int  a, c, b;
            
            //exibir mensagem solicitando um inteiro
            
            System.out.print("Informe um valor inteiro: ");
            
            //atribuindo o valor digitado utlizando a instancia scanner para a variavel c
            c = sc.nextInt();

            //atribuir o produto de b e c para a
            b = 5;            
            a = (b * c);

            //Exibindo o resultado do produto
            System.out.println("O produto de B * C é: " + a);
    

            //Este programa realiza um cálculo de exemplo de folha de pagamento
            
            
            //fechando a Classe Scanner!
            sc.close();
        }
}

```
