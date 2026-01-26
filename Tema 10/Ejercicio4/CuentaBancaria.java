package Ejercicio4;

import java.sql.SQLOutput;

public class CuentaBancaria {
    Integer numeroCuenta;
    String titularCuenta;
    Double saldo;

    public CuentaBancaria(Integer numeroCuenta, String titularCuenta, Double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titularCuenta = titularCuenta;
        this.saldo = saldo;
    }

    public void despositar(double monto){
        System.out.println("Has depositado " + monto + "€");
        saldo += monto;
    }
    public void retirar(double monto){
        System.out.println("Has retirado " + monto + "€");
        saldo -= monto;
    }

    public void mostrarSaldo(){
        System.out.println("Tienes un saldo de: " + saldo);
    }

    public String getTitularCuenta() {
        return titularCuenta;
    }

    public void setTitularCuenta(String titularCuenta) {
        this.titularCuenta = titularCuenta;
    }
}
