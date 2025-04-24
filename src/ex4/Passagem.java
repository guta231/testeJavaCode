package ex4;

public class Passagem {
    

    String origem;
    String destino;
    String data;
    double preco;
    double distancia;

    public Passagem(String origem, String destino, String data, double distancia){

        this.origem = origem;
        this.destino = destino;
        this.data = data;
        this.distancia = distancia;

    }

    protected void exibir_info(){

        System.out.printf("Origem: %s %n Destino: %s %n Data: %s %n Distancia: %.2fKm %n Preço: %.2f%n", this.origem, this.destino, this.data, this.distancia, this.preco);

    }

    protected double calcular_preco(){

        return this.preco;


    }



}
