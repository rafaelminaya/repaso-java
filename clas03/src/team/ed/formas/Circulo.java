package team.ed.formas;

public class Circulo implements Figura{
    String nombre;
    double radio;

    public Circulo(String nombre, double radio) {
        this.nombre = nombre;
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return PI * Math.pow(radio, 2);
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
