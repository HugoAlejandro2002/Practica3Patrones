package practica3.Ejercicio4;


public class Proxy implements IServer {
    private IServer servidor1;
    private IServer servidor2;
    private int usuariosLogueados;

    public Proxy(){
        servidor1 = new Servidor("Servidor 1");
        servidor2 = new Servidor("Servidor 2");
        usuariosLogueados = 0;
    }
    @Override
    public void loqin(Usuario usuario, String password) {
        if(verificarDatos(usuario, password)) {
            if(usuariosLogueados % 2 == 0) {
                servidor1.loqin(usuario, password);
            } else {
                servidor2.loqin(usuario, password);
            }
            usuariosLogueados++;
        }else{
            System.out.println("Usuario o contraseña incorrectos");
        }
    }
    @Override
    public void showUsuariosLogueados(){
        servidor1.showUsuariosLogueados();
        servidor2.showUsuariosLogueados();
    }

    public boolean verificarDatos(Usuario usuario, String password){
        return usuario.getNombreUsuario().equals(password);
    }
}
