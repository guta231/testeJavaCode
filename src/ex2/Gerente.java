package ex2;

public class Gerente extends Funcionario {

    double bonus_fixo;
    

    public Gerente(String nome){

        super(nome);
        this.bonus_fixo = 4000.00;
        
    }


    @Override
    protected double calcular_salario(){

        this.salario = this.salario_fixo + bonus_fixo;

        return this.salario;
    }

    protected double calcular_salario(double novo_bonus){

        this.salario = this.salario_fixo + novo_bonus;

        return this.salario;
    }

}
