import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class  Ejercicio2_4 {
    public static void main(String[] args) {
        String rutaArchivo = "\\C:\\Users\\dam1\\Desktop\\hola.txt";

        contarLetras(rutaArchivo);

    }
    public static void contarLetras(String ruta){
        int[] Letras = new int[26];
        try(BufferedReader br = new BufferedReader(new FileReader(ruta))){
            int caracterInt;
            while((caracterInt = br.read()) != -1){
                char caracter = (char) caracterInt;
                if(caracter >= 'a' && caracter <= 'z'){
                    Letras[caracter-'a']++;
                }
            }

            System.out.println("Frecunecia de las letras: ");
            for(int i = 0; i < Letras.length; i++){
                char letra = (char) (i + 'a');
                if (Letras[i] > 0){
                    System.out.println(Character.toUpperCase(letra) + ": " + Letras[i]);
                }
            }
        }catch (IOException e){
            System.out.println("No se puede leer el archivo");
        }
    }
}
