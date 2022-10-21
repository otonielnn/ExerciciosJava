import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float C = 0, F = 0;
        System.out.println("Bem-vindo ao Converso de Celsius para Fahrenheit");
        System.out.println("Digite a temperatura em Cº: ");
        C = scan.nextFloat();
        F = (9 * C + 160) / 5;
        System.out.println("Você digitou " + C + "Cº");
        System.out.println("Que são " + F + "Fº");
    }
}
