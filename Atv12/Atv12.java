public class Emprestimo {
    private double valorTotal;
    private double taxaJuros;
    private int numeroParcelas;
    private int parcelaAtual;

    public Emprestimo(double valorTotal, double taxaJuros, int numeroParcelas) {
        this.valorTotal = valorTotal;
        this.taxaJuros = taxaJuros;
        this.numeroParcelas = numeroParcelas;
        this.parcelaAtual = 1;
    }

    public double proximaParcela() {
        if (parcelaAtual <= numeroParcelas) {
            double valorParcela = valorTotal / numeroParcelas;
            double juros = valorParcela * taxaJuros / 100;
            double valorTotalParcela = valorParcela + juros;

            parcelaAtual++;

            return valorTotalParcela;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Emprestimo E1 = new Emprestimo(1000, 10, 5);
        Emprestimo E2 = new Emprestimo(2000, 8, 4);

        System.out.println("Parcelas dos empréstimos:");

        boolean possuiParcelasRestantes = true;
        while (possuiParcelasRestantes) {
            double parcelaE1 = E1.proximaParcela();
            double parcelaE2 = E2.proximaParcela();

            if (parcelaE1 != -1 && parcelaE2 != -1) {
                System.out.println("Parcela E1: R$ " + parcelaE1);
                System.out.println("Parcela E2: R$ " + parcelaE2);
                System.out.println();
            } else if (parcelaE1 != -1) {
                System.out.println("Parcela E1: R$ " + parcelaE1);
            } else if (parcelaE2 != -1) {
                System.out.println("Parcela E2: R$ " + parcelaE2);
            } else {
                possuiParcelasRestantes = false;
            }
        }
    }
}
