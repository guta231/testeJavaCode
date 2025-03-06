import java.util.Scanner;



public class exloop2 {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);


        int numeroInicial;
        int numeroFinal;


        System.out.println("Digite o numero inicial do intervalo: ");
        numeroInicial = sc.nextInt();
        System.out.println("Digite o numero final do intervalo: ");
        numeroFinal = sc.nextInt();

        for (int i = numeroInicial; i <= numeroFinal; i++){
            System.out.println(i);
        }
        




        sc.close();
    }
}
