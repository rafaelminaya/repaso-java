class Condicionales {
    public static void main (String ...args){
    
        int edad = 22;

        if(edad > 0){
           if(edad<18){
            System.out.println("Usted es menor de edad.");
            }
            else if(edad < 65){
                System.out.println("Usted es un adulto.");
            }
            else {
                System.out.println("Usted es de la tercera edad.");
            } 
        } else{
            System.out.println("Edad invalida.");
        }
        
    }
}