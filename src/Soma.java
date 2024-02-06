import java.util.Scanner;

public class Soma {

    public static int Soma(int n) {
        if (n == 0)
            return 0;
        else
            return n + Soma(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite N: ");
        int n = sc.nextInt();
        System.out.println("A soma de 1 até N é: " + Soma(n));
    }
}