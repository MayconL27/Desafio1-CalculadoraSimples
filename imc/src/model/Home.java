package model;

import java.util.Scanner;

public class Home {


    public void home() {

        Scanner sc = new Scanner(System.in);
        boolean rodando = true;



        while(rodando) {
            System.out.println("Digite seu peso:");
                double peso = sc.nextDouble();
            System.out.println("Digite sua altura:");
                double altura = sc.nextDouble();

                Pessoa p = new Pessoa();
                p.setPeso(peso);
                p.setAltura(altura);

            p.imprimir();

        }
    }
}
