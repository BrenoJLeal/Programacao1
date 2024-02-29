//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner preco = new Scanner(System.in);

        float fruta = 0 ;
        float valor = 0;

        System.out.println("Difite o numero de maçãs: ");
        fruta = preco.nextFloat();

        if (fruta == 12){
             valor = fruta * 1.00F;
        } else{
            valor = fruta * 1.30F;
        }
        System.out.print(valor);
    }
}