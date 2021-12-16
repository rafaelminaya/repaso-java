package team.ed.tienda;

public class Cliente extends Persona implements Calculos{
    int cantidadUnidadesCompradas;
    double montoComprado;
    public Cliente(String nombres, String apellidos, String cargo, String direccion, String docIdentidad, int edad, int diasServicio, double salario) {
        super(nombres, apellidos, cargo, direccion, docIdentidad, edad, diasServicio, salario);
    }

    public int getCantidadUnidadesCompradas() {
        return cantidadUnidadesCompradas;
    }

    public void setCantidadUnidadesCompradas(int cantidadUnidadesCompradas) {
        this.cantidadUnidadesCompradas = cantidadUnidadesCompradas;
    }

    public double getMontoComprado() {
        return montoComprado;
    }

    public void setMontoComprado(double montoComprado) {
        this.montoComprado = montoComprado;
    }

    @Override
    public double calcularComision() {
        return 0;
    }

    @Override
    public double calcularLiquidadcion() {
        return 0;
    }
}
