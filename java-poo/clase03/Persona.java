class Persona{
    private String nombre;
    private int edad;
    private float peso;
    private float estatura;

    public Persona(){
        this.nombre = "Rafael Minaya";
        this.edad = 31;
        this.peso= 0f;
        this.estatura = 0f;
    }


    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = 0f;
        this.saludo(nombre, edad);
        this.inicioTrabajador();
    }

    public void inicioTrabajador(){
        System.out.println("Bienvenido a la empresa nuevo tarbajador.");
    }

    public void saludo(String nombre, int edad){
        System.out.println("Hola "+nombre+" con "+edad+" anios");
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){

        if(nombre.length() < 2){
            System.out.println("Al menos 2 caracteres");
        }else{

            this.nombre = nombre;
        }
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        
        if(edad < 0 || edad > 127){
            System.out.println("Ingrese una edad valida");            
        }else{

            this.edad = edad;
        }
    }

}