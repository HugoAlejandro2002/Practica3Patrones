package practica3.Ejercicio1;

import java.util.List;

interface Personaje {

    int getNivel();

    void setNivel(int nivel);

    List<TipoArma> getArmas();

    void setArmas(List<TipoArma> tipoArmas);

    String getPorcentajeArmadura();

    void setPorcentajeArmadura(String porcentajeArmadura);

    String getPuntosAtaque();

    void setPuntosAtaque(String puntosAtaque);

    String getPuntosDefensa();

    void setPuntosDefensa(String puntosDefensa);

    String getPuntosRegeneracionVida();

    void setPuntosRegeneracionVida(String puntosRegeneracionVida);


    void showCaracteristicas();


}
