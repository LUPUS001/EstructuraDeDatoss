import java.util.*;
public class PaisCapital {
    public static void main(String[] args) {
        Map<String, String> paises = new HashMap<String, String>();
        paises.put("Canada", "Ottawa");
        paises.put("España", "Madrid");
        paises.put("Italia", "Roma");
        paises.put("Argentina", "Buenos Aires");
        paises.put("Francia", "Paris");
        paises.put("Ucrania", "Kiev");
        paises.put("Rusia", "Moscú");
        paises.put("México", "Ciudad de México");
        paises.put("EEUU", "Washington D. C");
        paises.put("Perú", "Lima");
        paises.put("Venezuela", "Caracas");

        System.out.println("Países");
        System.out.print("-");
        for (String capitales: paises.keySet()) {
            System.out.print(capitales + "-");
        }
        System.out.println();

        Scanner sc = new Scanner (System.in);
        System.out.println("Dime un pais y te diré su capital");
        String capitalesMap = sc.next();

        if(paises.containsKey(capitalesMap)){
            System.out.println("La capital de " + capitalesMap + " es " + paises.get(capitalesMap));
        } else {
            System.out.println("Ese pais o no existe o no lo tenemos en nuestra base de datos");
        }
    }
}
