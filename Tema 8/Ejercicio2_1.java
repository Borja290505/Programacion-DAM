import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2_1 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\dam1\\Desktop\\hola.txt"))){
            String linea;
            while((linea = br.readLine()) != null){
                System.out.println(linea);
            }

        } catch (IOException e){
            System.out.println("Error al leer el archivo");
        }

    }
}
