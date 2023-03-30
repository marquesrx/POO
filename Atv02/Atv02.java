package Atv02;

import java.util.Scanner;

public class Atv02 {     

        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);

            int  a, c, b;
            
            //exibir mensagem solicitando um inteiro
            
            System.out.print("Informe um valor inteiro: ");
            
            c = sc.nextInt();

            //atribuir o produto de b e c para a
            b = 5;            
            a = (b * c);

            System.out.println("O produto de B * C é: " + a);
    
            //Este programa realiza um cálculo de exemplo de folha de pagamento
            
            sc.close();
        }
}

