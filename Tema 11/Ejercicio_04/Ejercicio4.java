package Ejercicio_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> palabras = new ArrayList<>();

        System.out.print("¿Cuántas palabras quieres introducir? ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Introduce la palabra " + (i + 1) + ": ");
            String palabra = sc.nextLine();
            palabras.add(palabra);
        }

        System.out.println("Lista completa: " + palabras);

        System.out.print("Dime la palabra que quieres cambiar");
        String palabraCambio1 = sc.nextLine();
        if(palabras.contains(palabraCambio1)){
            System.out.println("La palabra esta en el array: ");
        }

        System.out.print("Dime la palabra que quieres cambiar");
        String palabraCambio2 = sc.nextLine();
        if(palabras.contains(palabraCambio2)){
            System.out.println("La palabra esta en el array: ");
        }

        int indice1 = palabras.indexOf(palabraCambio1);
        int indice2 = palabras.indexOf(palabraCambio2);
        String comodin;
        if (indice1 != -1) {
            palabras.set(indice1,palabraCambio2);
            palabras.set(indice2,palabraCambio1);
            System.out.print("Sustitucion realizada correctamente");
        }else {
            System.out.println("Alguna palabra no esta en la lista");
        }

        System.out.print("Lista final: " + palabras);



        sc.close();
    }
}