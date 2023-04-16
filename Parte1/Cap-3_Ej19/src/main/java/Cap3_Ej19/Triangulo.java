package Cap3_Ej19;

public class Triangulo {
    static double perimetro(float lado){
        return lado*3;
    }
    
    static double calc_altura(float lado){
        return Math.sqrt(Math.pow(lado,2) - Math.pow((lado/2),2));
    }
    
    static double area(float lado){
        double a = (Math.sqrt(Math.pow(lado,2) - Math.pow((lado/2),2)))*lado/2;
        return a;
    }
}
