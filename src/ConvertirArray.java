import java.util.ArrayList;

public class ConvertirArray {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        System.out.println(numeros);
        //Forma1
        int[] enteros = new int[numeros.size()];
        for (int i = 0; i < numeros.size(); i++) {
            enteros[i] = numeros.get(i);
        }
        //Forma2
/*
        for (int i = 0; i < numeros.size(); i++) {
            int[] numbers = new int[i];
        }*/
        for (int a : numeros){
            System.out.println(a);
        }
    }
}
