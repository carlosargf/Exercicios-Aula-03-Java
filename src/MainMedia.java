import java.util.Locale;
import java.util.Scanner;

public class MainMedia {
    public static void main(String[] args) {
        String repetir = "S";

        CalculoMedia calc = new CalculoMedia();

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao calculador de média do aluno!");

        while (repetir.equalsIgnoreCase("S")) {
            System.out.print("Insira uma nota do aluno: ");
            calc.nota = sc.nextDouble();

            calc.media();

            System.out.print("Deseja inserir outra nota? Digite 'S' para Sim ou 'N' para Não: ");
            repetir = sc.next();

            if (repetir.equalsIgnoreCase("N")) {
                break;
            }
        }

        calc.resultado();

        System.out.println("\nObrigado por usar o programa!");
    }
}