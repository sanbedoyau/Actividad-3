package PruebaFiguras;

public class Cuadrado extends Rectangulo{
    static double calcular_perimetro(double lado){
        return calcular_perimetro(lado,lado);
    }
    static double calcular_area(double lado){
        return calcular_area(lado,lado);
    }
}