import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);

        boolean rodando = true;
    
        while(rodando) {

            System.out.println("=== CALCULADORA ===");
            System.out.println("1 Adição (+)");
            System.out.println("2 Subtração (-)");
            System.out.println("3 Multiplicação (*)");
            System.out.println("4 Divisão (/)");
            System.out.println("0 Sair");
            System.out.println("Digite a opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o Primeiro número:");
                    int num1 = sc.nextInt();
                    System.out.println("Digite o Segundo número:");
                    int num2 = sc.nextInt();

                    Calculadora calc = new Calculadora();
                    calc.setNum1(num1);
                    calc.setNum2(num2);

                    

                    
                    
                    break;

            
                default:
                    break;
            }

        }
    }


    
}
