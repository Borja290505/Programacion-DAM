package Modelo;

import java.time.LocalDate;

public class Profesor extends Trabajador{
    private String especialidad;
    private int horasLectivasSemanales;
    private int precioHora = 20;

    public Profesor(String apellidos, Double salarioBase, String nombre, LocalDate fechaIncorporacion, String dni, String especialidad, int horasLectivasSemanales) {
        super(apellidos, salarioBase, nombre, fechaIncorporacion, dni);
        this.especialidad = especialidad;
        this.horasLectivasSemanales = horasLectivasSemanales;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getHorasLectivasSemanales() {
        return horasLectivasSemanales;
    }

    public void setHorasLectivasSemanales(int horasLectivasSemanales) {
        this.horasLectivasSemanales = horasLectivasSemanales;
    }

    public Profesor(String nombre, double v, double v1, LocalDate fechap1, String especialidad, String rosPerez, String mates, int i) {
        super(nombre);
        this.especialidad = especialidad;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (horasLectivasSemanales*precioHora);
    }

    @Override
    public String trabajar() {
        return "Estoy impartiendo clase de " + especialidad;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "especialidad='" + especialidad + '\'' +
                ", horasLectivasSemanales=" + horasLectivasSemanales +
                ", precioHora=" + precioHora +
                '}';
    }
}
