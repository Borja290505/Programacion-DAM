import java.util.Scanner;

public class Ejercicio4_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cambioLetras="[aeiouAEIOU]";
        System.out.println("Introduce un frase");
        String frase = sc.nextLine();
        String resultado =frase.replaceAll(cambioLetras,"*");
        System.out.println(resultado);
    }
}
