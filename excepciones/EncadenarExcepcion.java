

//Lanzar excepciones a metodos superiores

//throws el cual permite elevar una excepción a un método superior. Este va en la firma de la función.
//throw lanza la excepción


class EncadenarExcepcion{
    public static void main(String ...args){
        int a = 6;
        int b = 0;

        try{
            int c = dividir(a, b);
            System.out.println("resultado: "+c);
        }catch(ArithmeticException ae){
            System.out.println("No se puede dividir por cero");
        }

        System.out.println("Este programa puede seguir funcionando");

        try{
            superior();
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("Programa finalizado");
    }
    
    //throws ArithmeticException : Por si se divide con cero y genera este tipo de excepción.
    public static int dividir(int a, int b) throws ArithmeticException{
        return a / b;
    }

    public static void superior() throws Exception{
        try{
            intermedio();
        }catch(Exception e){
            throw new Exception("Metodo superior: ", e);
        }
    }

    public static void intermedio() throws Exception{
        try{
            inferior();
        }catch(Exception e){
            throw new Exception("Metodo intermedio: ", e);
        }
    }

    public static void inferior() throws Exception{
        throw new Exception();
    }

}