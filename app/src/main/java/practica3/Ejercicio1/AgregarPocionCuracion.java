package practica3.Ejercicio1;


import java.util.List;

public class AgregarPocionCuracion extends ObjetosPersonaje {
    private PocionCuracion pocionCuracion;

    public AgregarPocionCuracion(Personaje personaje, PocionCuracion pocionCuracion) {
        super(personaje);
        this.pocionCuracion = pocionCuracion;
    }

    @Override
    public void showCaracteristicas() {
        personaje.setPuntosRegeneracionVida(sumarPorcentajes(personaje.getPuntosRegeneracionVida(), "80%"));
        super.showCaracteristicas();
        System.out.print("Agregado tipo de objeto: ");
        pocionCuracion.showInfo();
        System.out.println("Aumento de puntos de regeneracion de vida en un 80%");
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
