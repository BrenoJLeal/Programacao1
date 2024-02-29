//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String repetir;
        do {
            System.out.println("Digite seu nome: ");
            String nome = input.next();
            System.out.println("Digite sua idade: ");
            int idade = input.nextInt();
            System.out.println("Seu nome é " + nome);
            System.out.println("Sua idade é " + idade);

            System.out.println("Você deseja repetir S/N ?");
            repetir = input.next();
        }while(repetir.equalsIgnoreCase("S"));


    }
}