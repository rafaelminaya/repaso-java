class Persona{
    //Atributos
    private String nombre;
    private int edad;
    private float peso;
    private float estatura;

    //Constructor: sirve para inicializar los valores por defecto de un objeto instanciado
    //sobre carga: Poder crear varios constructores con diferentes firmas.
    public Persona(){
        this.nombre = "";
        this.edad = 0;
        this.peso = 0f;
        this.estatura = 0f;
    }

    //Segundo constructor
    public Persona(String n){
        this.nombre = n;
        this.saludar();
    }
    
    public void saludar(){
        System.out.println("hola mi nombre es: "+ this.nombre);
    }

    //setter and getter

    void setNombre(String n){
        this.nombre = n;
    }

    String getNombre(){
        return this.nombre;
    }

    void setEdad(int e){
        this.edad = e;
    }

    int getEdad(){
        return this.edad;
    }

}