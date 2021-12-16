package team.ed.tienda;

public class Administrador extends Persona implements Calculos{
    double montoMeta;
    int cantTrabajadoresCargo;

    public Administrador(String nombres, String apellidos, String cargo, String direccion, String docIdentidad, int edad, int diasServicio, double salario,double montoMeta) {
        super(nombres, apellidos, cargo, direccion, docIdentidad, edad, diasServicio, salario);
        this.montoMeta = montoMeta;
    }

    @Override
    public double calcularComision() {
        return montoMeta * 0.15;
    }

    @Override
    public double calcularLiquidadcion() {
        return montoMeta * 0.1;
    }

    public double getMontoMeta() {
        return montoMeta;
    }

    public void setMontoMeta(double montoMeta) {
        this.montoMeta = montoMeta;
    }

    public int getCantTrabajadoresCargo() {
        return cantTrabajadoresCargo;
    }

    public void setCantTrabajadoresCargo(int cantTrabajadoresCargo) {
        this.cantTrabajadoresCargo = cantTrabajadoresCargo;
    }
}
