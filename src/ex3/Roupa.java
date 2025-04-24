package ex3;

public class Roupa extends Produto {
    
    double desconto = 0.20;

    public Roupa(String nome, double preco_base){

        super(nome, preco_base);
        this.preco = preco_base - (preco_base*desconto);
    }

}
