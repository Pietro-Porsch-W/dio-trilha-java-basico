package bancoQuest;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Oliveira", "987.654.321-00");

        Conta contaCorrente = new ContaCorrente("001", cliente1);
        Conta contaPoupanca = new ContaPoupanca("002", cliente2);

        // Depósitos
        contaCorrente.depositar(500);
        contaPoupanca.depositar(1000);

        // Saques
        contaCorrente.sacar(100);
        contaPoupanca.sacar(200);

        // Transferências
        contaCorrente.transferir(50, contaPoupanca);

        // Aplicar taxa de manutenção e rendimento
        contaCorrente.aplicarTaxaDeManutencao();
        ((ContaPoupanca) contaPoupanca).aplicarRendimento();

        // Mostrar saldos
        System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo Conta Poupança: " + contaPoupanca.getSaldo());
    }
}
