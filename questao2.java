import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        int n, a = 0, b = 1, c = 1;
        boolean pertence = false;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        n = input.nextInt();
        
        while (c <= n) {
            if (c == n) {
                pertence = true;
                break;
            }
            a = b;
            b = c;
            c = a + b;
        }
        
        if (pertence) {
            System.out.println(n + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(n + " não pertence à sequência de Fibonacci.");
        }
    }
}
