package practica3.Ejercicio4;

public class Main {

    public static void main(String[] args) {
        Proxy proxy = new Proxy();

        Usuario usuario1 = new Usuario("usuario1", "usuario1@email.com");
        Usuario usuario2 = new Usuario("usuario2", "usuario2@email.com");
        Usuario usuario3 = new Usuario("usuario3", "usuario3@email.com");
        Usuario usuario4 = new Usuario("usuario4", "usuario4@email.com");
        Usuario usuario5 = new Usuario("usuario5", "usuario5@email.com");
        Usuario usuario6 = new Usuario("usuario6", "usuario6@email.com");
        Usuario usuario7 = new Usuario("usuario7", "usuario7@email.com");
        Usuario usuario8 = new Usuario("usuario8", "usuario8@email.com");
        Usuario usuario9 = new Usuario("usuario9", "usuario9@email.com");

        proxy.loqin(usuario1, "usuario1");
        proxy.loqin(usuario2, "usuario2");
        proxy.loqin(usuario3, "usuario3");
        proxy.loqin(usuario4, "usuario45");
        proxy.loqin(usuario5, "usuario5");
        proxy.loqin(usuario6, "usuario56");
        proxy.loqin(usuario7, "usuario7");
        proxy.loqin(usuario8, "usuario8");
        proxy.loqin(usuario9, "usuario9");

        proxy.showUsuariosLogueados();

    }
}
