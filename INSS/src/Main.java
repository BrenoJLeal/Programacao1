//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o numero da sua matricula: ");
        int matri = input.nextInt();
        input.nextLine();

        System.out.println("Digite seu nome completo: ");
        String nome = input.nextLine();
        System.out.println("Digite seu salário bruto: ");
        double salario = input.nextDouble();

        double inss = salario * 0.15;
        double salarioL = salario - inss;

        System.out.println("Sua matricula é: " + matri);
        System.out.println("Seu nome completo é: " + nome);
        System.out.println("Seu salário bruto é: " + salario);
        System.out.println("A dedução foi de: " + inss);
        System.out.println("Seu salário líquido é: " + salarioL);


    }
}