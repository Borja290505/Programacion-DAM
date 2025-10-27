import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer numero");
        int numero1 = scanner.nextInt();

        System.out.println("Introduce el primer numero");
        int numero2 = scanner.nextInt();

        int multiplicando = numero1;
        int resultado = 0;

        System.out.print(multiplicando + " x " + numero2 + " = ");

        // Caso especial: si el segundo número es 0
        if (numero2 == 0) {
            System.out.print("0");
        }
        // Caso positivo: sumar numero1, numero2 veces
        else if (numero2 > 0) {
            for (int i = 1; i <= numero2; i++) {
                resultado += multiplicando;
                if (i == 1) {
                    System.out.print(multiplicando);
                } else {
                    System.out.print(" + " + multiplicando);
                }
            }
        }
        // Caso negativo: restar numero1, |numero2| veces
        else {
            for (int i = 1; i <= -numero2; i++) {
                resultado -= multiplicando;
                if (i == 1) {
                    System.out.print(multiplicando);
                } else {
                    System.out.print(" + " + multiplicando);
                }
            }
        }

        System.out.println(" = " + resultado);
    }
}