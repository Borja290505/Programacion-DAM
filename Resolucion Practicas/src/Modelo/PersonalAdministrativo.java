package Modelo;

import java.time.LocalDate;

public class PersonalAdministrativo extends Trabajador{
    private String departamento;
    private int nivel;
    private int complementoNivel=100;

    public PersonalAdministrativo(String apellidos, Double salarioBase, String nombre, LocalDate fechaIncorporacion, String dni, String departamento, int nivel) {
        super(apellidos, salarioBase, nombre, fechaIncorporacion, dni);
        this.departamento = departamento;
        this.nivel = nivel;
    }

    public PersonalAdministrativo(String nombre, String departamento, int nivel) {
        super(nombre);
        this.departamento = departamento;
        this.nivel = nivel;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String trabajar() {
        return "Estoy realizando tareas administrativas en el departamento de: " + departamento;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase()+(nivel*complementoNivel);
    }

    @Override
    public String toString() {
        return "PersonalAdministrativo{" +
                "complementoNivel=" + complementoNivel +
                ", departamento='" + departamento + '\'' +
                ", nivel=" + nivel +
                '}';
    }
}
