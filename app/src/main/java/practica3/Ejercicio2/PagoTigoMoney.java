package practica3.Ejercicio2;

public class PagoTigoMoney implements MetodoPagoImplementator {
    @Override
    public double descuento() {
        return 0.02;
    }

    @Override
    public String nombreFormaPago() {
        return "pago por tigo money";
    }
}
