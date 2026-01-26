package Ejercicio1;

public class DemoEjercicio1 {
    public static void main(String[] args) {
        EmpleadoComun empleado1 = new EmpleadoComun("Borja", 1500.0);
        Gerente gerente1 = new Gerente("Santiago", 1500.0,500.0);

        System.out.println("MOSTRANDO INFO DE LOS EMPLEADOS");
        empleado1.mostrarInfo();

        System.out.println();
        System.out.println("MOSTRANDO INFO DE LOS GERENTES");
        gerente1.mostrarInfo();
    }
}
