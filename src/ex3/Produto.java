package ex3;

public class Produto {
    
    String nome;
    double preco;


    public Produto(String nome, double preco_base){

        this.nome = nome;
        this.preco = preco_base;

    }


    protected void exibir_info(){


        System.out.printf("Nome: %s %n Preço: %.2f%n", this.nome, this.preco);

    }





}
