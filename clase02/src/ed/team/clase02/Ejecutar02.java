package ed.team.clase02;

public class Ejecutar02 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.edad = 35;
        System.out.println(persona.edad);

        Estudiante estudiante = new Estudiante();
        estudiante.saludar();
    }
}
