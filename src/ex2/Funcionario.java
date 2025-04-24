package ex2;

public class Funcionario {
    
    String nome;
    double salario_fixo = 2000.00;
    double salario;


    public Funcionario(String nome){

        this.nome = nome;
        this.salario = salario_fixo;

    }

    protected void exibir_info(){

        System.out.printf("Nome do funcionario: %s %n salário: %.2f%n", this.nome, this.salario);

    }


    protected double calcular_salario(){

        return this.salario_fixo;
    }




}
