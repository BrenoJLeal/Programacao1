//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Qual seu salário? ");

        float salario = valor.nextFloat();
        float desconto;


        if (salario <= 900){
            System.out.println("Isento!");
        }
        else if(salario >= 901 && salario <= 1500) {
            desconto = salario  * 0.05f;
            float salarioT = salario - desconto;
            System.out.println("Salario final: R$" + salarioT + " desconto de 5%");
        }
        else if(salario >= 1501 && salario <= 2500){
            desconto = salario  * 0.10f;
            float salarioT = salario - desconto;
            System.out.println("Salario final: R$" + salarioT + " desconto de 10%");

        }
        else{
            desconto = salario  * 0.20f;
            float salarioT = salario - desconto;
            System.out.println("Salario final: R$" + salarioT + " desconto de 20%");
        }
    }
}