//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int repetir;
        Scanner input = new Scanner(System.in);

        do {
            Numeros numeros = new Numeros();

            System.out.println("Digite o primeiro valor: ");
            numeros.setN1(input.nextDouble());
            System.out.println("Digite o segundo valor: ");
            numeros.setN2(input.nextDouble());

            System.out.println("Escolha uma opção: 1 para somar | 2 para subtrair | 3 para multiplicar | 4 para dividir");
            int x = input.nextInt();
            switch (x){
                case 1:
                    double soma = numeros.getN1() + numeros.getN2();
                    System.out.println(soma);
                    break;
                case 2:
                    double subtrair = numeros.getN1() - numeros.getN2();
                    System.out.println(subtrair);
                    break;
                case 3:
                    double multiplicar = numeros.getN1() * numeros.getN2();
                    System.out.println(multiplicar);
                    break;
                case 4:
                    double dividir = numeros.getN1()/ numeros.getN2();
                    System.out.println(dividir);
                    break;
            }
            System.out.println("Caso deseja calcular algo novamente digite 0");

            repetir = input.nextInt();
        }while (repetir == 0);
    }
}