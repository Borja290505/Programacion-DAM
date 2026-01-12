import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la direccion del fichero: ");
        String rutaArchivo = sc.nextLine().trim();
        sc.close();

        if(rutaArchivo.isEmpty()){
            System.out.println("No se ha introducido ninguna ruta");
            return;
        }

        //Creamos la ruta que el usuario nos ha introducido
        Path ruta = Paths.get(rutaArchivo).normalize().toAbsolutePath();

        //Muestra el directorio raiz
        Path raizArchivo = ruta.getRoot();
        System.out.println(raizArchivo);

        //Muestra el directorio en el que esta el archivo
        Path direcctorio = ruta.getParent();
        System.out.println(direcctorio);

        //Muestra el nombre del archivo
        Path nombreArchivo =  ruta.getFileName();
        System.out.println(nombreArchivo);

        //Muestra la extension del archivo
        System.out.println(rutaArchivo.substring(rutaArchivo.lastIndexOf('.')));

        //Comprueba si existe el fichero en la ruta
        boolean existe =  Files.exists(ruta);
        System.out.println(existe);
    }

}
