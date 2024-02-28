import java.util.ArrayList;
import java.util.Scanner;
public class ExisteII {
    public static void main(String[] args) {
        ArrayList<String> alumnos = new ArrayList<>();
        alumnos.add("Darius");
        alumnos.add("Andreu");
        alumnos.add("Marc");
        alumnos.add("Alex");

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué elemento quieres comprobar que existe dentro del ArrayList?");
        String ab = scanner.next();
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.contains(ab)) {
                System.out.println(ab + " se encuentra dentro del ArrayList");
                break;
            } else
                System.out.println(ab + " no se encuentra dentro del ArrayList");
            break;
        }

    }
}
//    if (alumnos.contains(alumnos.get(i)) == ab){
// System.out.println(alumnos.get(i) + " se encuentra dentro del ArrayList");

//  else
//System.out.println("El ArrayList no lo contiene");
