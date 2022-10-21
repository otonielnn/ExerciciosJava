import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1, n2;

        System.out.println("Seja Bem-vindo ao Programa que mostra os números em ordem decrescente");
        System.out.println("Informe o 1º número: ");
        n1 = scan.nextInt();
        System.out.println("Informe o 2º número: ");
        n2 = scan.nextInt();

        if (n2 > n1) {
            System.out.println(n2);
            System.out.println(n1);
        } else {
            System.out.println(n1);
            System.out.println(n2);
        }
    }
}
