package ex4;

public class Main {
    


    public static void main(String[] args){

        Domestico passagem_normal = new Domestico("São Paulo", "João pessoa", "5 de junho", 2717);

        passagem_normal.calcular_preco();

        passagem_normal.exibir_info();

        Internacional passagem_internacional = new Internacional("Brasil", "Japão", "11 de dezembro", 18000);

        passagem_internacional.calcular_preco(25.07);

        passagem_internacional.exibir_info();

    }
}
