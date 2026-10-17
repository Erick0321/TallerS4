package negocio;

public class Empleado {

    private String primerNombre;
    private String apellidoPaterno;
    private double salarioMensual;
    public Empleado(String primerNombre,
                    String apellidoPaterno,
                    double salarioMensual) {
        setPrimerNombre(primerNombre);
        setApellidoPaterno(apellidoPaterno);
        setSalarioMensual(salarioMensual);
    }
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public void setSalarioMensual(double salarioMensual) {
        if (salarioMensual > 0) {
            this.salarioMensual = salarioMensual;
        }
    }
    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }
}