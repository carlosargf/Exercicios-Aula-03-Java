public class CalculoINSS {
    double percentual = 0.15, desconto, bruto, liquido;

    public void inss () {
        desconto = bruto * percentual;
        liquido = bruto - desconto;

        System.out.println("Salário Bruto: " + bruto + " reais");
        System.out.println("Dedução do INSS: " + desconto + " reais");
        System.out.println("Salário Líquido: " + liquido + " reais");
    }
}