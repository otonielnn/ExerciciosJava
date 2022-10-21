import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        System.out.println("Seja Bem-Vindo ao programa que apenas mostra na tela números maiores que 20");
        System.out.println("Informe um número: ");
        numero = scan.nextInt();
        
        while (numero < 21) {
            System.out.println("Informe outro número: ");
            numero = scan.nextInt();
        }
        System.out.println(numero);
    }
}
