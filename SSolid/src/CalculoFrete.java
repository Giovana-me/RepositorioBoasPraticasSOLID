public class CalculoFrete {
    public double precoPorKg = 10.00;

    public double calcular(Encomenda encomenda){
        return encomenda.getPeso()*precoPorKg;
    }
}