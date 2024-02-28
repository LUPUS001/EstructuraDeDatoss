import java.util.*;
public class MejorTerminacion {
    public static void mainOLD(String[] args) {
        String [] decimos = {"98234", "45678", "09784"};
        for (String numero : decimos) {
            char ultimoNum = numero.charAt(numero.length() - 1);
            System.out.println(ultimoNum);
        }

        Map<Integer, Integer> terminaciones = new HashMap<>();
        terminaciones.put(4, 3);
        terminaciones.put(3, 4);
        System.out.println(terminaciones.toString());
        Integer cuantos = terminaciones.get(4);
        terminaciones.put(4, cuantos + 1);

        cuantos = terminaciones.get(5);
        if (cuantos == null){
            terminaciones.put(5, 1);
        }
        else {
            terminaciones.put(5, cuantos + 1);
        }
    }
    public static void main(String[] args) {
        System.out.println(terminaciones("00004", "03847", "39804"));
        System.out.println(terminaciones("58975", "25894", "52985", "98598"));
    }

    public static String terminaciones(String... boletos) {
        Map<Integer, Integer> terminaciones = new HashMap<Integer, Integer>();
        int terminacion;
        Integer actual;
        for (String boleto : boletos) {
            terminacion = Integer.parseInt("" + boleto.charAt(boleto.length() - 1));
            actual = terminaciones.get(terminacion);
            if (actual == null)
                terminaciones.put(terminacion, 1);
            else
                terminaciones.put(terminacion, ++actual);
        }

        return terminaciones.toString();
    }
}
