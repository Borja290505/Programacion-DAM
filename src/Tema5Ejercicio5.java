import java.util.Random;
import java.util.Scanner;
public class Tema5Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = 10;
        int maxValue = 100;
        Random r = new Random(System.currentTimeMillis());

        int array[] =   new int[length];
        for(int i = 0; i < array.length; i++){
            array[i] = r.nextInt(maxValue);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int numeroUsuario;

        while(true){
            System.out.print("Introduce un numero entero negativo para salir ");
            if(sc.hasNextInt()){
                numeroUsuario = sc.nextInt();
            }else{
                System.out.println("Entrada invalida intentalo de nuevo");
                sc.next();
                continue;
            }
            if(numeroUsuario < 0){
                System.out.println("El numero introducido es negativo");
                break;
            }

            boolean encontrado = false;
            for(int num: array){
                if(num == numeroUsuario){
                    encontrado = true;
                    break;
                }
            }

            if(encontrado){
                System.out.println("El numero si que esta en el array");
            }else {
                System.out.println("El numero no esta en el array");
            }
        }
        sc.close();
    }
}
