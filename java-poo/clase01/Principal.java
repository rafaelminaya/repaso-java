class Principal{
    public static void main(String ...args){
        Persona persona = new Persona();
        Persona otraPersona = new Persona("Julia Bernal");
        // persona.nombre = "rafael";
        // persona.edad = 30;
        // persona.peso = 89f;
        // persona.estatura = 152f;

        Persona trabajador = new Persona("carlos");
        trabajador.setNombre("Gustavo");
        trabajador.setEdad(22);

        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());

        trabajador.saludar();
        otraPersona.saludar();

    }
}