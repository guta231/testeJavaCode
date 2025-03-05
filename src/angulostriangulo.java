import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;



public class angulostriangulo {
    

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int angulosMaior90 = 0;
        int angulosMenor90 = 0;
        boolean anguloIgual90 = false;
        double somaDosAngulos = 0;

        List<Double> triangulos = new ArrayList<>();

        for (int i=1; i < 4; i++){
            System.out.println("Digite o valor do angulo " + i + ": ");
            double angulo = sc.nextDouble();
            triangulos.add(angulo);
        }

        System.out.println(triangulos);

        for (double angulo : triangulos){
            if (angulo == 90){
                anguloIgual90 = true;
            }else if (angulo > 90){
                angulosMaior90++;
            }else if (angulo < 90){
                angulosMenor90++;
            }
            somaDosAngulos = somaDosAngulos + angulo;
            
        }
        if (anguloIgual90 && somaDosAngulos == 180){
            System.out.println("Triângulo Retângulo");
        }else if (angulosMenor90 == 3 && somaDosAngulos == 180){
            System.out.println("Triângulo Acutângulo");
        }else if (angulosMaior90 == 1 && somaDosAngulos == 180){
            System.out.println("Triângulo Obtusângulo");
        }else {
            System.out.println("Não é um triângulo");
        }


        sc.close();
        
    }
}
