package team.ed.ejecutar;

import team.ed.tienda.*;

public class EjecutarTienda {
    public static void main(String[] args) {
        Vendedor vendedorSedeCentral = new Vendedor("Carmen Teresa", "Flores Muñoz", "Vendedora",
                "Av. Girasoles 394",  "48563217",26, 322,1500, 25000,32,3);

        System.out.println("Vendedor: "+vendedorSedeCentral.getNombres() + vendedorSedeCentral.getApellidos());
        System.out.println("Cargo: "+vendedorSedeCentral.getCargo());
        System.out.println("Dirección: "+vendedorSedeCentral.getDireccion());
        System.out.println("Documento de identidad: "+vendedorSedeCentral.getDocIdentidad());
        System.out.println("Monto vendido: "+vendedorSedeCentral.getMontoVendido());
        System.out.println("Comisión: "+vendedorSedeCentral.calcularComision());
        System.out.println("Liquidación: "+vendedorSedeCentral.calcularLiquidadcion());

        Calculos calculos[] = new Calculos[3];
        calculos[0] = new Vendedor("Carmen Teresa", "Flores Muñoz", "Vendedora",
                "Av. Girasoles 394",  "48563217",26, 322,1500, 25000,32,3);
        calculos[1] = new Administrador("Veronica Rosa", "Hurtado Mendoza", "Admiistradora", "Av. Corregidor 832", "08627634", 32,544,5200,50000);
        calculos[2] =  new Cliente("Eduardo Martin","Juarez Gomez","Cliente","Av Las Palmeras 2343", "47639204",23,0,0);

        for(Calculos item:calculos){
            System.out.println("-------------------------");
            System.out.println(item.calcularComision());
            System.out.println(item.calcularLiquidadcion());
        }


    }
}
