import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1, n2;
        System.out.println("Seja Bem-vindo ao Programa que mostra qual é o Menor número entre os 2 informados");
        System.out.println("Informe o 1º número: ");
        n1 = scan.nextInt();
        System.out.println("Informe o 2º número: ");
        n2 = scan.nextInt();

        if (n1 > n2) {
            System.out.println("O menor número é: " + n2);
        } else {
            System.out.println("O menor número é: " + n1);
        }
    }
}
