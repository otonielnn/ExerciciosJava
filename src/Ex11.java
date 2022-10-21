import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float preçoDeCusto, valorVenda, acrescimoPercentual;

        System.out.println("Seja Bem-vindo ao Gerador de Preço de Venda");
        System.out.println("Informe o preço de custo do Produto: ");
        preçoDeCusto = scan.nextFloat();

        System.out.println("Certo. Você informou que o preço de custo é: " + preçoDeCusto);
        System.out.println("Agora informe quantos % será o acréscimo para o Valor de Venda: ");
        acrescimoPercentual = scan.nextFloat();
        acrescimoPercentual /= 100;
        
        valorVenda = preçoDeCusto + (preçoDeCusto * acrescimoPercentual);
        System.out.println("Com um acréscimo de " + acrescimoPercentual + " O valor de Venda será: " + valorVenda);
    }
}
