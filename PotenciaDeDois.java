import java.util.Scanner;

public class PotenciaDeDois {
    public static double PotenciaDeDois(int n){
        if(n == 0)
            return 1;
        else if(n < 0)
            return 1/PotenciaDeDois(-n);
        else
            return 2 * PotenciaDeDois(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um expoente: ");
        int n = sc.nextInt();
        System.out.println("O resultado é: " + PotenciaDeDois(n));

    }

}
