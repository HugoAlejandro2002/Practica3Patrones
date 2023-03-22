package practica3.Ejercicio1;


import java.util.List;

public class AgregarTipoArma extends ObjetosPersonaje {
    private TipoArma tipoArma;

    public AgregarTipoArma(Personaje personaje, TipoArma tipoArma) {
        super(personaje);
        this.tipoArma = tipoArma;
    }

    @Override
    public void showCaracteristicas() {
        personaje.setPuntosAtaque(sumarPorcentajes(personaje.getPuntosAtaque(), "30%"));
        personaje.setNivel(personaje.getNivel() * 2);
        personaje.getArmas().add(this.tipoArma);
        super.showCaracteristicas();
        System.out.print("Agregado tipo de objeto: ");
        tipoArma.showInfo();
        System.out.println("Duplicando nivel de personaje y aumento del 30% de los puntos de ataque");
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
