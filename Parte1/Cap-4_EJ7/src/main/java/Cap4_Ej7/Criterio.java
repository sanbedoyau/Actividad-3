package Cap4_Ej7;

public class Criterio {
    double A,B;
    
    Criterio(double A, double B){
        this.A = A;
        this.B = B;
    }
    
    String mayor_menor(){
        if (A>B){
            return "Mayor";
        }
        else if (A<B){
            return "Menor";
        }
        return "Igual";
    }
}
