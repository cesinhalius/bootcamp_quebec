package Exercicios;

public class Quadrilatero {

    public static void area(double lado){
        System.out.println("Area de quadrado: " + lado *  lado);
    }
    public static void area(double lado1, double lado2){
        System.out.println("Area de quadrado: " + lado1 *  lado2);
    }
    public static void area(double baseMaior, double baseMenor, double altura){
        System.out.println("Area de quadrado: " + ((baseMaior+baseMenor)*altura) / 2 );
    }
}
