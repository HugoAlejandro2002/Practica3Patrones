package practica3.Ejercicio5;

public class AdapterAplicacionWeb implements IAplicacionMovil {
    private AplicacionWeb aplicacionWeb;

    public AdapterAplicacionWeb(AplicacionWeb aplicacionWeb) {
        this.aplicacionWeb = aplicacionWeb;
    }
    public AplicacionWeb getAdaptee() {
        return aplicacionWeb;
    }

    public void setAdaptee(AplicacionWeb aplicacionWeb) {
        this.aplicacionWeb = aplicacionWeb;
    }

    @Override
    public void login() {
        aplicacionWeb.iniciarSesion();
    }

    @Override
    public void logout() {
        aplicacionWeb.cerrarSesion();
    }

    @Override
    public void reportes() {
        aplicacionWeb.generacionDatos();
    }
}
