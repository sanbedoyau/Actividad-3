package Cap4_Ej22;

import java.util.Scanner;
public class Cap4_Ej22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double salariob, horas;
        String nombre;
        System.out.println("Ingrese el nombre:");
        nombre = input.nextLine();
        System.out.println("Ingrese el salario por hora:");
        salariob = input.nextDouble();
        System.out.println("Ingrese el numero de horas trabajadas: ");
        horas = input.nextDouble();
        Salario Poo = new Salario(salariob,horas,nombre);
        Poo.salario_mens();
    }
    
}
