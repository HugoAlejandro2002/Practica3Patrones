package practica3.Ejercicio2;

public class PagoEfectivo implements MetodoPagoImplementator {
    @Override
    public double descuento() {
        return 0;
    }

    @Override
    public String nombreFormaPago() {
        return "pago en efectivo";
    }
}
