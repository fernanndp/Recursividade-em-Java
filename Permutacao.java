import java.util.Scanner;

public class Permutacao {
    public static void Permuta(String p, String s) {
        int n = s.length();
        if (n == 0)
            System.out.print(p + " ");
        else
            for (int i = 0; i < n; i++) {
                Permuta(p + s.charAt(i), s.substring(0,i) + s.substring(i+1));
            }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um conjunto de símbolos a ser permutado: ");
        String simbolos = sc.next();

        System.out.println("Permutações: ");
        Permuta("", simbolos);
        }
    }