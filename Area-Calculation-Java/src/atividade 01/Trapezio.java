package atividade02;

public class Trapezio extends FiguraGeometrica {

  private double bMaior;
  private double bMenor;
  private double altura;

  public Trapezio (double bMaior, double bMenor, double altura){
    this.bMaior = bMaior;
    this.bMenor = bMenor;
    this.altura = altura;

  }
  @Override
  public double calcularArea() {
    return ((bMaior + bMenor) * altura) / 2;
  }
    
}