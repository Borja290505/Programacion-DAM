package Ejercicio3;

public class TarjetaCredito extends MetodoPago{
    String numeroTarjeta;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Se ha realizado el pago desde la tarjeta: " + numeroTarjeta + " de: " + monto);
    }
}
