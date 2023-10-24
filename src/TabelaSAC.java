import java.util.Scanner;

public class TabelaSAC {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Valor do empréstimo: ");
    double valorEmprestimo = scanner.nextDouble();
    System.out.print("Taxa de Juros: ");
    double taxa = scanner.nextDouble();
    System.out.print("Prazo de Pagamento: ");
    double prazo = scanner.nextDouble();

    double amortizacao = valorEmprestimo / prazo;

    System.out.printf("Valor fixo da amortização R$ %9.2f, Saldo devedor total R$ %9.2f"
        + " com um juros de %.1f%% ao mês.\n", amortizacao, valorEmprestimo, taxa);

    double somaPrestacao = 0;
    double somaJuros = 0;
    double somaAmortizacao = 0;

    for (int i = 1; i <= prazo; i++) {
      double juros = valorEmprestimo * taxa/100;
      double prestacao = amortizacao + juros;
      valorEmprestimo -= amortizacao;
      somaPrestacao += prestacao;
      somaJuros += juros;
      somaAmortizacao += amortizacao;
      System.out.printf("Parcela %2d | Juros: R$ %6.2f | Prestação: R$ %9.2f | "
          + "Saldo Devedor: R$ %9.2f\n", i, juros, prestacao, valorEmprestimo);
    }

    System.out.printf("Total: Prestação R$ %9.2f, Juros R$ %9.2f, "
        + "Amortização R$ %9.2f", somaPrestacao, somaJuros, somaAmortizacao);

  }

}
