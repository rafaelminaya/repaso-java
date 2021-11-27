class Tipo{
    public static void main(String ...args){
        byte cantidad1 = 12;
        byte cantidad2 = 43;

        byte resultado = (byte)(cantidad1 + cantidad2);

        System.out.println(resultado);

        //Primera forma de casting

        float a = (float)13.4;
        float b = (float)43.2;
        float c = a + b;

        System.out.println(c);

        float precio1 = (float)384.5;
        float precio2 = (float)104.5;
        float total1 = precio1 + precio2;
        
        System.out.println(total1);

        float precio3 = 200.5f;
        float precio4 = 125.5f;
        float total2 = precio3 + precio4;

        System.out.println(total2);

        int d = 13;
        int e = 6;
        float f = (float)d / (float)e;
        System.out.println(f);

        int cantidad_compra = 3;
        float precioCasaca = 120;
        float precioPantalon = 85.5f;
        float descuento = 10;

        float totalPago = (precioCasaca + precioPantalon) * cantidad_compra;
        
        System.out.println(totalPago);
        
    }    

}