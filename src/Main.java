import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira da idade: ");
        p.idade = sc.nextInt();

        System.out.println("antiga:" + p.idade);
        p.niver();
        System.out.println("atual:" + p.idade);
    }
}