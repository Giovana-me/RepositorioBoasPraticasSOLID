public class ContaPoupanca implements Conta{
    private double saldo;

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        throw new UnsupportedOperationException("Resgate não é permitido direto.");
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
}
