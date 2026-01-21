import java.util.Scanner;

public class Ejercicio3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INTRODUCEME UNA CADENA DE CARACTERES: ");
        String texto = sc.nextLine();
        //Cambiamos todos los espacios que hay al principio de la cadena por el caracter sin espacios
        //Cambiamos el resto de los espacios segidos por un solo espacio
        String textoSinEspacios = texto.replaceAll("^\\s+","").replaceAll("\\s+"," ");
        System.out.println(textoSinEspacios);
    }
}
