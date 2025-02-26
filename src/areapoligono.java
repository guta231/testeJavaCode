import java.util.Scanner;


public class areapoligono {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de lados do poligono: ");
        int numeroDeLados = sc.nextInt();


        

        String poligono = " ";

        double area = 0.00;

        if (numeroDeLados >= 3 && numeroDeLados <= 5){
            System.out.println("Digite a medida dos lados em cm: ");

            double medidaLado = sc.nextDouble();
            if (numeroDeLados == 3){
                poligono = "Triangulo";
                System.out.println("DIgite a altura do triangulo: ");
                double alturaTriangulo = sc.nextDouble();
                area = (medidaLado*alturaTriangulo)/2;
            }else if (numeroDeLados == 4){
                poligono = "Quadrilátero";
                area = medidaLado*medidaLado;
            }else if (numeroDeLados == 5){
                poligono = "Pentágono";
                area = ((5*(medidaLado*medidaLado))/4)*(1/0.7265);
            }
            System.out.println("O poligono é: " + poligono + " E sua area é: " + area + "cm2");
        }else if (numeroDeLados > 3){
            System.out.println("Poligono não identificado");
        }else{
            System.out.println("Não é um poligono");
        }

        
        sc.close();

    }
}
