import java.util.Scanner;
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int numero = scanner.nextInt();
        System.out.println("Los divisores del numero " + numero + " son: ");
        for(int i = 1; i <= numero; i++){
            if(numero % i == 0){
                System.out.print(i + " ");
            }
        }


    }
}
