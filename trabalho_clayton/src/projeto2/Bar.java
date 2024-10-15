package projeto2;

import java.util.Scanner;

public class Bar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados do cliente
        System.out.print("Informe o sexo (F ou M): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        System.out.print("Quantidade de cervejas: ");
        int quantidadeCervejas = scanner.nextInt();

        System.out.print("Quantidade de refrigerantes: ");
        int quantidadeRefrigerantes = scanner.nextInt();

        System.out.print("Quantidade de espetinhos: ");
        int quantidadeEspetinhos = scanner.nextInt();

        // Cálculo do total
        double valorIngresso = (sexo == 'F') ? 8.0 : 10.0;
        double valorCervejas = quantidadeCervejas * 5.0;
        double valorRefrigerantes = quantidadeRefrigerantes * 3.0;
        double valorEspetinhos = quantidadeEspetinhos * 7.0;

        double consumo = valorCervejas + valorRefrigerantes + valorEspetinhos;
        double couvert = (consumo > 30.0) ? 0.0 : 4.0;
        double valorTotal = valorIngresso + consumo + couvert;

        // Relatório
        System.out.printf("RELATÓRIO:%n");
        System.out.printf("Consumo = R$ %.2f%n", consumo);
        if (couvert == 0.0) {
            System.out.println("Isento de Couvert");
        } else {
            System.out.printf("Couvert = R$ %.2f%n", couvert);
        }
        System.out.printf("Ingresso = R$ %.2f%n", valorIngresso);
        System.out.printf("Valor a pagar = R$ %.2f%n", valorTotal);

        scanner.close();
    }
}
