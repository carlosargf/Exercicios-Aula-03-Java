import java.util.Scanner;

public class MainINSS {
    public static void main(String[] args) {
        String repetir;

        CalculoINSS c = new CalculoINSS();

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        do {
            System.out.print("Informe a Matrícula: ");
            int matricula = sc.nextInt();

            System.out.print("Informe o Nome Completo: ");
            String nome = sc2.nextLine();

            System.out.print("Informe o Salário Bruto: ");
            c.bruto = sc3.nextInt();

            System.out.println("Matrícula: " + matricula);
            System.out.println("Nome Completo: " + nome);

            c.inss();

            System.out.println("Deseja inserir novos dados? S / N?");
            repetir = sc.next();

            if (repetir.equalsIgnoreCase("N")) {
                break;
            }
        } while (repetir.equalsIgnoreCase("S"));
        System.out.println("Finalizando.");
    }
}