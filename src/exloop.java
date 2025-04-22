import java.util.Scanner;

public class exloop {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        

        while (true){

            String entrada;
            System.out.println("Digite a entrada: ");
            entrada = sc.next();

            if (entrada.equals("PARE")){
                break;
            }else{
                continue;
            }
        }




        sc.close();
    }
}
