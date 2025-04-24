package ex3;

public class Livro extends Produto {
    
    double desconto = 0.05;

    public Livro(String nome, double preco_base){

        super(nome, preco_base);
        this.preco = preco_base - (preco_base*desconto);
        
    }


}
