import java.util.Scanner;



public class conversaotemperatura {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //Variáveis globais
        double temperaturaC;
        double temperaturaF;
        double temperaturaK;
        double temperaturaRe;
        double temperaturaRa;


        //Input da temperatura em celsius
        System.out.println("Digite a temperatura que queira converter em Celsius: ");
        temperaturaC = sc.nextDouble();

        //cálculo
        temperaturaF = temperaturaC*1.8 + 32;
        temperaturaK = temperaturaC + 273.15;
        temperaturaRe = temperaturaC*0.8;
        temperaturaRa = temperaturaC*1.8 + 32 + 459.67;

        //exibição do resultado

        System.out.println("temperatura em Celsius: " + temperaturaC + " / temperatura em Fahrenheit: " + temperaturaF + " / temperatura em Kelvin: " + temperaturaK + " / temperatura em Rankine: " + temperaturaRa + " / temperatura em Réaumur: " + temperaturaRe);
        



        sc.close();
    }
}
