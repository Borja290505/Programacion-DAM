package Ejercicio_08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceme una frase");
        String frase = sc.nextLine();

        List<Character> letras = new ArrayList<>();

        for (int k = 0; k < frase.length(); k++){
            char c  = frase.charAt(k);
            if (Character.isLetter(c)){
                letras.add(c);
            }
        }

        Collections.sort(letras);
         int i = 0;
         while(i < letras.size()) {
             char letra = letras.get(i);
             int contador = 1;
             int j = i+1;

             while(j < letras.size() && letras.get(j) == letra) {
                 contador++;
                 j++;
             }

             System.out.println(letra + " -> " + contador);

             i = j;
         }
    }
}


