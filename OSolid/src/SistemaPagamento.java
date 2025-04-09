public class SistemaPagamento {
    public void realizarPagamento(double valor, Pagamento metodoPagamento){
        metodoPagamento.pagar(valor);
    }
}
