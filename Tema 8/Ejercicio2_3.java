import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2_3 {
    public static void main(String[] args) {
        int contador = 0;
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\dam1\\Desktop\\hola.txt"))){
            int c;
            while((c = br.read()) != -1){
                if(c =='a' || c == 'A'){
                    contador++;
                }

            }
            System.out.println("La letra 'A' aparece " + contador);

        } catch (IOException e){
            System.out.println("Error al leer el archivo");
        }

    }
}
