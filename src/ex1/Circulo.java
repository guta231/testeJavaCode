package ex1;

public class Circulo extends Formas {
    

    double diametro;
    double raio;

    public Circulo(String tipo, double diametro, double raio){

        super("Circulo");
        this.diametro = diametro;
        this.raio = this.diametro/2;

    }


    @Override
    protected double calcular_area(){

        double area = 3.14*(this.raio*this.raio);
        return area;

    }
    @Override 
    protected String retornar_infos(){

        String informacoes = "tipo de forma geométrica: " + this.tipo + "diametro: " + this.diametro + "raio: " + this.raio;
        return informacoes;

    }
    @Override
    protected double calcular_perimetro(){

        double perimetro = 2*3.14*this.raio;
        return perimetro;

    }

}
