package practica3.Ejercicio5;

public class AdapterAplicacionEscritorio implements IAplicacionMovil {
    private AplicacionEscritorio aplicacionEscritorio;

    public AdapterAplicacionEscritorio(AplicacionEscritorio aplicacionEscritorio) {
        this.aplicacionEscritorio = aplicacionEscritorio;
    }
    public AplicacionEscritorio getAdaptee() {
        return aplicacionEscritorio;
    }

    public void setAdaptee(AplicacionEscritorio aplicacionWeb) {
        this.aplicacionEscritorio = aplicacionWeb;
    }

    @Override
    public void login() {
        aplicacionEscritorio.iniciarSesion();
    }

    @Override
    public void logout() {
        aplicacionEscritorio.cerrarSesion();
    }

    @Override
    public void reportes() {
        aplicacionEscritorio.generacionDatos();
    }
}
