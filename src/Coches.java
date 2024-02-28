import java.util.ArrayList;
import java.util.Collections;

public class Coches {
    public static void main(String[] args) {
        //Método I
   /*
        Scanner sc = new Scanner (System.in);
        ArrayList<String> coches = new ArrayList<>();
        String coche;
        do{
            System.out.println("Introduce una marca de coche");
            coche = sc.nextLine();
            if (coche.length() != 0){
                coches.add(coche);
            }
        }
        while (coche.length() != 0);


        Collections.sort(coches);
        for (String cocheAñadido : coches) {
            System.out.println(cocheAñadido);
        }
*/
    /* //Método II : Modo "fácil"
        ArrayList<String> coches = new ArrayList<>();
        coches.add("Volvo");
        coches.add("Seat");
        coches.add("Fiat");
        coches.add("Abc"); for (int i = coches.size()-1; i >= 0; i--) {
            System.out.println(coches.get(i));
        }*/



        //Método III
        ArrayList<String> coches2 = new ArrayList<>();
        String coche2;
        do {
            coche2 = Utilidades.leerCadena("Introduce una marca de coche");
            if (coche2.length() != 0){
                coches2.add(coche2);
            }
        }
        while (coche2.length() != 0);

        Collections.sort(coches2);

        for (String cochecitos : coches2){
            System.out.println(cochecitos);
        }



    }
}