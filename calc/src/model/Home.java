package model;

import java.util.Scanner;

public class Home {

    public void home() {
        Scanner sc = new Scanner(System.in);
        boolean rodando = true;
        int num1, num2;
        while (rodando) {

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
                    num1 = sc.nextInt();
                    System.out.println("Digite o Segundo número:");
                    num2 = sc.nextInt();

                    Calculadora calc = new Calculadora(num1, num2);
                    calc.setNum1(num1);
                    calc.setNum2(num2);

                    System.out.println("A soma de " + num1 + " + " + num2 + " = " + calc.soma() + "\n");

                    break;
                case 2:
                    System.out.println("Digite o Primeiro número:");
                    num1 = sc.nextInt();
                    System.out.println("Digite o Segundo número:");
                    num2 = sc.nextInt();

                    Calculadora calc2 = new Calculadora(num1, num2);
                    calc2.setNum1(num1);
                    calc2.setNum2(num2);

                    System.out.println("A subtração de " + num1 + " - " + num2 + " = " + calc2.sub() + "\n");

                    break;

                case 3:
                    System.out.println("Digite o Primeiro número:");
                    num1 = sc.nextInt();
                    System.out.println("Digite o Segundo número:");
                    num2 = sc.nextInt();

                    Calculadora calc3 = new Calculadora(num1, num2);
                    calc3.setNum1(num1);
                    calc3.setNum2(num2);

                    System.out.println("A multiplicação de " + num1 + " * " + num2 + " = " + calc3.mult() + "\n");

                    break;

                case 4:
                    System.out.println("Digite o Primeiro número:");
                    num1 = sc.nextInt();
                    System.out.println("Digite o Segundo número:");
                    num2 = sc.nextInt();

                    Calculadora calc4 = new Calculadora(num1, num2);
                    calc4.setNum1(num1);
                    calc4.setNum2(num2);

                    System.out.println("A divisão de " + num1 + " / " + num2 + " = " + calc4.div() + "\n");

                    break;

                case 0:
                    System.out.println("Saindo...");
                    rodando = false;

                    break;

                default:
                    System.out.println("Opção inválida digite uma opção válida do menu: \n ***************");
                    break;
            }

        }
        System.out.println("Fim");
        sc.close();
    }
}


