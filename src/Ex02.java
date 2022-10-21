import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = 0, n2 = 0;
        System.out.println("Bem-Vindo ao programa das 4 operações básicas");
        System.out.println("Digite um número: ");
        n1 = scan.nextInt();
        System.out.println("Digite outro número: ");
        n2 = scan.nextInt();
        int soma = n1 + n2, subtracao = n1 - n2, multiplicacao = n1 * n2, divisao = n1 / n2;
        System.out.println("A Soma deles é igual a: "+ soma);
        System.out.println("A Subtração deles é igual a: "+ subtracao);
        System.out.println("A Multiplicação deles é igual a: "+ multiplicacao);
        System.out.println("A Divisão deles é igual a: "+ divisao);
    }
    }
