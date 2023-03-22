package practica3.Ejercicio2;

public class InstalacionAgua extends InstalacionAbstraction {


    @Override
    public void pagar() {
        System.out.println("Instalacion Agua> realizando "
                + metodoPagoImplementator.nombreFormaPago()
                + ", descuento de "
                + (int) (metodoPagoImplementator.descuento() * 100) + "%");
    }
}
