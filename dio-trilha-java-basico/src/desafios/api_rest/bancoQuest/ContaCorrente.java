package bancoQuest;

public class ContaCorrente extends Conta {
    private static final double TAXA_MANUTENCAO = 10.0;

    public ContaCorrente(String numero, Cliente titular) {
        super(numero, titular);
    }

    @Override
    public void aplicarTaxaDeManutencao() {
        if (getSaldo() >= TAXA_MANUTENCAO) {
            sacar(TAXA_MANUTENCAO);
            System.out.println("Taxa de manutenção aplicada.");
        } else {
            System.out.println("Saldo insuficiente para aplicar a taxa de manutenção.");
        }
    }
}

