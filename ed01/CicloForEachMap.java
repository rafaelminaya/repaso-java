import java.util.HashMap;
import java.util.Map;
class CicloForEachMap{
    public static void main(String ...args){
        //Usaremos la clase "Map"
        //Un mapa es un conjunto de elementos que tiene una clave y un valor.
        //El mapa permite buscar elementos de una manera rápida y sencilla.
        //Integer es el tipo de dato de la clave y el String tipo de dato del valor
        Map<Integer, String> nombres = new HashMap<>();

        nombres.put(23, "Rafael");
        nombres.put(12, "Viviana");
        nombres.put(43, "Humberto");
        nombres.put(16, "Isabela");
        nombres.put(2, "Ernesto");

        nombres.forEach((id, nombre) -> {
            System.out.println("ID: "+ id + " NOMBRE: "+nombre);
        });

    }
}