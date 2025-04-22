package ex1;

public class Formas {
    
    String tipo;
    

    public Formas(String tipo){

        this.tipo = tipo;
    }


    protected String retornar_infos(){
        return "tipo de forma geométrica: " + this.tipo;
    }

    protected double calcular_area(){

        return 0;
    }

    protected double calcular_perimetro(){

        return 0;
    }

}
