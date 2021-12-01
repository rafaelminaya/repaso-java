class BusquedaLineal{
    public static void main(String ...args){

        int a[] = new int[10];
        //Poblado del arreglo con números aleatorios
        for(int i = 0; i < a.length; i++){
            a[i] = (int)(Math.random()*99);

            //Asignamos el valor 50 al penúltimo item del arreglo
            if(a.length -1 == i){
                a[i] = 50;
            }
        }

        //mostramos el arreglo
        for(int item: a){
            System.out.print(item+" ");
        }
        System.out.println();

        //Búsqueda lineal
        int x = 50;
        for(int i = 0; i < a.length; i++){
            if(a[i] == x){
                System.out.println("encontramos el numero buscado "+x+" en el indice "+i);
                break;
            }
        }
    }
}