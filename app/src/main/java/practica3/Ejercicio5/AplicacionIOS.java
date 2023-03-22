package practica3.Ejercicio5;

public class AplicacionIOS implements IAplicacionMovil {

    @Override
    public void login() {
        System.out.println("Aplicacion IOS> Login");
    }

    @Override
    public void logout() {
        System.out.println("Aplicacion IOS> Logout");
    }

    @Override
    public void reportes() {
        System.out.println("Aplicacion IOS> Reportes");
    }
}
