package ex1;

public class Retangulo extends Formas {
    

    double base;
    double lado;


    public Retangulo(double base, double lado){

        super("retangulo");
        this.base = base;
        this.lado = lado;


    }

    @Override
    protected String retornar_infos(){

        String informacoes = "Forma geométrica: " + this.tipo + "base em cm: " + this.base + "lado em cm: " + this.lado;

        return informacoes;

    }

    @Override
    protected double calcular_area(){
    
        double area = this.base * this.lado;

        return area;

    }
    @Override
    protected double calcular_perimetro(){

        double perimetro = (this.base*2) + (this.lado*2);

        return perimetro;
    }




}
