import java.util.Scanner;


public class saldocomreajuste {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double saldo;
        double reajuste = 0.1;

        System.out.println("Digite o saldo: ");
        saldo = sc.nextDouble();

        saldo += saldo*reajuste;

        System.out.println("Saldo reajustado: " + saldo);


        sc.close();
    }
}
