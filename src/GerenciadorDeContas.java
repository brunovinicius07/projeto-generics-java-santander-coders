class GerenciadorDeContas {
    public static <T extends Conta> void transferir(T origem, T destino, double valor) {
        if (origem.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferência da " + origem.getClass().getName() + " para a " + destino.getClass().getName() + " no valor de " + valor + " realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente na conta de origem.");
        }
    }
}