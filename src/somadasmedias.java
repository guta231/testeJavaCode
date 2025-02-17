import java.util.Scanner;


public class somadasmedias {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite os numero da média");
        double media1 = (8 + 9 + 7) / 3;
        System.out.println("Media 1: " + media1);
        double media2 = (4 + 5 + 6) / 3;
        System.out.println("Media 2: " + media2);
        double soma = media1 + media2;
        System.out.println("Soma das médias: " + soma);
        double mediaSoma = (media1 + media2) / 2;
        System.out.println("Média das medias: " + mediaSoma);
        
        
        
        sc.close();

    }
    
}
