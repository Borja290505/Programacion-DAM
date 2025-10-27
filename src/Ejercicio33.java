import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        int n = numero;
        int divisor = 2;

        while (n > 1) {
            if (n % divisor == 0) {
                System.out.println(n + " | " + divisor);
                n /= divisor;
            } else {
                divisor++;
            }
        }

        System.out.println("1");

        scanner.close();
    }
}