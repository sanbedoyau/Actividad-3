package Cap4_Ej7;

public class Criterio {
    static double A,B;
    
    static String mayor_menor(double A, double B){
        if (A>B){
            return "A es mayor que B";
        }
        else if (A<B){
            return "A es menor que B";
        }
        return "A y B son iguales";
    }
}
