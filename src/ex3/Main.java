package ex3;

public class Main {
    


    public static void main(String[] args){



        Produto produto1 = new Produto("Desodorante", 15.00);

        produto1.exibir_info();

        Livro livro1 = new Livro("Senhor dos Anéis", 99.98);

        livro1.exibir_info();

        Roupa roupa1 = new Roupa("Bermuda da Ciclone", 79.96);

        roupa1.exibir_info();

        Eletronico eletronico1 = new Eletronico("Geladeira", 836.99);

        eletronico1.exibir_info();


    }
}
