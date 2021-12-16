package team.ed.formas;

public class Triangulo implements Figura{
    String nombre;
    double base, altura;

    public Triangulo(String nombre, double base, double altura) {
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return (base * altura)/2;
    }

    @Override
    public double getPerimetro() {
        return 0;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }
}
