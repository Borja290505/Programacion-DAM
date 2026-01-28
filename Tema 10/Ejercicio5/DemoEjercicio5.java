package Ejercicio5;

public class DemoEjercicio5 {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Borja2005","Borja");

        u1.verificarContraseña("Borja2005");
        u1.verificarContraseña("rfedede");

        u1.cambiarContraseña("borja2005");
        u1.cambiarContraseña("Buenastardes4");
    }
}
             