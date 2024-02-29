import java.util.Scanner;

public class Maincalc {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        Scanner sc = new Scanner(System.in);
        String r;
        int n1, n2;

        do {
            System.out.print("Número 1: ");
            n1 = sc.nextInt();

            System.out.print("Número 2: ");
            n2 = sc.nextInt();

            System.out.print("Opção 1: Somar os números \nOpção 2: Diminuir os números \nOpção 3: Multiplicar os números \nOpção 4: Dividir os números. \nDigite o número da opção: ");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Resultado: " + c.somar(n1, n2));
                    break;
                case 2:
                    System.out.println("Resultado: " + c.diminuir(n1, n2));
                    break;
                case 3:
                    System.out.println("Resultado: " + c.multiplicar(n1, n2));
                    break;
                case 4:
                    System.out.println("Resultado: " + c.dividir(n1, n2));
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            System.out.println("Escolher outra opção: S / N?");
            r = sc.next();

            if (r.equalsIgnoreCase("N")) {
                break;
            }
        } while (r.equalsIgnoreCase ("S"));
        System.out.println("Finalizando.");
    }
}