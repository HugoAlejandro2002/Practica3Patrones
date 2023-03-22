package practica3.Ejercicio2;

public abstract class InstalacionAbstraction { //Abstraccion
    protected MetodoPagoImplementator metodoPagoImplementator;

    public InstalacionAbstraction() {
        this.metodoPagoImplementator = new PagoEfectivo(); // Por defecto
    }

    public void setFormaPago(MetodoPagoImplementator metodoPagoImplementator) {
        this.metodoPagoImplementator = metodoPagoImplementator;
    }

    public abstract void pagar();

}
