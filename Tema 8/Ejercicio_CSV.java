import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio_CSV {
    public static void main(String[] args) {
        String archivoCSV = "C:\\Users\\dam1\\Desktop\\DATA.csv";
        List<String[]> registros = leerCSV(archivoCSV);

        if (registros.isEmpty()) {
            System.out.println("No se pudieron leer los datos del archivo.");
            return;
        }

        System.out.println("--- Registros con país España o Portugal ---");
        filtrarPais(registros, "ES", "PT");

        System.out.println("\n--- Registros con email de dominios .edu ---");
        filtrarDominio(registros, ".edu");

        System.out.println("\n--- Registros con email de yahoo ---");
        filtrarYahoo(registros);
    }
    private static List<String[]>  leerCSV(String archivoCSV){
        List<String[]> registros = new ArrayList<>();
        String linea = " ";
        String separacionCSV = ","; //Cada vez que hay un salto de linea, es un nuevo objeto

        try(BufferedReader br = new BufferedReader(new FileReader(archivoCSV))){
            br.readLine();
            while((linea = br.readLine()) != null){
                String[] datos = linea.split(separacionCSV);
                registros.add(datos);

            }
        } catch (Exception e) {
            System.err.println("Error al leer el archivo CSV: " + e.getMessage());
        }

        return registros;
    }

    private static void filtrarPais(List<String[]> registros, String pais1, String pais2){
        for(String[] datos : registros){
            String pais = datos[7];
            if(pais.toUpperCase().equals(pais1) || pais.toUpperCase().equals(pais2)){
                mostrarDatos(datos);
            }
        }

    }

    private static void filtrarDominio(List<String[]> registros, String dominio){
        for (String[] datos : registros){
            String email = datos[6];
            if(email.endsWith(dominio)){
                mostrarDatos(datos);
            }
        }
    }

    private static void filtrarYahoo(List<String[]> registros){
        for (String[] datos : registros){
            String email = datos[6];
            if(email.matches(".*@yahoo\\.[a-zA-Z]{2,3}(\\.[a-zA-Z]{2})?")){
                mostrarDatos(datos);
            }
        }
    }

    private static void mostrarDatos(String[] datos){
        System.out.println(datos[7] + " " +  datos[1] + " " + datos[2] + " " +  datos[6] + " " +  datos[9]);
    }
}
