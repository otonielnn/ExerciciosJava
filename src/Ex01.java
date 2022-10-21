import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n1 = 0, n2 = 0;
        System.out.println("Bem-Vindo ao programa de soma");
        System.out.println("Digite um número: ");
        n1 = scan.nextInt();
        System.out.println("Digite outro número: ");
        n2 = scan.nextInt();
        int soma = n1 + n2;
        System.out.println("A soma deles é igual a: "+ soma);
    }
}
