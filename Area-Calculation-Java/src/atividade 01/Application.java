package atividade02;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Application {
    public static void main(String[] Args){

        Circulo circulo01 = new Circulo(2);
        System.out.println("Area do Circulo" + " " + circulo01.calcularArea());

        Quadrado quadrado = new Quadrado(4);
        System.out.println("Area do Quadrado" + " " + quadrado.calcularArea());

        Retangulo retangulo = new Retangulo(2,6);
        System.out.println("Area do Retangulo" + " " + retangulo.calcularArea());

        Triangulo triangulo = new Triangulo(3,5);
        System.out.println("Area do Triangulo" + " " + triangulo.calcularArea());

        Losango losango = new Losango(10,5);
        System.out.println("Area do Losango" + " " + losango.calcularArea());

        Trapezio trapezio = new Trapezio (10, 2, 5);
        System.out.println("Area do Trapezio "+ trapezio.calcularArea());
    }
}
