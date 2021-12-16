package team.ed.ejecutar;

import team.ed.herencia.Persona;
import team.ed.herencia.Profesor;

public class Main {
    public static void main(String[] args) {
//        Persona persona = new Persona();
//        persona.setNombre("Carlos");
//        System.out.println(persona.getNombre());
//        persona.hablar();
//        persona.comer();

        Profesor profesor = new Profesor();
        System.out.println(profesor.getNombre());

        Profesor auxiliar = new Profesor("Carlos");
        System.out.println(auxiliar.getNombre());
        auxiliar.nombre = "Rolando";
        System.out.println(auxiliar.getNombre());

        auxiliar.ensenar();
        auxiliar.ensenar("Algebra");
        auxiliar.ensenar("Geometria", 12);
        auxiliar.comer();
        auxiliar.reir();
        auxiliar.hablar();

    }

}
