class Arreglo{
    public static void main (String ...args){
        //Arreglos:
        //Grupo de elementos con 
        //1. Un tamaño fijo y 
        //2. Solo pueden contener elementos de un mismo tipo
        //Puede almacenar tipos de datos primitivos o referencias a objetos.

        //Conceptos base:
        //Posición  / índice
        //Los índices en los arreglos comienzan con 0

        //Declaración de arreglos
        //int numeros[]
        //numeros = new int[5]

        //int numeros[] = new int[5]
        //Persona personas[] = new Persona[5]
        //int numeros[] = {3, 64, -1, 20}
        
        //asignación de valores
        //int a[] new int[3];
        //int a[0] = 19;
        //int a[1] = 33;
        //int a[2] = 76; 

        int arregloNumeros[] = new int[3];
        arregloNumeros[0] = 12;
        arregloNumeros[1] = 33;
        arregloNumeros[2] = 21;

        for(int i = 0; i <3; i++){
            System.out.println(" - " + arregloNumeros[i]);
        }

        

        String nombres[] = {"Jimena", "Fabrizio", "Fiorella", "Andres"};

         for(int i = 0; i < nombres.length; i++){
            System.out.println(" + " + nombres[i]);
        }

        String trabajadores[] = new String[5];
        trabajadores[0] = "Fernando";
        trabajadores[1] = "Gustavo";
        trabajadores[2] = "Renata";
        trabajadores[3] = "Daniela";
        trabajadores[4] = "Rodolfo";

        for(int i = 0; i < trabajadores.length; i++){
            System.out.println("* " + trabajadores[i]);
        }

    }
}