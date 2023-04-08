package Cap4_Ej22;

public class Salario {
    double salariob,horas;
    String nombre;
    
    Salario(double sal, double h, String nom){
        this.salariob = sal;
        this.horas = h;
        this.nombre = nom;
    }
    
    public void salario_mens(){
        if (salariob*horas > 450000){
            System.out.println(nombre + " su salario mensual es de $" + (salariob*horas));
        }
        else{
            System.out.println(nombre);
        }
    }
}
