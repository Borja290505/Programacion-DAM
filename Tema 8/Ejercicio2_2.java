import java.io.*;

public class Ejercicio2_2 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\dam1\\Desktop\\hola.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\dam1\\Desktop\\salida.txt")))
        {
            String linea;
            while((linea = br.readLine()) != null){
                bw.write(linea.toUpperCase());
                bw.newLine();
            }
            System.out.println("Archivo creado correctamente");
        }catch (IOException e){
            System.out.println("Error al leer el archivo");
        }
    }
}
