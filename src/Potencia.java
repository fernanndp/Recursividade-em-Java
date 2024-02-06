import java.util.Scanner;

public class Potencia {

    public static int Pot(int x, int n) {
        if (n == 0)
            return 1;
        else
            return x * Pot(x, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para a base: ");
        int x = sc.nextInt();
        System.out.println("Digite um número para o expoente: ");
        int n = sc.nextInt();;
        int resultado = Pot(x, n);
        System.out.println("O resultado é: " + resultado);
    }
}
