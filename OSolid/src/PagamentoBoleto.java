public class PagamentoBoleto implements Pagamento {
    @Override
    public void pagar(double valor){
        System.out.println("Pagamento de R$"+ valor+" efetuado via boleto");
    }
}
