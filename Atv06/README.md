# Aluno 
João Eduardo Marques


# Curso 
## Tecnologia em Análise e Desenvolvimento de Sistemas - IPFR


# Código

```
package Atv06;

import java.util.Scanner;

public class Atv06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor do depósito fixo mensal: ");
        double depositoMensal = input.nextDouble();

        System.out.print("Informe o montante desejado: ");
        double montanteDesejado = input.nextDouble();

        double saldoAtual = 0.0;
        int meses = 0;

        while (saldoAtual < montanteDesejado) {
            saldoAtual += depositoMensal;
            saldoAtual += saldoAtual * 0.005; // juros mensais de 0,5%
            meses++;
        }

        System.out.println("Serão necessários " + meses + " meses para acumular o montante desejado.");

        input.close();
    }
    
    
}


```
