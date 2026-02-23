package Ejercicio1;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DemoEjercicio2 {
    public static void main(String[] args) throws Exception {

        String json = "{\n" +
                "  \"titulo\" : \"Clean Code\",\n" +
                "  \"autor\" : \"Robert C. Martin\",\n" +
                "  \"añioPublicacion\" : 2008\n" +
                "}";

        ObjectMapper mapper = new ObjectMapper();


        Libro libro = mapper.readValue(json, Libro.class);

        System.out.println("Deserializado:");
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Año: " + libro.getAñioPublicacion());
    }
}