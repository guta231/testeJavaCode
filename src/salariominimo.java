import java.util.Scanner;


public class salariominimo {
    

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double salarioUsuario;
        double salarioMinimo = 1517.00;
        double resultado;

        System.out.println("Qual o seu salário: ");
        salarioUsuario = sc.nextDouble();
        resultado = salarioUsuario/salarioMinimo;

        System.out.println("Voce ganha " + String.format("%.2f", resultado) + " Salários minimos");


        sc.close();
    }
}
