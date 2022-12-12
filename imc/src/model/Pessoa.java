package model;

public class Pessoa {

    private double peso;
    private double altura;

    public Pessoa() {
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public void imprimir() {
        System.out.println(getPeso());
        System.out.println(getAltura());
    }
}
