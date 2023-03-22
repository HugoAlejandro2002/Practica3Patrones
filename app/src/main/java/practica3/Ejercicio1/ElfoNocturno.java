package practica3.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class ElfoNocturno implements Personaje {
    private String nombre;
    private int nivel;
    private List<TipoArma> tipoArmas;
    private String porcentajeArmadura;
    private String puntosAtaque;
    private String puntosDefensa;
    private String puntosRegeneracionVida;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<TipoArma> getTipoArmas() {
        return tipoArmas;
    }

    public void setTipoArmas(List<TipoArma> tipoArmas) {
        this.tipoArmas = tipoArmas;
    }

    @Override
    public int getNivel() {
        return this.nivel;
    }

    @Override
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public List<TipoArma> getArmas() {
        return this.tipoArmas;
    }

    @Override
    public void setArmas(List<TipoArma> tipoArmas) {
        this.tipoArmas = tipoArmas;
    }

    @Override
    public String getPorcentajeArmadura() {
        return this.porcentajeArmadura;
    }

    @Override
    public void setPorcentajeArmadura(String porcentajeArmadura) {
        this.porcentajeArmadura = porcentajeArmadura;
    }

    @Override
    public String getPuntosAtaque() {
        return this.puntosAtaque;
    }

    @Override
    public void setPuntosAtaque(String puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    @Override
    public String getPuntosDefensa() {
        return this.puntosDefensa;
    }

    @Override
    public void setPuntosDefensa(String puntosDefensa) {
        this.puntosDefensa = puntosDefensa;
    }

    @Override
    public String getPuntosRegeneracionVida() {
        return this.puntosRegeneracionVida;
    }

    public void setPuntosRegeneracionVida(String puntosRegeneracionVida) {
        this.puntosRegeneracionVida = puntosRegeneracionVida;
    }

    public ElfoNocturno(String nombre) {
        this.nombre = nombre;
        this.nivel = 1;
        this.tipoArmas = new ArrayList<TipoArma>();
        this.porcentajeArmadura = "1%";
        this.puntosAtaque = "1%";
        this.puntosDefensa = "1%";
        this.puntosRegeneracionVida = "1%";
    }
    @Override
    public void showCaracteristicas() {
        System.out.println("Tipo: Elfo Nocturno");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Nivel: " + getNivel());
        if (getArmas().size() > 0) {
            System.out.println("Armas: ");
            for (TipoArma tipoArma : getArmas()) {
                System.out.print("- ");
                tipoArma.showInfo();
            }
        } else {
            System.out.println("Armas: Ninguna");
        }
        System.out.println("Porcentaje de armadura: " + getPorcentajeArmadura());
        System.out.println("Puntos de ataque: " + getPuntosAtaque());
        System.out.println("Puntos de defensa: " + getPuntosDefensa());
        System.out.println("Puntos de regeneracion de vida: " + getPuntosRegeneracionVida());
    }
}
