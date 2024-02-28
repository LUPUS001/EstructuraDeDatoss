import java.io.*;
import java.util.*;

public class CountCountries {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Colfuturo-Seleccionados.csv"));
        String line;

        boolean linea = true;
        Map<String, Integer> paises = new LinkedHashMap<>();
        while ((line = reader.readLine()) != null) {
            if (linea) {
                linea = false;
                continue;
            }
            paises(paises, line);
        }
        for (String clave : paises.keySet()) {
            System.out.println(clave + " " + paises.get(clave));
        }
        reader.close();

        Map<String, Integer> paises2 = countCountries();
        System.out.println(paises2.getOrDefault("Canadá", -1));
    }

    public static void paises(Map<String, Integer> paises, String line) {
        String[] info = line.split(",");
        String pais = info[6];
        if (paises.containsKey(pais)) {
            int contar = paises.get(pais) + 1;
            paises.replace(pais, contar);
        } else {
            paises.put(pais, 1);
        }
    }
    public static Map<String, Integer> countCountries() throws IOException {
        Map<String, Integer> map = new HashMap<>();

        BufferedReader reader = new BufferedReader(new FileReader("Colfuturo-Seleccionados.csv"));
        String line;
        String[] splittedLine;
        line = reader.readLine();
        while ((line = reader.readLine()) != null) {
            splittedLine = line.split(",");
            Integer freq = map.get(splittedLine[6]);
            map.put(splittedLine[6], freq == null ? 1 : freq + 1);
        }
        reader.close();
        return map;
    }
}
