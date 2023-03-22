package practica3.Ejercicio3;

public class Archivo implements Component{
    private String nombreArchivo;
    private String contenido;

    public Archivo(String nombreArchivo, String contenido) {
        this.nombreArchivo = nombreArchivo;
        this.contenido = contenido;
    }
    public Archivo setContenido(String contenido) {
        this.contenido = contenido;
        return this;
    }

    public Archivo setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        return this;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    @Override
    public int getNumeroPalabras() {
        return this.contenido.split(" ").length;
    }

    @Override
    public String getInfo() {
        return this.nombreArchivo + " > numero de palabras: " + this.getNumeroPalabras();
    }

    @Override
    public void showInfo() {
        System.out.println(this.getInfo());
    }
}
