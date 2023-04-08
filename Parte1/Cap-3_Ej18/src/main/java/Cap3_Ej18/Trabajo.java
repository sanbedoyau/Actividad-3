package Cap3_Ej18;

public class Trabajo {
    int horas;
    double salario;
    float porcentaje;
    
    Trabajo(int horas, double salario, float porcentaje){
        this.horas = horas;
        this.salario = salario;
        this.porcentaje = porcentaje;
    }
    double salario_bruto(){
        double salario_b = horas*salario;
        return salario_b;
    }
    double salario_neto(){
        double salario_n = (horas*salario)*(1-porcentaje);
        return salario_n;
    }
}