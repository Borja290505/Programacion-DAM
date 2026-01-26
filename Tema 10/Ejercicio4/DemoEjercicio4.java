package Ejercicio4;

public class DemoEjercicio4 {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria(890268, "Borja Ros", 15000.9);
        c1.mostrarSaldo();

        System.out.println();
        c1.retirar(5000);

        System.out.println();
        c1.mostrarSaldo();

        System.out.println();
        c1.despositar(1000);

        System.out.println();
        c1.mostrarSaldo();
    }
}
