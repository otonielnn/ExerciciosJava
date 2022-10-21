import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0, b = 0, c = 0;
        System.out.println("Seja Bem-vindo ao Misturador de variáveis");
        System.out.println("Digite um número de 0 a 9 para A:");
        a = scan.nextInt();
        System.out.println("Digite um número de 0 a 9 para B:");
        b = scan.nextInt();
        System.out.println("Você digitou para A: " + a);
        System.out.println("Você digitou para B: " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("========================================================================");
        System.out.println("A agora é: " + a);
        System.out.println("B agora é: " + b);
    }
}
