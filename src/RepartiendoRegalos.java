import java.util.*;
public class RepartiendoRegalos {
    public static void mainOLD(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer> portales = new ArrayList<>();
        portales.add(0, 3);
        portales.add(1, 2);
        portales.add(2, 5);
        int resultado = 0;
        System.out.println("¿En que orden visitará los portales?");
        System.out.println(portales);

        for (int i = 0; i < portales.size(); i++) {
            if (portales.indexOf(0) - portales.indexOf(1) < portales.indexOf(0) - portales.indexOf(2)){
                resultado += portales.indexOf(1);
                resultado += portales.indexOf(2);
            }
            else if (portales.indexOf(0) - portales.indexOf(1) > portales.indexOf(0) - portales.indexOf(2)){
                resultado += portales.indexOf(2);
                resultado += portales.indexOf(1);
            }


            System.out.println(resultado);
        }
    }
    public static void main(String[] args) {

        ArrayList<Integer> portales = new ArrayList<>(Arrays.asList(2, 4));
        System.out.println(repartir(0, portales));

        portales = new ArrayList<>((Arrays.asList(2, 5, 1)));
        System.out.println(repartir(3, portales));

        portales = new ArrayList<>((Arrays.asList(2, 4, 7)));
        System.out.println(repartir(3, portales));
    }
    private static int siguiente(ArrayList<Integer> portals, int desde){
        int diff, min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < portals.size(); i++) {
            diff = Math.abs(portals.get(i) - desde);
            if (diff <= min ){
                min = diff;
                index = i;
            }
        }
        return portals.get(index);
    }
    public static String repartir(int aterriza, ArrayList<Integer> portales) {
        String result = "";
        int actual = aterriza;
        Collections.sort(portales);
        while (!portales.isEmpty()) {
            actual = siguiente(portales, actual);
            result += actual + " ";
            portales.remove(Integer.valueOf(actual));
        }
        return result;
    }
}
