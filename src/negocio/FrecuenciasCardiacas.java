package negocio;
import java.util.GregorianCalendar;

public class FrecuenciasCardiacas {

    private String primerNombre;
    private String apellido;
    private int mesNacimiento;
    private int diaNacimiento;
    private int añoNacimiento;

    public FrecuenciasCardiacas(String primerNombre,
                                String apellido,
                                int mesNacimiento,
                                int diaNacimiento,
                                int añoNacimiento) {

        setPrimerNombre(primerNombre);
        setApellido(apellido);
        setMesNacimiento(mesNacimiento);
        setDiaNacimiento(diaNacimiento);
        setAñoNacimiento(añoNacimiento);
    }
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }
    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }
    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }
    public String getPrimerNombre() {
        return primerNombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getMesNacimiento() {
        return mesNacimiento;
    }
    public int getDiaNacimiento() {
        return diaNacimiento;
    }
    public int getAñoNacimiento() {
        return añoNacimiento;
    }
    public int calcularEdad() {

        GregorianCalendar fechaActual = new GregorianCalendar();

        int añoActual = fechaActual.get(GregorianCalendar.YEAR);
        int mesActual = fechaActual.get(GregorianCalendar.MONTH) + 1;
        int diaActual = fechaActual.get(GregorianCalendar.DAY_OF_MONTH);

        int edad = añoActual - añoNacimiento;

        if (mesActual < mesNacimiento) {
            edad = edad - 1;
        } else if (mesActual == mesNacimiento) {
            if (diaActual < diaNacimiento) {
                edad = edad - 1;
            }
        }
        return edad;
    }
    public int calcularFrecuenciaMaxima() {
        int frecuenciaMaxima = 220 - calcularEdad();
        return frecuenciaMaxima;

    }
    public double calcularFrecuenciaEsperadaMinima() {
        double frecuenciaMinima = calcularFrecuenciaMaxima() * 0.50;
        return frecuenciaMinima;
    }
    public double calcularFrecuenciaEsperadaMaxima() {
        double frecuenciaMaxima = calcularFrecuenciaMaxima() * 0.85;
        return frecuenciaMaxima;
    }
}