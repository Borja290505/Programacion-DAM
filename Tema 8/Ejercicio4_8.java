import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio4_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String texto = sc.nextLine();
        String regexCaracterEspecial = "(?<!\\S)(?=\\S*[@#%&$/*])\\S+(?!\\S)";
        Pattern pattern = Pattern.compile(regexCaracterEspecial);
        Matcher matcher = pattern.matcher(texto);

        boolean encontrado = false;
        while (matcher.find()) {
            if (!encontrado) {
                System.out.println("Las palabras con un caracter especial son:");

                encontrado = true;
            }
            System.out.println("- " + matcher.group());
        }

        if (!encontrado) {
            System.out.println("Ninguna palabra lleva un caracter especial");
        }

    }
}
