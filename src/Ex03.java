import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float distanciaPercorrida = 0f, combustivelGasto = 0f;
        System.out.println("Seja Bem-vindo ao Programa de Consumo Médio de Combustível");
        System.out.println("Informe a Distancia Percorrida: ");
        distanciaPercorrida = scan.nextFloat();
        System.out.println("Informe o Gasto de Combustível: ");
        combustivelGasto = scan.nextFloat();
        float media = distanciaPercorrida / combustivelGasto;
        System.out.println("Sua Média de combustível em litros por KM é: " + media);
    }
}
