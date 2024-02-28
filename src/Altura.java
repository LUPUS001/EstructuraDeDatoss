import java.util.ArrayList;
import java.util.Scanner;
public class Altura{
    public static void main(String[] args) {
        int obtenerNumeroAlumnos = numeroAlumnos();
        ArrayList<Double> alturaAlumnos = leerAlturas(obtenerNumeroAlumnos);
        mostrarResultados(alturaAlumnos, calcularMedia(alturaAlumnos));
    }

    public static int numeroAlumnos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el número de alumnos a medir");
        int cantidadAlumnos = sc.nextInt();
        return cantidadAlumnos;
    }

    public static ArrayList<Double> leerAlturas(int cantidadAlumnos){
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> alturaAlumnos = new ArrayList<>();
        System.out.println("Escribe la altura de los diferentes alumnos");

        for (int i = 0; i < cantidadAlumnos; i++) {
            alturaAlumnos.add(sc.nextDouble());
        }
        return alturaAlumnos;
    }

    public static double calcularMedia(ArrayList<Double> alturaAlumnos) {
        double media = 0;
        for (int i = 0; i < alturaAlumnos.size(); i++) {
            media += alturaAlumnos.get(i);
        }
        return media/alturaAlumnos.size();
    }

    public static int calcularAlumnosAlturaSuperior(ArrayList<Double> alturaAlumnos, double media){
        int alturaSuperior = 0;
        for (int i = 0; i < alturaAlumnos.size(); i++) {
            if (alturaAlumnos.get(i) > media) {
                alturaSuperior++;
            }
        }
        return alturaSuperior;
    }

    public static int calcularAlumnosAlturaInferior(ArrayList<Double> alturaAlumnos, double media) {
        int alturaInferior = 0;
        for (int i = 0; i < alturaAlumnos.size(); i++) {
            if (alturaAlumnos.get(i) < media) {
                alturaInferior++;
            }
        }
        return alturaInferior;
    }

    public static void mostrarResultados(ArrayList<Double> alturaAlumnos, double media){

        for (int i = 0; i < alturaAlumnos.size(); i++) {
            System.out.print(alturaAlumnos.get(i) + " ");
        }
        System.out.println();
        System.out.println("Altura media de los alumnos: " + media);
        System.out.println("Cantidad de alumnos que superan la media: " + calcularAlumnosAlturaSuperior(alturaAlumnos, media));
        System.out.println("Cantidad de alumnos que están por debajo de la media: " + calcularAlumnosAlturaInferior(alturaAlumnos, media));
    }

}