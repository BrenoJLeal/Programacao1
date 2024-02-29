//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);
        System.out.println("Qual a primeira nota? ");
        float n1 = notas.nextFloat();
        System.out.println("Qual a segunda nota? ");
        float n2 = notas.nextFloat();
        System.out.println("Qual a terceira nota? ");
        float n3 = notas.nextFloat();
        float media = (n1 + n2 + n3/ 3);

        DecimalFormat df = new DecimalFormat("0.00");
        String mediaFormatada = df.format(media);

        if (media >= 70) {
            System.out.println("Sua nota foi " + mediaFormatada + " Aprovado!!");
        }
        else{
            System.out.println("Sua nota foi " + mediaFormatada + "Reprovado!!");
        }
    }
}