class Principal{
    public static void main(String ...args){
        Persona persona = new Persona();
        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        // System.out.println(persona.estatura);

        Persona trabajador = new Persona("Ernesto Torres", 23);
        trabajador.setNombre("Valentin Ugarte");
        trabajador.setEdad(18);

        System.out.println("Hola trabajador "+ trabajador.getNombre() + " de edad " + trabajador.getEdad());
        trabajador.saludo("Vanessa Roldan", 29);

        


    }
}