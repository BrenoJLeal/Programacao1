package ImpostoDeRenda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String repetir;
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        do {
            Pessoa pessoa = new Pessoa();

            System.out.println("Digite sua matricula: ");
            pessoa.Matricula(input.next());
            System.out.println("Digite seu nome: ");
            pessoa.Nome(input.next());

            System.out.println("Digite o seu sálario bruto: ");
            pessoa.Bruto(input2.nextDouble());

            pessoa.INSS((pessoa.devolverBruto() * 15)/100);
            pessoa.Liquido(pessoa.devolverBruto() - pessoa.devolverINSS());


            System.out.println("Matricula: " + pessoa.devolverMatricula());
            System.out.println("Nome: " + pessoa.devolverNome());
            System.out.println("Salário Bruto: " + pessoa.devolverBruto());
            System.out.println("INSS: " + pessoa.devolverINSS());
            System.out.println("Salário Líquido: " + pessoa.devolverLiquido());

            System.out.println("Você deseja cadastras mais uma pessoa? [S/N]");
            repetir = input.next();
        }while (repetir.equalsIgnoreCase("S"));

    }
}