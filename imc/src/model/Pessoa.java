package model;

public class Pessoa {

    private double peso;
    private double altura;

    private double resultado;

    public Pessoa() {
        this.peso = peso;
        this.altura = altura;
        this.resultado = resultado;
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

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double calcularIMC() {
       return peso / (altura * altura);
    }


}
