import java.util.Scanner;



public class pesoideal {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu genero: ");
        System.out.println("1 - Masculino");
        System.out.println("2 - Feminino");
        int sexo = sc.nextInt();
        System.out.println("Informe a sua altura: ");
        double altura = sc.nextDouble();
        double resultado = 0.00;
        
        if (sexo == 1){
            resultado = (72.7*altura) - 58;
        }else if (sexo == 2){
            resultado = (62.1*altura) - 44.7;
        }

        System.out.println(resultado);

        sc.close();
    }
}
