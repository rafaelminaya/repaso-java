/**

Estructura de manejo de excepciones
try{
    //Aquí se coloca el código que puede 
    tener errores en tiempo de ejecución
}catch(Exception e){
    //Aquí es donde se maneja la excepción
}finally {
    //Aquí colocamos lo que queremos ejecutar exista o no alguna excepción.
}
 */

 import java.util.Scanner;
 import java.util.*;

class ExcepcionDivisionPorCero{
    public static void main(String ...args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Programa para dividir");
        System.out.println();

        int numerador, denominador, resultado;
        System.out.print("Digita el numerador: ");
        numerador = sc.nextInt();

        System.out.print("Digita el denominador: ");
        denominador = sc.nextInt();

        try{
            resultado = numerador / denominador; 
            System.out.print("Resultado: "+resultado);
        }catch(ArithmeticException ae){
            System.out.println("No se puede divir por cero");
        }finally{
            //Aquí se suelen cerrar recursos que se usaron o no se usaron.
            System.out.println("Esta linea se ejecuta siempre");
        }

    }
}