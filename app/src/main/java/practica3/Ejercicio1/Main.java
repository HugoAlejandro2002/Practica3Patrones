package practica3.Ejercicio1;

public class Main {

    public static void main (String []args){

        Personaje elfoNocturno = new ElfoNocturno("Legolas");
        elfoNocturno = new AgregarTipoArma(elfoNocturno, TipoArma.ESPADA);
        elfoNocturno = new AgregarEscudo(elfoNocturno, new Escudo());
        elfoNocturno = new AgregarPocionCuracion(elfoNocturno, new PocionCuracion());
        elfoNocturno = new AgregarTipoArma(elfoNocturno, TipoArma.HACHA);

        elfoNocturno.showCaracteristicas();

    }
}
