package Modelo;

import java.time.LocalDate;
import java.time.Period;

abstract class Trabajador {
    private String nombre;
    private String apellidos;
    private String dni;
    private LocalDate fechaIncorporacion;
    private Double salarioBase;

    public Trabajador(String nombre) {
        this.nombre = nombre;
    }

    public Trabajador(String nombre, LocalDate fechaIncorporacion) {
        this.nombre = nombre;
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public Trabajador(String apellidos, Double salarioBase, String nombre, LocalDate fechaIncorporacion, String dni) {
        this.apellidos = apellidos;
        this.salarioBase = salarioBase;
        this.nombre = nombre;
        this.fechaIncorporacion = fechaIncorporacion;
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public abstract double calcularSalario();

    public String trabajar(){
        return "Estoy trabajando en el centro educativo";
    }
    public int antiguedadAnios(){
        return Period.between(fechaIncorporacion,LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "apellidos='" + apellidos + '\'' +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaIncorporacion=" + fechaIncorporacion +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
