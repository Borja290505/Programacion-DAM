import  java.util.Scanner;
public class ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();

        if(numero <= 0){
            System.out.println("Error, debes introducir un numero positivo, mayor que 0");
        }

        int cifras = 0;
        int temp = numero;
        while(temp > 0) {
            temp = temp/10;
            cifras++;
        }

        System.out.println("El número " + numero + " tiene " + cifras + " cifras.");
    }
}
