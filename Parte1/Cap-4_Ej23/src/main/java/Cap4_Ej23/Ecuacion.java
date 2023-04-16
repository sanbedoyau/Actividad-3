package Cap4_Ej23;

public class Ecuacion {
    static double solucion1(double A, double B, double C){
        return (-B + Math.sqrt(Math.pow(B, 2) - 4*A*C))/(2*A);
    }
    
    static double solucion2(double A, double B, double C){
        return (-B - Math.sqrt(Math.pow(B, 2) - 4*A*C))/(2*A);
    }
}
