package Modelo;

import java.util.ArrayList;
import java.util.List;

public class CentroEducativo {
    private ArrayList<Trabajador> trabajadores;

    public CentroEducativo(ArrayList<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }

    public CentroEducativo() {
        this.trabajadores = new ArrayList<>();
    }

    public CentroEducativo(String segundoChomon) {
    }

    public void AniadirTrabajador(Trabajador t){
        trabajadores.add(t);
    }

    public void mostrarTrabajadores(){
        System.out.println("LISTADO DE TRABAJADORES");
        for(Trabajador t : trabajadores){
            System.out.println(t.toString());
        }
    }

    public double salarioMedio(){
        Double salarioMedio = 0.0;
        if (trabajadores.isEmpty()) {
            return 0;
        }else{
            for(Trabajador t : trabajadores){
                salarioMedio += t.calcularSalario();
            }
        }
        return salarioMedio/trabajadores.size();
    }

    public void mayorAntiguedad() {
        if (trabajadores.isEmpty()) {
            System.out.println("No ha trabajadores en el centro");
        } else {
            Trabajador trabajadorMasAntiguo = trabajadores.get(0);
            for (Trabajador t : trabajadores) {
                if (t.antiguedadAnios() >= trabajadorMasAntiguo.antiguedadAnios()) {
                    System.out.println("El trabajador mas antiguo es: " + trabajadorMasAntiguo.toString());
                }
            }
        }
    }

    public List<Trabajador> buscarPorNombres(String nombre){
        List<Trabajador> resultados = new ArrayList<>();
        for(Trabajador t : trabajadores){
            if(t.getNombre().toLowerCase().contains(nombre.toLowerCase())){
                resultados.add(t);
            }
        }
        return resultados;
    }

    public List<Trabajador> buscarPorTipo(String tipo){
        List<Trabajador> resultados = new ArrayList<>();
        for(Trabajador t : trabajadores){
           if(tipo.equalsIgnoreCase("Profesor") && t instanceof Profesor){
               resultados.add(t);
           } else if (tipo.equalsIgnoreCase("PersonalAdministrativo") && t instanceof PersonalAdministrativo) {
               resultados.add(t);
           }
        }
        return resultados;
    }

    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }
}
