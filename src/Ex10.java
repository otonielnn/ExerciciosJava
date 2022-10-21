import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float compras = 0f, prestacoes = 0f;
        System.out.println("Seja Bem-Vindo a loja Mamão com Açúcar");
        System.out.println("Estamos dividindo todas as compras em 5 prestações sem juros");
        System.out.println("Informe quanto que foi suas compras: ");
        compras = scan.nextFloat();
        prestacoes = compras / 5;
        System.out.println("Suas compras será dividida em 5 prestações de : " + prestacoes + "R$");
    }   
}