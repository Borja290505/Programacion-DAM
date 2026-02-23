package Ejercicio3;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.Arrays;

public class DemoEjercicio3 {
    public static void main(String[] args) throws JsonProcessingException {
        Libreria libreria = new Libreria();
        LibroEjercicio3 b1 = new LibroEjercicio3("Clean Code", "Robert C. Martin", 2008);
        LibroEjercicio3 b2 = new LibroEjercicio3("Effective Java", "Joshua Bloch", 2018);

        libreria.aniadirLibros(b1);
        libreria.aniadirLibros(b2);

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String json = mapper.writeValueAsString(libreria);

        System.out.println("JSON de Library:");
        System.out.println(json);
    }
}




