import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float poupanca = 0f;
        System.out.println("Bem-Vindo a Poupança com 0.70% de rendimento");
        System.out.println("Informe o valor que deseja depositar: ");
        poupanca = scan.nextFloat();
        float rendimento = poupanca + (poupanca * 0.007f);
        System.out.println("O valor do Montante com 1 Mês na conta é : " + rendimento);
    }
}
