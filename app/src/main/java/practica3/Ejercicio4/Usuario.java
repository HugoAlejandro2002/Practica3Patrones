package practica3.Ejercicio4;

public class Usuario {
    private String nombreUsuario;
    private String correo;

    public Usuario(String nombreUsuario, String correo) {
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public Usuario setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        return this;
    }

    public String getCorreo() {
        return correo;
    }

    public Usuario setCorreo(String correo) {
        this.correo = correo;
        return this;
    }


}
