import java.util.Scanner;



public class leituraidade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        

        System.out.println("coloque a quantidade de anos: ");
        int idadeAnos = sc.nextInt();
        System.out.println("Digite a quantidade de meses: ");
        int idadeMeses = sc.nextInt();
        System.out.println("Digite a quantidade de dias: ");
        int idadeDias = sc.nextInt();

        int resultadoDias = (idadeAnos * 365) + (idadeMeses * 30) + (idadeDias);

        System.out.println(resultadoDias);
        
        sc.close();
    }
    
}
