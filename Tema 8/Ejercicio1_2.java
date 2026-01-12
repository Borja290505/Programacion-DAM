import java.io.File;
import java.lang.reflect.Parameter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.util.Scanner;
public class Ejercicio1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la direccion del fichero: ");
        String rutaArchivo = sc.nextLine().trim();
        sc.close();

        if(rutaArchivo.isEmpty()){
            System.out.println("Has introducido una ruta");
            return;
        }

        //Creamos la ruta del archivo
        Path ruta = Paths.get(rutaArchivo);
        File archivo = new File(rutaArchivo);

        //Mostramos la subcarpeta contenedora del archivo o directorio
        Path padre = ruta.getParent();
        if(padre != null){
            System.out.println("Subcarpeta contenedora: " + padre.toAbsolutePath());
        }else {
            System.out.println("La ruta no tiene carpeta contenedora");
        }

        //Root de la ruta
        System.out.println("Root de la ruta: " + ruta.getRoot());

        //Ruta absoluta del archivo o directorio
        System.out.println("Ruta absoluta: " + ruta.toAbsolutePath());

        //Mostar si existe o no
        if(Files.exists(ruta)){
            System.out.println("El archivo si que existe");

            //Mostrar si es un archivo o si es un directorio
            boolean esArchivo = Files.isRegularFile(ruta);
            boolean esDirectorio = Files.isDirectory(ruta);

            if(esArchivo){
                System.out.println("Es un archivo");
            }
            if(esDirectorio){
                System.out.println("Es un directorio");

                //Listamos el contenido de un determinado directorio
                File[] contenido = archivo.listFiles();
                if(contenido != null && contenido.length > 0){
                    for (File f : contenido){
                        System.out.println(" - " + f.getName());
                    }
                }
            }
        }else{
            System.out.println("El archivo no existe");
        }
    }
}
