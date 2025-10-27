import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el ancho del rectángulo: ");
        int ancho = scanner.nextInt();
        System.out.print("Introduce el alto del rectángulo: ");
        int alto = scanner.nextInt();

        if (ancho < 2 || alto < 2) {
            System.out.println("El ancho y el alto deben ser al menos 2 para formar un rectángulo hueco.");
            return;
        }

        for (int fila = 0; fila < alto; fila++) {
            if (fila == 0 || fila == alto - 1) {
                // Primera o última fila: todo asteriscos
                for (int i = 0; i < ancho; i++) {
                    System.out.print("*");
                }
            } else {
                // Filas intermedias: asterisco + espacios + asterisco
                System.out.print("*");
                for (int i = 0; i < ancho - 2; i++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}