import java.util.*;

public class Botin {
    public static String repartir(int participantes, int... billetes) {
        Map<Integer, ArrayList<Integer>> botin = new HashMap<>();
        ArrayList<Integer> listaBilletes = new ArrayList<>();

        for (int i = 0; i < participantes; i++) {
            int posicionBotin = i;
            for (int j = 0; j < billetes.length; j++) {
                if (j == posicionBotin) {
                    listaBilletes.add(billetes[j]);
                    botin.put(i, new ArrayList<>(listaBilletes));
                    posicionBotin += participantes;
                }
            }
            listaBilletes.clear();
        }
        return botin.toString();
    }

    public static void main(String[] args) {
        System.out.println(repartir(2, 10, 20, 50, 200, 500));
        System.out.println(repartir(3, 50, 20, 100, 200, 500, 10, 50));
    }
}
