package Cap4_Ej7;

import java.util.Scanner;
public class Cap4_Ej7 {
    public static void main(String[] args){
        double A,B;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el valor de A:");
        A = input.nextDouble();
        System.out.println("Ingrese el valor de B: ");
        B = input.nextDouble();
        Criterio c = new Criterio(A,B);
        String d = c.mayor_menor();
        if (d == "Mayor"){
            System.out.println(A + " es mayor que " + B);
        }
        else if(d == "Menor"){
            System.out.println(A + " es menor que " + B);
        }
        else if (d == "Igual"){
            System.out.println(A + " es igual a " + B);
        }
    }
}
