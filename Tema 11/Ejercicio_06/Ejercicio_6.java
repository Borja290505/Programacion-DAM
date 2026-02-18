package Ejercicio_06;

import java.util.*;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Random rnd = new Random();

        int[] numeros = new int[30];

        // Rellenar con aleatorios entre 0 y 99
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(100); // 0..99
        }

        System.out.println("Array original:");
        System.out.println(Arrays.toString(numeros));


        ArrayList<Integer> numerosSinRepetir = new ArrayList<>();
        for (int i = 0; i < numeros.length; i++) {
            int num = numeros[i];
            if (!numerosSinRepetir.contains(num)) {
                numerosSinRepetir.add(num);
            }
        }

        System.out.println("Lista de números sin repetir (orden de primera aparición): " + numerosSinRepetir);
    }
}

