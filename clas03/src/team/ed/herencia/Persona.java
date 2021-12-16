package team.ed.herencia;

public abstract class Persona {
    public String nombre;
    public int edad;
    public float altura;
    public float peso;

    public Persona() {
        this.nombre = "Sin nombre";
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void hablar(){
        System.out.println("Hola soy "+ this.nombre);
    }

    public void comer(){
        System.out.println("EStoy comiendo");
    }
    public abstract void reir();

}
