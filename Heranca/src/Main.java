import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String repetir;
        Aluno a = new Aluno();
        Professor pr = new Professor();
        Coordenador c = new Coordenador();
        do {
            System.out.println("Escolha entre: 1 - Aluno | 2 - Professor | 3 - Coordenador: ");
            int x = input.nextInt();
            switch (x){
                case 1:
                    System.out.println("Qual o nome do Aluno? ");
                    a.setNome(input.next());
                    System.out.println("Qual a sua matricula? ");
                    a.setMatricula(input.nextInt());
                    System.out.println("----- Aluno -----");
                    System.out.println("Aluno:" + a.getNome());
                    System.out.println("Matricula: " + a.getMatricula());
                    break;
                case 2:
                    System.out.println("Qual o nome do Professor? ");
                    pr.setNome(input.next());
                    System.out.println("Qual a cadeira ? ");
                    pr.setCadeira(input.next());
                    System.out.println("----- Professor -----");
                    System.out.println("Professor:" + pr.getNome());
                    System.out.println("Cadeira: " + pr.getCadeira());
                    break;
                case 3:
                    System.out.println("qual o nome do Coordenador? ");
                    c.setNome(input.next());
                    System.out.println("----- Coordenador -----");
                    System.out.println("Coordenador: " + c.getNome());
                    break;
                default:
                    System.out.println("Opção inválida !");
            }
            System.out.println("Você deseja repetir ? [S/N]");
            repetir = input.next();
        }while (repetir.equalsIgnoreCase("S"));






    }
}