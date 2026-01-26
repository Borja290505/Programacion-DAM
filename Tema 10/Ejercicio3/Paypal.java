package Ejercicio3;

public class Paypal extends MetodoPago{
    String correoElectronico;

    public Paypal(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Se ha realizado el pago desde el paypal de: " + correoElectronico + " de: " + monto);
    }
}
