package Cap4_Ej10;

public class Matricula {
    static double Valor_Matricula(double pat, byte est){
        if ((pat > 2000000) && (est > 3)){
            return 50000 + (pat*0.03);
        }
        return 50000;
    }
}
