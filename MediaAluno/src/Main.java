//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String repetir;
        Scanner input = new Scanner(System.in);


        do {
            Aluno aluno = new Aluno();
            System.out.println("Digite seu nome: ");
            aluno.setNome(input.nextLine());


            System.out.println("Digite sua primeira nota: ");
            aluno.setNota1(input.nextDouble());
            System.out.println("Digite a sua segunda nota: ");
            aluno.setNota2(input.nextDouble());
            System.out.println("Digite sua terceira nota: ");
            aluno.setNota3(input.nextDouble());

            aluno.setMedia((aluno.getNota1() + aluno.getNota2() + aluno.getNota3())/3);

            if (aluno.getMedia() >= 70){
                System.out.println("Aluno Aprovado!");
            }
            if (aluno.getMedia() <= 40){
                System.out.println("Aluno Reprovado!");
            }

            System.out.println("Aluno: " + aluno.getNome());
            System.out.println("Primeira nota: " + aluno.getNota1());
            System.out.println("Segunda nota: " + aluno.getNota2());
            System.out.println("Terceira nota: " + aluno.getNota3());
            System.out.println("Media: " + aluno.getMedia());

            System.out.println("Deseja ver a média de mais algum aluno? [S/N]");
            repetir = input.next();
        }while(repetir.equalsIgnoreCase("S"));
    }
}