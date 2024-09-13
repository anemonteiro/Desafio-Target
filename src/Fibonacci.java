import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int a = 0, b = 1;
        boolean igual = false;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número para verificar se pertence a sequência de Fibonacci: ");
        int num = scanner.nextInt();
        scanner.close();
        System.out.print("Sequência de Fibonacci até " + num + ": ");

        while (a <= num) {
            System.out.print(a + " ");
            if (a == num) {
                igual = true;
                break;
            }
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();

        if (igual) {
            System.out.println(num + " pertence a sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence a sequência de Fibonacci.");
        }
    }
}

