package Cap4_Ej10;

public class Matricula {
    String num,nom;
    double pat;
    byte est;
    
    Matricula(String num, String nom, double pat, byte est){
        this.num = num;
        this.nom = nom;
        this.pat = pat;
        this.est = est;
    }
    
    double Valor_Matricula(){
        if ((pat > 2000000) && (est > 3)){
            return 50000 + (pat*0.03);
        }
        return 50000;
    }
}
