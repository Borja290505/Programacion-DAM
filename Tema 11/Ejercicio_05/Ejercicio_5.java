package Ejercicio_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_5 {
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

        System.out.print("Dime la palabra que quieres eliminar");
        String palabraEliminar = sc.nextLine();
        if(palabras.remove(palabraEliminar)){
            System.out.println("La palabra ha sido eliminada");
        }
        System.out.println("Lista completa: " + palabras);
    }
}
