import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        


        int numero1;
        int numero2;
        int soma;
        String nome;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        numero1 = sc.nextInt();
        System.out.println("Digite o segundo número");
        numero2 = sc.nextInt();

        soma = numero1 + numero2;
        System.out.println("o Valor da soma dos números é: " + soma);



        System.out.println("Digite o seu nome: ");
        nome = sc.next();
        System.out.println("Seu nome é: " + nome);
        sc.close();
    }
}
