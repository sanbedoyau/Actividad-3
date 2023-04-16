package Cap4_Ej22;

public class Salario {
    static String salario_mens(double salariob, double horas, String nombre){
        double salario = salariob*horas;
        if (salario > 450000){
            return nombre + " su salario mensual es de $" + salario;
        }
        return nombre;
    }
}