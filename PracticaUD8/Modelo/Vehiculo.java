package Modelo;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;

public class Vehiculo {
    private String marca;
    private String modelo;
    private Integer anioFabricacion;
    private String matricula;
    private Double precio;

    //Constructor solo con matricula
    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    //Constructo con marca y modelo
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    //Constructor con todos los parametros
    public Vehiculo(Integer anioFabricacion, String marca, String matricula, String modelo, Double precio) {
        this.anioFabricacion = anioFabricacion;
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
        this.precio = precio;
    }

    public void describirVehiculo(){
        System.out.println("Vehículo marca " + marca + ", modelo: " + modelo +
                ", año: " + anioFabricacion + ", matrícula: " + matricula +
                ", precio:" + precio);
    }


    public Integer cacularAntiguedad(){
        Integer anioActual = Year.now().getValue();
        return anioActual - anioFabricacion;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
