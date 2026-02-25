import java.util.Scanner; 

public class desafiodeatividade {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x;
        int y;

        System.out.println("Digite o primeiro número:");
        x = sc.nextInt();
        
        System.out.println("Digite o segundo número:");
        y = sc.nextInt();

        System.out.println("Soma = " + (x + y));

        sc.close();
    }
}
