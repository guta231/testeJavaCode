import java.util.Scanner;

public class antecessorsucessor {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite um numero inteiro: ");
        int num = sc.nextInt();
        int antecessor = num - 1;
        int sucessor = num + 1;

        System.out.println("O número escolhido é: " + num + " Seu sucessor é: " + sucessor + " Seu antecessor é: " + antecessor);

        sc.close();

    }
}
