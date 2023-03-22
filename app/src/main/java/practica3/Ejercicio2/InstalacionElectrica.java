package practica3.Ejercicio2;

public class InstalacionElectrica extends InstalacionAbstraction {


    @Override
    public void pagar() {
        System.out.println("Instalacion Electrica> realizando "
                + metodoPagoImplementator.nombreFormaPago()
                + ", descuento de "
                + (int) (metodoPagoImplementator.descuento() * 100) + "%");
    }
}
