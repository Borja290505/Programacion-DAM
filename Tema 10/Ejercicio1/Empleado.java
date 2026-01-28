package Ejercicio1;

public class Empleado {
    protected String nombre;
    protected Double salarioBase;

    public Empleado(String nombre, Double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario Base " + salarioBase);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
