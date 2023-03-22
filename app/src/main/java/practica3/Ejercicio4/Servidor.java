package practica3.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Servidor implements IServer {
    private List<Usuario> usuariosLogueados;
    private String nombreServidor;

    public Servidor(String nombreServidor){
        this.nombreServidor = nombreServidor;
        usuariosLogueados = new ArrayList<Usuario>();
    }

    @Override
    public void loqin(Usuario usuario, String password) {
        System.out.println("Servidor: " + nombreServidor + "> Usuario: " + usuario.getNombreUsuario() + " logueado");
        usuariosLogueados.add(usuario);
    }

    @Override
    public void showUsuariosLogueados(){
        System.out.println("Servidor: " + nombreServidor + "> Usuarios logueados: ");
        for(Usuario usuario : usuariosLogueados){
            System.out.println("- Usuario: " + usuario.getNombreUsuario());
        }
    }

    public List<Usuario> getUsuariosLogueados(){
        return usuariosLogueados;
    }
}
