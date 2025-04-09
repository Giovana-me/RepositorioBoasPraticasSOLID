public class Main {
    public static void main(String[] args) {
        RegistroDados registro = new RegistroDados();

        String id = registro.solicitarId();
        double peso = registro.solicitarPeso();
        Encomenda encomenda = new Encomenda(id, peso);

        CalculoFrete calculo = new CalculoFrete();
        double valorFrete = calculo.calcular(encomenda);
        System.out.println("Valor do frete calculado: " + valorFrete);

        SalvarDadosEncomenda salvador = new SalvarDadosEncomenda();
        salvador.salvar(encomenda, valorFrete);
    }
}