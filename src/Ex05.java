import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String aluno;
        float n1 = 0f, n2 = 0f, n3 = 0f, media = 0f;
        System.out.println("Olá, Seja Bem-vindo ao Calculador de Notas");
        System.out.println("Informe o Nome do aluno: ");
        aluno = scan.nextLine();
        System.out.println("Informe a 1º nota: ");
        n1 = scan.nextFloat();
        System.out.println("Informe a 2º nota: ");
        n2 = scan.nextFloat();
        System.out.println("Informe a 3º nota: ");
        n3 = scan.nextFloat();
        media = (n1 + n2 + n3) / 3;
        System.out.println("A média de " + aluno + " é : " + media);
    }
}
