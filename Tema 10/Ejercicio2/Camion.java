package Ejercicio2;

public class Camion extends Vehiculos{
    Double cargaMaximaAutorizada;

    public Camion(String marca, Integer potencia, Integer ruedas, String modelo, Double cargaMaximaAutorizada) {
        super(marca, potencia, ruedas, modelo);
        this.cargaMaximaAutorizada = cargaMaximaAutorizada;
    }

    @Override
    public void describirVehiculo(){
        System.out.println("INFORMACION DEL CAMION");
        System.out.println("Marca: " + marca);
        System.out.println("Salario Base " + modelo);
        System.out.println("Potencia: " + potencia);
        System.out.println("Numero de ruedas: " + ruedas);
        System.out.println("Carga Maxima Autorizada:" + cargaMaximaAutorizada);
    }
}
