import java.util.LinkedList;

public class Parentesis {
    public static boolean esBalanceado(String cadena){
        boolean balanced;
        LinkedList<Character> cola = new LinkedList<>();
        char c;
        for (int i = 0; i < cadena.length(); i++) {
            c = cadena.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                cola.addLast(c);
            }
            else if (c == ']' || c == '}' || c == ')') {
                if (cola.isEmpty()) {
                    return false;
                }
                else {
                    Character removed = cola.removeLast();
                    switch (c) {
                        case '}':
                            balanced = removed == '{';
                            break;
                        case ')':
                            balanced = removed == '(';
                            break;
                        case ']':
                            balanced = removed == '[';
                            break;
                        default:
                            balanced = false;
                    }
                    if (!balanced)
                        return false;
                }
            }
        }
        return cola.isEmpty();
    }
    public static void main(String[] args) {
        String cadenaBalanceada = "{[()]}";
        System.out.println("¿La cadena está balanceada? " + esBalanceado(cadenaBalanceada));
        String cadenaNoBalanceada = "{[(])}";
        System.out.println("¿La cadena está balanceada? " + esBalanceado(cadenaNoBalanceada));
    }
}
