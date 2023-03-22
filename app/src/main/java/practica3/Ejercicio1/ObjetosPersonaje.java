package practica3.Ejercicio1;

public abstract class ObjetosPersonaje implements Personaje {

    protected Personaje personaje;

    public ObjetosPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void showCaracteristicas() {
        personaje.showCaracteristicas();
    }

    public static String sumarPorcentajes(String porcentaje1, String porcentaje2){
        double porcentaje1D = FromPercentageString(porcentaje1);
        double porcentaje2D = FromPercentageString(porcentaje2);
        int suma = (int) ((porcentaje1D + porcentaje2D)*100);
        return suma + "%";
    }

    public static double FromPercentageString(String value)
    {
        return Double.parseDouble(value.substring(0, value.length() - 1)) / 100;
    }
}
