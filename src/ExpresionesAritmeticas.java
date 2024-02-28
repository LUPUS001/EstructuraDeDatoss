import java.util.*;

public class ExpresionesAritmeticas {
    public static String evaluarExpresionPila(String expresion) {
        Stack<Integer> pila = new Stack<>();
        String resultado = "";
        int num1, num2;
        String[] tokens = expresion.split("\\s+");
        for (String token : tokens) {
            if (token.matches("\\d+")) {
                pila.push(Integer.parseInt(token));
            } else {
                num1 = pila.pop();
                num2 = pila.pop();
                switch (token) {
                    case "+":
                        pila.push(num2 + num1);
                        break;
                    case "-":
                        pila.push(num2 - num1);
                        break;
                    case "*":
                        pila.push(num2 * num1);
                        break;
                    case "/":
                        try {
                            pila.push(num2 / num1);
                        } catch (ArithmeticException e) {
                            return "Houston, we have a problem";
                        }
                        break;
                }
            }
        }
        return String.valueOf(pila.pop());
    }
    public static String evaluarExpresionCola(String expresion) {
        Queue<Integer> cola = new LinkedList<>();
        String resultado = "";
        int num1, num2;
        String[] tokens = expresion.split("\\s+");
        for (String token : tokens) {
            if (token.matches("\\d+")) {
                cola.offer(Integer.parseInt(token));
            } else {
                num1 = cola.poll();
                num2 = cola.poll();
                switch (token) {
                    case "+":
                        cola.offer(num2 + num1);
                        break;
                    case "-":
                        cola.offer(num2 - num1);
                        break;
                    case "*":
                        cola.offer(num2 * num1);
                        break;
                    case "/":
                        try {
                            cola.offer(num2 / num1);
                        } catch (ArithmeticException e) {
                            return "Houston, we have a problem";
                        }
                        break;
                }
            }
        }
        return String.valueOf(cola.poll());
    }

    public static void main(String[] args) {
        System.out.println(evaluarExpresionPila("0 0 /"));
        System.out.println(evaluarExpresionCola("0 0 /"));
    }
}
