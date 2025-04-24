package ex4;

public class Domestico extends Passagem {
    

    double fator_preco = 0.75;

    public Domestico(String origem, String destino, String data, double distancia){

        super(origem, destino, data, distancia);


    }

    @Override
    protected double calcular_preco(){

        this.preco = this.distancia*fator_preco;
        
        return this.preco;
    }
    

}
