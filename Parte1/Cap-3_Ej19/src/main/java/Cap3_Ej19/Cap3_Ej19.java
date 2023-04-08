package Cap3_Ej19;

import java.util.Scanner;
public class Cap3_Ej19 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del lado: ");
        float l = input.nextFloat();
        
        Triangulo Poo = new Triangulo(l);
        System.out.println("El perímetro del triángulo equilatero es: " + Poo.perimetro());
        System.out.println("La altura del triángulo equilátero es: " + Poo.calc_altura());
        System.out.println("EL área del triángulo equilátero es: " + Poo.area());
    }
}
