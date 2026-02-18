package Ejercicio_02;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ejercicio2 {
    public static void main(String[] args) {
        Random rnd = new Random();

        Set<Integer> numero = new HashSet<>();

        while(numero.size() < 3){
            int n = rnd.nextInt(10);
            numero.add(n);
        }

        System.out.println("Tres números distintos entre 0 y 9:");
        System.out.println(numero);
    }
}
