package team.ed.tienda;

public abstract class Persona {
    String nombres, apellidos, cargo, direccion, docIdentidad;
    int edad, diasServicio;
    double salario;

    public Persona(String nombres, String apellidos, String cargo, String direccion, String docIdentidad, int edad, int diasServicio, double salario) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cargo = cargo;
        this.direccion = direccion;
        this.docIdentidad = docIdentidad;
        this.edad = edad;
        this.diasServicio = diasServicio;
        this.salario = salario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDocIdentidad() {
        return docIdentidad;
    }

    public void setDocIdentidad(String docIdentidad) {
        this.docIdentidad = docIdentidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDiasServicio() {
        return diasServicio;
    }

    public void setDiasServicio(int diasServicio) {
        this.diasServicio = diasServicio;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
