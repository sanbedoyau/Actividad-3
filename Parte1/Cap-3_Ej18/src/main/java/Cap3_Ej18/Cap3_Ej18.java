package Cap3_Ej18;

import java.util.Scanner;
public class Cap3_Ej18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el código del trabajador: ");
        String cod = input.nextLine();
        System.out.println("Ingrese el nombre del trabajador: ");
        String nom = input.nextLine();
        System.out.println("Ingrese el número de horas trabajadas: ");
        int h = input.nextInt();
        System.out.println("Ingrese el salario por hora: ");
        double sal = input.nextDouble();
        System.out.println("Ingrese el porcentaje de retención(%): ");
        float porc = input.nextFloat();
        porc /= 100;

        Trabajo Poo = new Trabajo(h, sal, porc);
        System.out.println(nom + " con código " + cod + ". Su salario bruto es de: $" + Poo.salario_bruto() + ", y después de la retención, un salario neto de: $" + Poo.salario_neto());
    }
}