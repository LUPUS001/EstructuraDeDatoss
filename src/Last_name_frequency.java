import java.io.*;
import java.util.*;

public class Last_name_frequency {
    public static void apellidos(Map<String,String> apellidos,String line){
        String[] apellidosFrecuencia;

        if(!line.isEmpty()) {
            apellidosFrecuencia = line.split(",");
            apellidos.put(apellidosFrecuencia[0], apellidosFrecuencia[1]);
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("LastnameFrequencies.csv"));
        String line;
        Map<String,String> apellidos = new LinkedHashMap<>();

        while ((line = reader.readLine())!=null) {
            apellidos(apellidos,line);
        }
        for (String clave:apellidos.keySet()) {
            System.out.println(clave + " " + apellidos.get(clave));
        }
        reader.close();
    }
}