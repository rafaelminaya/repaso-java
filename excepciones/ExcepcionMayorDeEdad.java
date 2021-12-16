
//RunTimeException: Hereda de esta clase para que la excepción no sea verificada.
public class ExcepcionMayorDeEdad extends RuntimeException{
    public ExcepcionMayorDeEdad(String str){
        super(str + " no eres mayor de edad");
    }

    public ExcepcionMayorDeEdad(){
        this("lo lamnento, no puede estrar porque ");
    }

}