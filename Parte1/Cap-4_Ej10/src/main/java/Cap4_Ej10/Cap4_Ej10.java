package Cap4_Ej10;

import java.util.Scanner;
public class Cap4_Ej10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String Nombre, No_I;
        double Pat;
        byte Es;
        System.out.println("Ingrese el número de inscripción: ");
        No_I = input.next();
        input.nextLine();
        System.out.println("Ingrese el nombre: ");
        Nombre = input.nextLine();
        System.out.println("Ingrese el patrimonio: ");
        Pat = input.nextDouble();
        System.out.println("Ingrese el estrato: ");
        Es = input.nextByte();
        Matricula Poo = new Matricula(No_I,Nombre,Pat,Es);
        System.out.println(Nombre + " con número de inscripción " + No_I + ", el valor de su matricula es de : $" + Poo.Valor_Matricula());
    }
}
