package Cap4_Ej23;

public class Ecuacion {
    double A,B,C;
    
    Ecuacion(double A, double B, double C){
        this.A = A;
        this.B = B;
        this.C = C;
    }
       
    double solucion1(){
        return (-B + Math.sqrt(Math.pow(B, 2) - 4*A*C))/(2*A);
    }
    
    double solucion2(){
        return (-B - Math.sqrt(Math.pow(B, 2) - 4*A*C))/(2*A);
    }
}
