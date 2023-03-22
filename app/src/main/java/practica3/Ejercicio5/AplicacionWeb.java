package practica3.Ejercicio5;

public class AplicacionWeb implements IApliacionNuevaEmpresa {

    @Override
    public void iniciarSesion() {
        System.out.println("Aplicacion Web> Iniciar sesion");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Aplicacion Web> Cerrar sesion");
    }

    @Override
    public void generacionDatos() {
        System.out.println("Aplicacion Web> Generacion de datos");
    }
}
