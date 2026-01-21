import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException; // Cambio de IIOException a IOException
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio3_1 {
    public static int contadorPalabrasArchivos(String nombreArchivo){
        int contadorPalabras = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))){
            String linea;
            Pattern patron = Pattern.compile("\\w+");

            while((linea = br.readLine()) != null){
                Matcher matcher = patron.matcher(linea);
                while(matcher.find()){
                    contadorPalabras++;
                }
            }
        }catch (IOException e){
            System.out.println("No se ha podido leer el archivo");
        }
        return contadorPalabras;
    }

    public static void main(String[] args) {
        String rutaArchivo = "C:\\Users\\dam1\\Desktop\\hola.txt";
        int cantidadPalabrasContadas = contadorPalabrasArchivos(rutaArchivo);
        System.out.println("El numero total de palabras es de: " + cantidadPalabrasContadas);
    }
}
