public class ExercicioSemRetorno {
    public static void imprimirNumeros(int[] numeros) {
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

    public static void somaNumeros(int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println("A soma dos números é: " + soma);
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("Array inicial:");
        imprimirNumeros(numeros);

        somaNumeros(numeros);

        System.out.println("Array após a soma:");
        imprimirNumeros(numeros);
    }
}
