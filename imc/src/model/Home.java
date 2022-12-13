package model;

import java.util.Scanner;

public class Home {


    public void home() {

        Scanner sc = new Scanner(System.in);
        boolean rodando = true;

        while (rodando) {
            System.out.println("Digite seu peso:");
            double peso = sc.nextDouble();
            System.out.println("Digite sua altura:");
            double altura = sc.nextDouble();
            double resultado;


            Pessoa p = new Pessoa();
            p.setPeso(peso);
            p.setAltura(altura);

            resultado = p.calcularIMC();

            if (resultado <= 19) {
                System.out.println("Abaixo do peso");
            } else if (resultado <= 25) {
                System.out.println("peso ideal");
            } else if (resultado <= 30) {
                System.out.println("Acima do peso");
            } else if (resultado <= 35) {
                System.out.println("Obesidade Leve");
            } else {
                System.out.println("Obesidade");
            }


        }
    }
}
