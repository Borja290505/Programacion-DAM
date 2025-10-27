import java.util.Random;

public class Ejercicio31 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[10];

        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        System.out.println("Números generados:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1; // entre 1 y 100
            System.out.print(numeros[i] + " ");

            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        System.out.println("\nMáximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
    }
}
