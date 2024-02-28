import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Anagrama {
    public static void main(String[] args) throws IOException {
        int minGroupSize = 5;
        BufferedReader lector = new BufferedReader(new FileReader("spanish-dict.txt"));
        String line;
        Map<String,List<String>> anagramas = new HashMap<>();
        List<String>palabras = new ArrayList<>();
        while ((line = lector.readLine())!=null){
            anagrama(line,anagramas,palabras);
        }
        lector.close();
        for (String llave:anagramas.keySet()){
            if (anagramas.get(llave).size() >= minGroupSize) {
                System.out.println(llave + anagramas.get(llave));
            }
        }

    }
    public static void anagrama (String line,Map<String,List<String>>anagramas,List<String>palabras) {
        char[] caracteres = line.toCharArray();
        Arrays.sort(caracteres);
        String palabraOrdenada = new String(caracteres);

        if (!anagramas.containsKey(palabraOrdenada)){
            palabras = new ArrayList<>();
            palabras.add(line);
            anagramas.put(palabraOrdenada,palabras);
        }
        else {
            palabras = anagramas.get(palabraOrdenada);
            palabras.add(line);
            anagramas.put(palabraOrdenada,palabras);
        }
    }
}