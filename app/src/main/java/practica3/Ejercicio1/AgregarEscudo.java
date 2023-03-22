package practica3.Ejercicio1;


import java.util.List;

public class AgregarEscudo extends ObjetosPersonaje {
    private Escudo escudo;

    public AgregarEscudo(Personaje personaje, Escudo escudo) {
        super(personaje);
        this.escudo = escudo;
    }

    @Override
    public void showCaracteristicas() {
        personaje.setPuntosDefensa(sumarPorcentajes(personaje.getPuntosDefensa(), "35%"));
        personaje.setPorcentajeArmadura(sumarPorcentajes(personaje.getPorcentajeArmadura(), "10%"));
        super.showCaracteristicas();
        System.out.print("Agregado tipo de objeto: ");
        escudo.showInfo();
        System.out.println("Aumento de puntos de defensa en un 35% y la defensa de la armadura en un 10%");
    }

    @Override
    public int getNivel() {
        return personaje.getNivel();
    }

    @Override
    public void setNivel(int nivel) {
        personaje.setNivel(nivel);
    }

    @Override
    public List<TipoArma> getArmas() {
        return personaje.getArmas();
    }

    @Override
    public void setArmas(List<TipoArma> tipoArmas) {
        personaje.setArmas(tipoArmas);
    }

    @Override
    public String getPorcentajeArmadura() {
        return personaje.getPorcentajeArmadura();
    }

    @Override
    public void setPorcentajeArmadura(String porcentajeArmadura) {
        personaje.setPorcentajeArmadura(porcentajeArmadura);
    }

    @Override
    public String getPuntosAtaque() {
        return personaje.getPuntosAtaque();
    }

    @Override
    public void setPuntosAtaque(String puntosAtaque) {
        personaje.setPuntosAtaque(puntosAtaque);
    }

    @Override
    public String getPuntosDefensa() {
        return personaje.getPuntosDefensa();
    }

    @Override
    public void setPuntosDefensa(String puntosDefensa) {
        personaje.setPuntosDefensa(puntosDefensa);
    }

    @Override
    public String getPuntosRegeneracionVida() {
        return personaje.getPuntosRegeneracionVida();
    }

    @Override
    public void setPuntosRegeneracionVida(String puntosRegeneracionVida) {
        personaje.setPuntosRegeneracionVida(puntosRegeneracionVida);
    }
}
