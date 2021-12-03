package ed.team.clase01;

import ed.team.clase02.Persona;

public class Estudiante01 extends Persona {
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void saludar(){
        System.out.println("Hola tengo: " + edad);
    }
}
