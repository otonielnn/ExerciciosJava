import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float raio, pi = 3.14f, area;

        System.out.println("Bem-vindo ao Calculador de área de circulos");
        System.out.println("LEMBRETE: Nesse programa o valor de PI é 3,14");
        System.out.println("Informe o Raio do circulo: ");
        raio = scan.nextFloat();
        area = pi * (raio * raio);
        System.out.println("A Área do circulo com um raio de " + raio + " é: " + area);
    }
}
