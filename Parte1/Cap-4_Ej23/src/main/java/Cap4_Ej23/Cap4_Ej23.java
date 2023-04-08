package Cap4_Ej23;

import java.util.Scanner;
public class Cap4_Ej23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double A,B,C;
        System.out.println("Ecuación cuadrática de la forma Ax²+Bx+C=0");
        System.out.println("Ingrese el valor de A: ");
        A = input.nextDouble();
        System.out.println("Ingrese el valor de B: ");
        B = input.nextDouble();
        System.out.println("Ingrese el valor de C: ");
        C = input.nextDouble();
        Ecuacion Poo = new Ecuacion(A,B,C);
            if (Math.pow(B,2) - (4*A*C) >= 0){
                System.out.println("Las soluciones son x = " + Poo.solucion1() + " ^ x = " + Poo.solucion2());
            }
            else{
                System.out.println("Esta ecuación no tiene soluciones reales");
            }
    }
}
