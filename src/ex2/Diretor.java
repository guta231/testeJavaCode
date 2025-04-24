package ex2;

public class Diretor extends Funcionario {
    
    double participacao;

    public Diretor(String nome, double participacao){

        super(nome);
        this.participacao = participacao;

    }

    
    protected double calcular_salario(double lucros){

        this.salario = salario_fixo + lucros*this.participacao;


        return this.salario;

    }


}
