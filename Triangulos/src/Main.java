//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner lados = new Scanner(System.in);

        System.out.println("Qual o valor do lado 1: ");
        double l1 = lados.nextDouble();
        System.out.println("Qual o valor do lado 2: ");
        double l2 = lados.nextDouble();
        System.out.println("Qual o valor do lado 3: ");
        double l3 = lados.nextDouble();
        if(l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {
            if (l1 == l2 && l1 == l3) {
                System.out.println("Equilátero! ");
            } else if (l1 == l2 || l2 == l3 || l1 == l3) {
                System.out.println("Isósceles");
            } else {
                System.out.println("Escaleno");
            }
        }else{
            System.out.println("Não é um triângulo");
        }
    }
}