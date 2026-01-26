package Ejercicio2;

public class Motocicleta extends Vehiculos {
    Double velocidadPunta;

    public Motocicleta(String marca, Integer potencia, Integer ruedas, String modelo, Double velocidadPunta) {
        super(marca, potencia, ruedas, modelo);
        this.velocidadPunta = velocidadPunta;
    }

    @Override
    public void describirVehiculo(){
        System.out.println("INFORMACION DE LA MOTOCICLETA");
        System.out.println("Marca: " + marca);
        System.out.println("Salario Base " + modelo);
        System.out.println("Potencia: " + potencia);
        System.out.println("Numero de ruedas: " + ruedas);
        System.out.println("Velocidad punta:" + velocidadPunta);
    }
}
