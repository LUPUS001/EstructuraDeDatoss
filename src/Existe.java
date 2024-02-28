import java.util.ArrayList;

public class Existe {
    public static void main(String[] args) {
        ArrayList<String> alumnos = new ArrayList<>();
        alumnos.add("Darius");
        alumnos.add("Andreu");
        alumnos.add("Marc");
        alumnos.add("Alex");

        if (alumnos.contains("Darius")){
            System.out.println("Darius se encuentra dentro del ArrayList");
        }
        else
            System.out.println("El ArrayList no lo contiene");
    }
}