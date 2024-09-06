import java.util.Scanner;

public class FibonacciCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        
        if (isFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean isFibonacci(int num) {
        int a = 0, b = 1, c = 0;
        
        if (num == 0 || num == 1) return true; 
        
        while (c < num) {
            c = a + b;
            a = b;
            b = c;
        }
        
        return c == num;
    }
}
