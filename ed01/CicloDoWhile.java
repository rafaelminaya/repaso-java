class CicloDoWhile{
    public static void main(String ...args){

        int i = 0;

        do{
            System.out.println(i);
            i++;
            if(i == 7){
                //break
                continue;                
            }
            System.out.println("Estoy despues del continue");

        }while(i< 10);


        int descuento = 20;
        int precio = 140;
        int pago = 0;
        int compraNumero = 0;

        do{
            compraNumero++;
            
            pago = precio - descuento;
            System.out.println("Compra # "+compraNumero+". Su pago es de: S/. "+ pago);
            if(compraNumero == 5){
                System.out.println("Lo sentimos. Ya se hicieron las 5 compras.");
                break;
            }
            

        }while(compraNumero <10);
    }

 

}