public class Main {
    public static void main(String[] args) {
        SistemaPagamento sistema = new SistemaPagamento();

        Pagamento cartao = new PagamentoCartao();
        Pagamento pix = new PagamentoPix();
        Pagamento boleto = new PagamentoBoleto();

        sistema.realizarPagamento(100.0, cartao);
        sistema.realizarPagamento(60.0, pix);
        sistema.realizarPagamento(150.0, boleto);
    }
}