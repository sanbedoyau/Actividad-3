package Cap3_Ej18;

public class Trabajo {
    static double salario_bruto(double horas, double salario){
        return horas*salario;
    }
    static double salario_neto(double horas, double salario, double porcentaje){
        double salario_n = (horas*salario)*(1-porcentaje);
        return salario_n;
    }
}