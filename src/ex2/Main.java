package ex2;

public class Main {
    

    public static void main(String[] args){

        Funcionario funcionario1 = new Funcionario("Carlos");

        funcionario1.exibir_info();

        Gerente gerente1 = new Gerente("Gerson");

        gerente1.calcular_salario();

        gerente1.exibir_info();

        Diretor diretor1 = new Diretor("Emilia", 0.1);

        diretor1.calcular_salario(100000);

        diretor1.exibir_info();


    }
}
