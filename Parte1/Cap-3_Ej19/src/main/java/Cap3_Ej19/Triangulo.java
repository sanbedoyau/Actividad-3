package Cap3_Ej19;

public class Triangulo {
    float lado;
    
    Triangulo(float lado){
        this.lado = lado;
    }
    float perimetro(){
        float p = lado*3;
        return p;
    }
    
    double calc_altura(){
        double h = Math.sqrt(Math.pow(lado,2) - Math.pow((lado/2),2));
        return h;
    }
    
    double area(){
        double a = (Math.sqrt(Math.pow(lado,2) - Math.pow((lado/2),2)))*lado/2;
        return a;
    }
}
