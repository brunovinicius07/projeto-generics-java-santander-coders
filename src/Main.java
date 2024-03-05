public class Main {
    public static void main(String[] args) {
        ContaCorrente corrente1 = new ContaCorrente(123);
        ContaPoupanca poupanca1 = new ContaPoupanca(456);

        corrente1.depositar(1000);
        poupanca1.depositar(500);

        System.out.println("Saldo na conta corrente: " + corrente1.getSaldo());
        System.out.println("Saldo na conta poupança: " + poupanca1.getSaldo());

        GerenciadorDeContas.transferir(corrente1, poupanca1, 600);

        System.out.println("Saldo na conta corrente: " + corrente1.getSaldo());
        System.out.println("Saldo na conta poupança: " + poupanca1.getSaldo());
    }
}