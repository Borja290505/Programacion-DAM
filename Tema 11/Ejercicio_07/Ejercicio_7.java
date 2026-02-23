package Ejercicio_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas palabras quieres añadir");
        int numero = sc.nextInt();
        sc.nextLine();


        List<String> palabras1 = new ArrayList<>();
        for (int i = 0; i < numero; i++) {
            System.out.print("Introduce la palabra " + (i + 1) + ": ");
            String palabra = sc.nextLine();
            palabras1.add(palabra);
        }
        System.out.println("Lista de palabras 1: " + palabras1);

        List<String> palabras2 = new ArrayList<>();
        for (int i = 0; i < numero; i++) {
            System.out.print("Introduce la palabra " + (i + 1) + ": ");
            String palabra = sc.nextLine();
            palabras2.add(palabra);
        }
        System.out.println("Lista de palabras 2: " + palabras2);


        System.out.println("Lista de palabras que aparecen en las 2 listas: ");

        List<String> palabras2Listas = new ArrayList<>();
        for (int i = 0; i < palabras1.size(); i++) {
            for (int j = 0; j < palabras2.size(); j++) {
                if (palabras1.get(i).equalsIgnoreCase(palabras2.get(j))){
                    palabras2Listas.add(palabras1.get(i));
                }
            }
        }

        System.out.println(palabras2Listas);


        System.out.println("Lista de palabras que solo aparecen en la lista 1");
        System.out.println(palabras1);

        System.out.println("Lista de palabras que solo aparecen en la lista 2");
        System.out.println(palabras2);


        List<String> unionListas = new ArrayList<>();
        for (String p1 : palabras1){
            unionListas.add(p1);
        }
        for (String p2 : palabras2){
            unionListas.add(p2);
        }

        System.out.println("Lista de palabras que aparecen en alguna de las 2 lista");
        System.out.println(unionListas);

    }
}
