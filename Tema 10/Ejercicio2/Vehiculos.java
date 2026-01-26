package Ejercicio2;

public class Vehiculos {
    Integer ruedas;
    Integer potencia;
    String marca;
    String modelo;

    public Vehiculos(String marca, Integer potencia, Integer ruedas, String modelo) {
        this.marca = marca;
        this.potencia = potencia;
        this.ruedas = ruedas;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getRuedas() {
        return ruedas;
    }

    public void setRuedas(Integer ruedas) {
        this.ruedas = ruedas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public void describirVehiculo(){
        System.out.println("Marca: " + marca);
        System.out.println("Salario Base " + modelo);
        System.out.println("Potencia: " + potencia);
        System.out.println("Numero de ruedas " + ruedas);
    }
}
