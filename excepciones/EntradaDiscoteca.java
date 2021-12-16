
public class EntradaDiscoteca{
    public static void main(String ...args){
        int edad = 15;

        //validarEdad no necesita try catch puesto que la ExcepcionMayorDeEdad hereda de RunTimeException, que no requiere de try catch
        //Sin embargo es necesario validar con try catch, para que el proceso continúe y no se detenga.


        try{

            validarEdad(edad);
        }catch(ExcepcionMayorDeEdad ex){
            //ex.printStackTrace();
             System.out.println(ex.getMessage());
        }


    }

    public static void validarEdad(int edad) throws ExcepcionMayorDeEdad{
        if( edad < 18){
            //System.out.println("eres menor de edad");
            throw new ExcepcionMayorDeEdad("No te puedo dejar entrar");
        } else{
            System.out.println("Bienvenido a la discoteca");
        }
    }
}