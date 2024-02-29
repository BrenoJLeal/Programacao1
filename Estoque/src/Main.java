//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner estoque = new Scanner(System.in);
        System.out.println("Qual a quantidade atual em estoque: ");
        int qtaEstoque = estoque.nextInt();


        System.out.println("Qual a quantidade maxima de estoque: ");
        int qtaMax = estoque.nextInt();


        System.out.println("Qual a quantidade minima de estoque: ");
        int qtaMin = estoque.nextInt();

        int qtaMedia = (qtaMax + qtaMin)/2;

        if (qtaEstoque >= qtaMedia){
            System.out.println("Não efetuar compra");
        }
        else{
            System.out.println("Efetuar compra");
        }
        estoque.close();
    }
}