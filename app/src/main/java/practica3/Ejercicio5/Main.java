package practica3.Ejercicio5;

public class Main {

    public static void main (String [] args){
        AplicacionAndroid aplicacionAndroid = new AplicacionAndroid();
        AplicacionIOS aplicacionIOS = new AplicacionIOS();
        AplicacionWindowsPhone aplicacionWindowsPhone = new AplicacionWindowsPhone();

        AdapterAplicacionWeb aplicacionWeb = new AdapterAplicacionWeb(new AplicacionWeb());
        AdapterAplicacionEscritorio aplicacionEscritorio = new AdapterAplicacionEscritorio(new AplicacionEscritorio());

        System.out.println("Aplicacion Android");
        aplicacionAndroid.login();
        aplicacionAndroid.logout();
        aplicacionAndroid.reportes();

        System.out.println("Aplicacion IOS");
        aplicacionIOS.login();
        aplicacionIOS.logout();
        aplicacionIOS.reportes();

        System.out.println("Aplicacion WindowsPhone");
        aplicacionWindowsPhone.login();
        aplicacionWindowsPhone.logout();
        aplicacionWindowsPhone.reportes();

        System.out.println("Aplicacion Web");
        aplicacionWeb.login();
        aplicacionWeb.logout();
        aplicacionWeb.reportes();

        System.out.println("Aplicacion Escritorio");
        aplicacionEscritorio.login();
        aplicacionEscritorio.logout();
        aplicacionEscritorio.reportes();
    }

}
