package team.ed.herencia;

public class  Profesor extends Persona{
    public Profesor(){
        super();
    }
    public Profesor(String n){
        super(n);
    }
    public void ensenar(){
        System.out.println("Estoy enseñando");
    }
    //Overloading / Sobrecarga de métodos. Se hace en la misma clase.
    //Permite crear varios métodos con el mismo nombre
    //siempre y cuando la firma(parámetros) sea diferente.
    //Se logra cambiando el orden de los parámetros y/o cantidad de los mismos.

    public void ensenar(String materia){
        System.out.println("Estoy enseñando "+ materia);
    }
    public void ensenar(String materia, int horas){
        System.out.println("Estoy enseñando "+ materia+" "+horas+" horas");
    }
    //Override / Sobreescritura de métodos
    //Permite cambiar el comportamiento de un método. Se hace sobre la herencia o polimorfismo
    @Override
    public void comer(){
        System.out.println("Estoy comiendo soy vegetarianos");
    }

    @Override
    public void reir() {
        System.out.println("Me rio a carcajadas");
    }

}
