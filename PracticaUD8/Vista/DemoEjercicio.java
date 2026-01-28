package Vista;

import Modelo.Coche;
import Modelo.Concesionario;
import Modelo.Vehiculo;

public class DemoEjercicio {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo(2010,"Mercedes","9780KKL", "GLC Coupe", 150000.2);
        Vehiculo c1 = new Coche(2025,"KIA", "4569POI", "PORTYQ",1500.9,4,"Diesel");

        Concesionario rimauto = new Concesionario();

        rimauto.getVehiculos().add(c1);
        rimauto.getVehiculos().add(v1);

        System.out.println("VEHICULOS EN EL CONCESIONARIO");
        rimauto.mostrarVehiculos();

        System.out.println("VEHICULOS MAS ANTIGUOS");
        System.out.println("El vehiculo mas antiguo es: " + rimauto.vehiculoMasAntiguo());


        System.out.println("El vehiculo tiene una antiguedad de: " + v1.cacularAntiguedad());
    }
}
