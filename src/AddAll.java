import java.util.ArrayList;

public class AddAll {
    public static void main(String[] args) {
        ArrayList <String> lista1 = new ArrayList<>();
        lista1.add("Cereales");
        lista1.add("Leche");
        lista1.add("Miel");

        ArrayList<String> lista2 = new ArrayList<>();
        lista2.add("HoneyFlakes ingredientes:");
        lista2.addAll(lista1);

        System.out.println(lista2);
    }
}