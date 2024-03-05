class ContaCorrente implements Conta {
    private int numeroConta;
    private double saldo;

    public ContaCorrente(int numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}