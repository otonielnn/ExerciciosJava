import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nomeVendedor;
        float salarioFixo = 0;
        float totalVendas = 0;
        float taxaComissao = 0.15f;
        System.out.println("Seja Bem-Vindo ao Calculador de salário");
        System.out.println("Qual seu nome: ");
        nomeVendedor = scan.nextLine();
        System.out.println("Qual seu salário fixo: ");
        salarioFixo = scan.nextFloat();
        System.out.println("Qual foi seu total de vendas no Mês: ");
        totalVendas = scan.nextFloat();
        float salarioMes = salarioFixo + (totalVendas * taxaComissao);
        System.out.println("Seu nome é: " + nomeVendedor);
        System.out.println("Seu Salário Fixo é: " + salarioFixo);
        System.out.println("Suas Vendas Foram : " + totalVendas + "R$. Recebendo uma comissão de 15% fica: " + (totalVendas * 0.15));
        System.out.println("Seu Salário no Final do mês é : " + salarioMes);
    }
}
