import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o primeiro número:");
        int n1 = sc.nextInt();
        System.out.print("Insira o segundo número:");
        int n2 = sc.nextInt();
        int result = n1 + n2;
        System.out.print("Resultado: " + result + "\n");
    }
}