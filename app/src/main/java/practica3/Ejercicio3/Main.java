package practica3.Ejercicio3;

public class Main {
    public static void main (String []args){
        Archivo archivo1 = new Archivo("Archivo 1", "Viva Cochabamba");
        Archivo archivo2 = new Archivo("Archivo 2", "Viva el ICPC");
        Archivo archivo3 = new Archivo("Archivo 3", "Inge fuimos al ICPC denos bonus, no mentira");

        Composite folder1 = new Composite("Folder 1");
        folder1.add(archivo1);
        folder1.add(archivo3);

        Composite folder2 = new Composite("Folder 2");
        folder2.add(archivo1);
        folder2.add(archivo2);
        folder2.add(archivo3);

        Composite unidadDisco1 = new Composite("Unidad de disco 1");
        unidadDisco1.add(folder1);
        unidadDisco1.add(folder2);

        System.out.println();
        unidadDisco1.showInfo();

        folder2.remove(archivo1);

        System.out.println();
        unidadDisco1.showInfo();
    }
}
