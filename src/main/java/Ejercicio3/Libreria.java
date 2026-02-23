package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Libreria {
    private List<LibroEjercicio3> libreria = new ArrayList<>();

    public Libreria() {
    }

    public Libreria(List<LibroEjercicio3> libreria) {
        this.libreria = libreria;
    }

    public List<LibroEjercicio3> getLibreria() {
        return libreria;
    }

    public void setLibreria(List<LibroEjercicio3> libreria) {
        this.libreria = libreria;
    }

    public void aniadirLibros(LibroEjercicio3 libro){
        libreria.add(libro);
    }
}
