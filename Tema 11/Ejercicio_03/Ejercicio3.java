package Ejercicio_03;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[50];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(100);
        }

        System.out.println("Tres números distintos entre 0 y 99:");
        System.out.println(Arrays.toString(numeros));

        System.out.println("Introduceme un numero");
        int buscado = sc.nextInt();

        int contador = 0;
        for (int n : numeros){
            if (n == buscado){
                contador++;
            }
        }

        System.out.println("El numero " + buscado + " aparece " + contador + " veces");
    }
}
