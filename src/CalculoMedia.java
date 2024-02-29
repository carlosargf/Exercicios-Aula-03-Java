public class CalculoMedia {
    int quantidade = 0;
    double soma = 0, nota, media;

    public void media () {
        soma += nota;
        quantidade++;
    }

    public void resultado () {
        media = soma / quantidade;
        System.out.printf("\nMédia das notas: %.2f\n", media);

        if (media >= 7) {
            System.out.println("Aluno APROVADO!");
        } else {
            System.out.println("Aluno REPROVADO!");
        }
    }
}