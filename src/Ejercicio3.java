import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceme un caracter");
        String entrada = scanner.nextLine();

        if (entrada.length() != 1){
            System.out.println("Introduce un solo caracter");
        }else{
            char caracter = entrada.charAt(0);

            if(Character.isAlphabetic(caracter)){
                System.out.println("Es una letra");
            } else{
                if (Character.isDigit(caracter)){
                    System.out.println("Es un caracter numerico");
                } else {
                    System.out.println("Es otro tipo de caracter");
                }
            }
        }
    }
}
