package atividade02;

public class Circulo extends FiguraGeometrica {

    private double raio;

    public Circulo(double raio) {this.raio = raio;}

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}
