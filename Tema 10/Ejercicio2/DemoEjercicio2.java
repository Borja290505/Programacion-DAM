package Ejercicio2;

public class DemoEjercicio2 {
    public static void main(String[] args) {
        Auto a1 = new Auto("Mercedes",150,4,"GLC Coupe", 5);
        Motocicleta m1 = new Motocicleta("Suzuki",300,2,"YRS11",320.5);
        Camion c1 = new Camion("Volvo",400,12,"Carga maxima",13000.5);

        Vehiculos[] parking = {a1, m1, c1};
        for(Vehiculos v : parking){
            System.out.println();
            v.describirVehiculo();
        }
    }
}
