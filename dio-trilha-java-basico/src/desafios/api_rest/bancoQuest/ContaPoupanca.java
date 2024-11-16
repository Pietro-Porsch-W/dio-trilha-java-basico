package bancoQuest;

public class ContaPoupanca extends Conta {
    private static final double RENDIMENTO = 0.005; // 0.5% de rendimento mensal

    public ContaPoupanca(String numero, Cliente titular) {
        super(numero, titular);
    }

    public void aplicarRendimento() {
        double saldoAtual = getSaldo();
        depositar(saldoAtual * RENDIMENTO);
        System.out.println("Rendimento aplicado.");
    }

    @Override
    public void aplicarTaxaDeManutencao() {
        // Conta Poupança não tem taxa de manutenção.
        System.out.println("Conta Poupança não possui taxa de manutenção.");
    }
}
