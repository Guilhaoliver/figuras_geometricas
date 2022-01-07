package com.senac;

public class Main {

    public static void main(String[] args) {

        double ladoQuadrado = 2.3;
        double areaDoQuadrado;
        double areaDoTriangulo;
        double areaDoCirculo;

        Calculadora calculadora = new Calculadora();

        areaDoQuadrado = Calculadora.calcularAreaDoQuadrado(ladoQuadrado);

        areaDoTriangulo = Calculadora.cacularAreaDoTriangulo(ladoQuadrado);

        areaDoCirculo = Calculadora.calcularAreaDoCirculo(ladoQuadrado);

        System.out.println(areaDoQuadrado);
        System.out.println(areaDoTriangulo);
        System.out.println(areaDoCirculo);

    }
}
