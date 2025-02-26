import java.util.Scanner;


public class classificacaotriangulos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a medida de cada lado do triangulo: ");
        System.out.println("Lado 1: ");
        double lado1 = sc.nextDouble();
        System.out.println("lado 2: ");
        double lado2 = sc.nextDouble();
        System.out.println("lado 3: ");
        double lado3 = sc.nextDouble();


        if (lado1 == lado2 && lado2 == lado3){
            System.out.println("o triangulo é equilátero");
        }else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
            System.out.println("o triangulo é isóscele");
        }else{
            System.out.println("o triangulo é escaleno");
        }

        sc.close();
    }
}
