import java.util.Scanner;

public class CalcularMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lista para armazenar as notas
        List<Double> notas = new ArrayList<>();

        // Loop do-while para inserir as notas
        double nota;
        do {
            System.out.println("Insira uma nota: ");
            nota = scanner.nextDouble();
            notas.add(nota);

            // Pergunta se o usuário deseja inserir outra nota
            System.out.println("Deseja inserir outra nota? (Digite 'Sim' ou 'Não'): ");
            String resposta = scanner.next();
        } while (resposta.equalsIgnoreCase("Sim"));

        // Calcula a média das notas
        double media = calcularMedia(notas);

        // Exibe a média das notas
        System.out.println("Média das notas: " + media);
    }

    private static double calcularMedia(List<Double> notas) {
        double soma = 0;
        for (Double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }
}