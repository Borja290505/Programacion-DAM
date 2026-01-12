import java.io.File;
import java.io.IOException;
import java.lang.reflect.Parameter;
import java.nio.file.*;
import java.sql.SQLOutput;
import java.nio.file.StandardCopyOption;

public class Ejercicio1_3 {
    public static void main(String[] args) {
        //Declaramos la ruta
        String direccion = "C:\\Users\\dam1\\Documents\\PRO_UD08_Ej03";

        //Definimos la ruta completa del archivo
        String originalFilePath = direccion + "\\Programacion.txt";

        //Crear el archivo si no existe
        File originalFile= new File(originalFilePath);
        if(!originalFile.exists()){
            try{
                Files.createDirectories(Path.of(direccion));
                Files.createFile(Path.of(originalFilePath));

            } catch (IOException e) {
                throw new RuntimeException(e);
            };
        }

        //Copiamos los archivos 2 veces en la carpeta
        try{
            Files.copy(originalFile.toPath(), Path.of(direccion + "\\Programacion(+1).txt" ), StandardCopyOption.REPLACE_EXISTING);
            Files.copy(originalFile.toPath(), Path.of(direccion + "\\Programacion(+2).txt" ), StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //Creamos la estructura docs/exercises en la carpeta DOCUMENTOS
        try {
            File dir = new File(direccion + "\\docs\\samples");
            if(!dir.exists()){
                if(dir.mkdirs()){
                    System.out.println("La estructura a sido creada");
                }else {
                    System.out.println("ERROR al crear la carpeta");
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            File dir = new File(direccion + "\\docs\\exercises");
            if(!dir.exists()){
                if(dir.mkdirs()){
                    System.out.println("La estructura a sido creada");
                }else {
                    System.out.println("ERROR al crear la carpeta");
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try{
            Files.copy(originalFile.toPath(), Path.of(direccion + "\\docs\\samples\\Programacion.txt"));
            System.out.println("Archivo progrmacion.txt copiado a docs//samples");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try{
            Files.move(originalFile.toPath(), Path.of(direccion + "\\docs\\exercises\\Programacion.txt"));
            System.out.println("Archivo progrmacion.txt movido a docs//exercises");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File renamedFile = new File(direccion + "\\Programacion(+1).txt");
        if(renamedFile.exists()){
            File renamedNewFile = new File(direccion + "\\Programacion.txt");
            if(renamedFile.renameTo(renamedNewFile)){
                System.out.println("Has renombrado el archivo");
            }else {
                System.out.println("ERROR al renombrar el archivo");
            }
        }

        File fileDelete = new File(direccion + "\\Programacion(+2).txt");
        if(fileDelete.exists()){
            if(fileDelete.delete()){
                System.out.println("El archivo se ha eliminado correctamente");
            }else {
                System.out.println("ERROR al eliminar el archivo");
            }
        }
    }
}
