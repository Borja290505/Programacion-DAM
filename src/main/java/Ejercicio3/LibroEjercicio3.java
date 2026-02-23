package Ejercicio3;

public class LibroEjercicio3 {
    private String titulo;
    private String autor;
    private int añioPublicacion;

    public LibroEjercicio3() {}

    public LibroEjercicio3(String autor, String titulo, int añioPublicacion) {
        this.autor = autor;
        this.titulo = titulo;
        this.añioPublicacion = añioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAñioPublicacion() {
        return añioPublicacion;
    }

    public void setAñioPublicacion(int añioPublicacion) {
        this.añioPublicacion = añioPublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Ejercicio_1{" +
                "autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", añioPublicacion=" + añioPublicacion +
                '}';
    }
}
