import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio5_1 {
    public static void main(String[] args) {
        String ruta = "C:\\Users\\dam1\\Desktop\\hola.txt";
        int contadorPalabras = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))){
            String linea;
            while((linea = br.readLine()) != null){
                linea = linea.trim();
                if(linea.isEmpty()){
                    continue;
                }
                String[] palabras = linea.split("\\s+");
                contadorPalabras += palabras.length;
            }
            System.out.println("El archivo contiene: " + contadorPalabras + " palabras ");

        } catch (IOException e){
            System.out.println("Error al leer el archivo: " +e.getMessage());
        }
    }
}
