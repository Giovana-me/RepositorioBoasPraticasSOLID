public class PagamentoPix implements Pagamento{
    @Override
    public void pagar(double valor){
        System.out.println("Pagamento de R$"+valor+" efetuado no pix");
    }
}
