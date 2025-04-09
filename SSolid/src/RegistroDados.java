import java.util.Scanner;

public class RegistroDados {
    public Scanner sc;

    public RegistroDados(){
        this.sc=new Scanner(System.in);
    }
    public String solicitarId(){
        System.out.println("Informe a id da encomenda:");
        return sc.nextLine();
    }
    public double solicitarPeso(){
        System.out.println("Digite o peso em Kg:");
        return sc.nextDouble();
    }
}
