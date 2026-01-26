package Ejercicio2;

public class Auto extends Vehiculos{
    Integer numeroPuertas;

    public Auto(String marca, Integer potencia, Integer ruedas, String modelo, Integer numeroPuertas) {
        super(marca, potencia, ruedas, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void describirVehiculo(){
        System.out.println("INFORMACION DEL AUTO");
        System.out.println("Marca: " + marca);
        System.out.println("Salario Base " + modelo);
        System.out.println("Potencia: " + potencia);
        System.out.println("Numero de ruedas: " + ruedas);
        System.out.println("Numero de puertas:" + numeroPuertas);
    }
}
