package team.ed.tienda;

public class Vendedor extends Persona implements Calculos{
    float montoVendido;
    int cantidadClientesAtendidos;
    int puestoVendedor;

    public Vendedor(String nombres, String apellidos, String cargo, String direccion, String docIdentidad, int edad, int diasServicio, double salario, float montoVendido, int cantidadClientesAtendidos, int puestoVendedor) {
        super(nombres, apellidos, cargo, direccion, docIdentidad, edad, diasServicio, salario);
        this.montoVendido = montoVendido;
        this.cantidadClientesAtendidos = cantidadClientesAtendidos;
        this.puestoVendedor = puestoVendedor;
    }

    @Override
    public double calcularComision() {
        return this.montoVendido * 0.05;
    }

    @Override
    public double calcularLiquidadcion() {
        return this.montoVendido * 0.10;
    }

    public float getMontoVendido() {
        return montoVendido;
    }

    public void setMontoVendido(float montoVendido) {
        this.montoVendido = montoVendido;
    }

    public int getCantidadClientesAtendidos() {
        return cantidadClientesAtendidos;
    }

    public void setCantidadClientesAtendidos(int cantidadClientesAtendidos) {
        this.cantidadClientesAtendidos = cantidadClientesAtendidos;
    }

    public int getPuestoVendedor() {
        return puestoVendedor;
    }

    public void setPuestoVendedor(int puestoVendedor) {
        this.puestoVendedor = puestoVendedor;
    }
}
