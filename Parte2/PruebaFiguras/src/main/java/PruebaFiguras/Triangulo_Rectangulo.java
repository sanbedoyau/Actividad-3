package PruebaFiguras;

public class Triangulo_Rectangulo{
    static double calcular_hipotenusa(double a, double b){
        return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }
    static double calcular_area(double a, double b){
        return (a*b)/2;
    }
}
