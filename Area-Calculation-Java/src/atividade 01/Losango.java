package atividade02;

public class Losango extends FiguraGeometrica {

  private double diag_m;
  private double diag_n;

  public Losango (double diagonalM, double diagonalN) {
    this.diag_m = diagonalM;
    this.diag_n = diagonalN;
    
  }
  @Override
  public double calcularArea(){
    return (diag_m * diag_n) / 2;
  }
}