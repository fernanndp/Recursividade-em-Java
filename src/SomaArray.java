
import java.util.Scanner;

public class SomaArray {

    public static int soma(int[] v, int n) {
        return n == 0 ? 0 : v[n - 1] + soma(v, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do array: ");
        int n = sc.nextInt();
        System.out.println("Digite os números do array: ");
        int[] v = new int[n];

        for(int i = 0; i < n; ++i) {
            v[i] = sc.nextInt();
        }
        int vetor = soma(v, n);
        System.out.println("A soma dos elementos do array é: " + vetor);
    }
}
