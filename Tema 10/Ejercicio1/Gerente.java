package Ejercicio1;

public class Gerente extends EmpleadoComun{
    private Double bono;

    public Gerente(String nombre, Double salarioBase, Double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    public Double getBono() {
        return bono;
    }

    public void setBono(Double bono) {
        this.bono = bono;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario Base " + salarioBase);
        System.out.println("Bono: " + bono);
    }
}
