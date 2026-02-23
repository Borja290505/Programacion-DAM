package Ejercicio1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class DemoEjercicio1 {
    public static void main(String[] args) throws Exception {

        // 1. Crear un libro
        Libro l1 = new Libro("Clean Code", "Robert C. Martin", 2008);

        // 2. Crear un ObjectMapper (Jackson)
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT); // JSON bonito

        // 3. Convertir el libro a JSON
        String json = mapper.writeValueAsString(l1);

        // 4. Mostrarlo por pantalla
        System.out.println(json);
    }
}