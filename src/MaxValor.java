import java.util.Scanner;

public class MaxValor {
    public static int Max(int[] v, int n) {
        if (n == 1) {
            return v[0];
        } else {
            int aux = Max(v, n - 1);
            if (v[n - 1] > aux)
                return v[n - 1];
            return aux;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do array: ");
        int n = sc.nextInt();
        System.out.println("Digite os elementos do array: ");
        int[] v = new int[n];
        for(int i = 0; i < n; ++i) {
            v[i] = sc.nextInt();
        }
        int vetor = Max(v, n);
        System.out.println("O valor máximo é: " + vetor);
    }
}