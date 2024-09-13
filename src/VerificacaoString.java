import java.util.Scanner;

public class VerificacaoString {
    public static void main(String[] args) {
        int contador = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String scan = scanner.nextLine();
        scanner.close();

        for (int i = 0; i < scan.length(); i++) {
            char c = scan.charAt(i);
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + " vezes.");
        } else {
            System.out.println("A letra 'a' não aparece no texto.");
        }
    }
}

