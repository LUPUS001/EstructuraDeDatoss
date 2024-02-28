import java.util.*;
public class Telefonos {
    public static void main(String[] args) {
        ArrayList<String> telefonos = new ArrayList<>();
        HashMap<String, ArrayList<String>> contacto = new HashMap<>();
        telefonos.add("612");
        telefonos.add("23");
        contacto.put("Antonio", telefonos);

        telefonos = new ArrayList<>();
        telefonos.add("734");
        telefonos.add("34");
        contacto.put("Marcos", telefonos);

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el contacto del que quieres saber su número");
        String numero = sc.next();
        if (contacto.containsKey(numero)){
            System.out.println(contacto.get(numero));
        }
        System.out.println(contacto);
    }
    public static String numeroTelefono (HashMap<String, String> contacto, String numero){
        return contacto.get(numero);
    }
}
