package projeto1;
import java.util.Scanner;

public class ImpostoDeRenda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da renda anual
        System.out.print("Informe a renda anual com salário: ");
        double rendaSalarioAnual = scanner.nextDouble();

        System.out.print("Informe a renda anual com prestação de serviços: ");
        double rendaServicoAnual = scanner.nextDouble();

        System.out.print("Informe a renda anual com ganho de capital: ");
        double rendaCapitalAnual = scanner.nextDouble();

        // Leitura dos gastos
        System.out.print("Informe os gastos médicos e educacionais: ");
        double gastos = scanner.nextDouble();

        // Cálculo do imposto sobre o salário
        double salarioMensal = rendaSalarioAnual / 12;
        double impostoSalario = calcularImpostoSalario(salarioMensal);

        // Cálculo do imposto sobre prestação de serviços
        double impostoServico = rendaServicoAnual * 0.15;

        // Cálculo do imposto sobre ganho de capital
        double impostoCapital = rendaCapitalAnual * 0.20;

        // Cálculo do imposto bruto
        double impostoBruto = impostoSalario + impostoServico + impostoCapital;

        // Cálculo do abatimento
        double abatimento = Math.min(gastos * 0.30, gastos);

        // Cálculo do imposto final
        double impostoFinal = impostoBruto - abatimento;

        // Relatório
        System.out.printf("Imposto sobre salário: R$ %.2f%n", impostoSalario);
        System.out.printf("Imposto sobre prestação de serviços: R$ %.2f%n", impostoServico);
        System.out.printf("Imposto sobre ganho de capital: R$ %.2f%n", impostoCapital);
        System.out.printf("Imposto bruto: R$ %.2f%n", impostoBruto);
        System.out.printf("Abatimento: R$ %.2f%n", abatimento);
        System.out.printf("Imposto final a pagar: R$ %.2f%n", impostoFinal);

        scanner.close();
    }

    public static double calcularImpostoSalario(double salarioMensal) {
        if (salarioMensal < 3000) {
            return 0.0; // Isento
        } else if (salarioMensal < 5000) {
            return salarioMensal * 0.10 * 12; // 10% sobre 12 meses
        } else {
            return salarioMensal * 0.20 * 12; // 20% sobre 12 meses
        }
    }
}
