package PruebaFiguras;

public class Triangulo extends Triangulo_Rectangulo{
    
    static String tipo_triangulo(double a, double b){
        double c = calcular_hipotenusa(a,b);
        if ((a != b) && (a != c) && (b != c)){
            return "Es un triángulo escaleno";
        }
        else if (((a == b) && (a != c)) || ((a == c) && (a != b)) || (b == c) && (b != a)){
            return "Es triángulo isóceles";
        }
        return "Es triángulo equilátero";
    }
    
    static double calcular_perimetro(double a, double b){
        double c = calcular_hipotenusa(a,b);
        return a + b + c;
    }
}
