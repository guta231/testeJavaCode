package ex4;

public class Internacional extends Passagem {
    
    double fator_preco = 0.4;


    public Internacional(String origem, String destino, String data, double distancia){

        super(origem, destino, data, distancia);

    }

    @Override
    protected double calcular_preco(){

        this.preco = this.distancia*fator_preco;

        return this.preco;


    }

    protected double calcular_preco(double taxa_conversao){

        this.preco = this.distancia*fator_preco;

        this.preco = this.preco*taxa_conversao;

        return this.preco;


    }


}
