package team.ed.ejecutar;

import team.ed.formas.Circulo;
import team.ed.formas.Figura;
import team.ed.formas.Rectangulo;
import team.ed.formas.Triangulo;

public class PruebaFormas {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo("rectangulo", 120, 30);
        System.out.println("Nombre: "+ rectangulo.getNombre());
        System.out.println("Area: "+ rectangulo.getArea());
        System.out.println("Perímetro: "+ rectangulo.getPerimetro());
        System.out.println("-------------------------");

        Figura figuras[] = new Figura[3];
        figuras[0] = new Triangulo("Triangulo", 15, 50);
        figuras[1] = new Circulo("Cirulo", 34);
        figuras[2] = new Rectangulo("rectangulo", 34,120);

        for(Figura item : figuras){

            System.out.println("Nombre:  "+item.getNombre());
            System.out.println("Area:  "+item.getArea());
            System.out.println("Perimetro:  "+item.getPerimetro());
            System.out.println("-------------------------");
        }



    }
}
