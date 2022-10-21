import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        float real, dolar, cotacao;
        System.out.println("Seja Bem-vindo ao conversor de dolar para real");
        System.out.println("Informe a cotação do Dólar Hoje: ");
        cotacao = scan.nextFloat();
        System.out.println("Quantos Dólares você deseja converte para real: ");
        dolar = scan.nextFloat();
        real = dolar / cotacao;
        System.out.println("Os seus " + dolar + " são equivalentes a " + real + "R$");
    }
}
