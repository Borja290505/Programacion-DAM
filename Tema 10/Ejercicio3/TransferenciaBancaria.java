package Ejercicio3;

public class TransferenciaBancaria extends  MetodoPago{
    String IBAN;

    public TransferenciaBancaria(String IBAN) {
        this.IBAN = IBAN;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Se ha realizado el pago desde la cuenta: " + IBAN + " de: " + monto);
    }
}
