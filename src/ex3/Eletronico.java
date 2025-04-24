package ex3;

public class Eletronico extends Produto {
    

    double desconto = 0.10;

    public Eletronico(String nome, double preco_base){

        super(nome, preco_base);
        this.preco = preco_base - (preco_base*desconto);
        
    }

}
