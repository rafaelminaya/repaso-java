package ed.team.clase02;

import java.util.Arrays;

public class PruebaStatic {
    public static void main(String[] args) {
        Matematicas mate = new Matematicas();
        int resultado = Matematicas.sumar(12, 44);
        System.out.println(resultado);

        int resultadoSuma = Matematicas.sumar(32, 48);
        double aleatorio = Math.random();

        System.out.println(resultadoSuma);
        System.out.println(aleatorio);
        System.out.println("PI vale "+Matematicas.PI);

        //////////////
        //Calculo precio de venta
        float precioCompra = 1500;
        float porcentajeComision = 30;
        float precioVenta = calcularPrecioVenta(precioCompra, porcentajeComision);
        System.out.println("precioCompra "+ precioCompra);
        System.out.println("porcentajeComision "+ porcentajeComision + "%");
        System.out.println("precioVenta "+ precioVenta);
        System.out.println("-------------------------");
        calcularPrecioVentaMensaje(precioCompra, porcentajeComision);

    }


    public static float calcularPrecioVenta(float precioCompra, float porcentajeComision){
        float montoComision = (porcentajeComision/100) * precioCompra;
        float base_imponible = precioCompra + montoComision;
        float montoIgv = base_imponible * Matematicas.IGV;
        return base_imponible + montoIgv;

    }
    public static void calcularPrecioVentaMensaje(float precioCompra, float porcentajeComision){
        float montoComision = (porcentajeComision/100) * precioCompra;
        float base_imponible = precioCompra + montoComision;
        float montoIgv = base_imponible * Matematicas.IGV;
        float precioVenta = base_imponible + montoIgv;

        System.out.println("precioCompra "+ precioCompra);
        System.out.println("porcentajeComision "+ porcentajeComision + "%");
        System.out.println("montoComision "+ montoComision );
        System.out.println("base_imponible "+ base_imponible);
        System.out.println("montoIgv "+ montoIgv);
        System.out.println("precioVenta "+ precioVenta);
        System.out.println(base_imponible+ " + "+ montoIgv +" = "+precioVenta );

    }
}
