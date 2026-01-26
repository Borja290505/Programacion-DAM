package Ejercicio3;

public class DemoEjercicio3 {
    public static void main(String[] args) {
        Paypal p1 = new Paypal("borjaperezrtos@gmail.com");
        TarjetaCredito t1 = new TarjetaCredito("1231 1231 1595 4826");
        TransferenciaBancaria tb1 = new TransferenciaBancaria("ES85 0032 2562 1472");

        p1.procesarPago(500);
        t1.procesarPago(500);
        tb1.procesarPago(500);

    }
}
