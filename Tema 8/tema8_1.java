import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.nio.*;

public class tema8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la ruta del archiovo");
        String rutaArchivo = sc.nextLine();

        Path fichero = Paths.get(rutaArchivo);

        //Directorio raiz del archivo
        Path raiz = fichero.getRoot();
        System.out.println("Directorio raiz: " + raiz);

        //Directorio donde esta el archivo
        Path directorio = fichero.getParent();
        System.out.println("Directorio del archivo: " + directorio);


        String nombre = fichero.getFileName().toString();

        //Nombre del archivo
        System.out.println("Nombre del archivo: " + nombre.substring(0,nombre.lastIndexOf('.')));

        //Extension del archivo
        System.out.println("Extension: " + nombre.substring(nombre.lastIndexOf('.')));

        //Comprobar si existe
        if(Files.exists(fichero)){
            System.out.println("El fichero si que existe");
        }else{
            System.out.println("El fichero no existe");
        }
    }
}
