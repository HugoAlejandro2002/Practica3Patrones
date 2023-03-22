package practica3.Ejercicio1;

public enum TipoArma implements Objeto {
    ESPADA {
        @Override
        public void showInfo() {
            System.out.println("Espada de hierro");
        }
    },
    HACHA {
        @Override
        public void showInfo() {
            System.out.println("Hacha de acero");
        }
    },
    ESCOPETA {
        @Override
        public void showInfo() {
            System.out.println("Escopeta de doble cañón");
        }
    }
}
