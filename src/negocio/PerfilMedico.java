package negocio;

import java.util.GregorianCalendar;

public class PerfilMedico {

    private String primerNombre;
    private String apellido;
    private String sexo;
    private int diaNacimiento;
    private int mesNacimiento;
    private int añoNacimiento;
    private double altura;
    private double peso;

    public PerfilMedico(String primerNombre,
                        String apellido,
                        String sexo,
                        int diaNacimiento,
                        int mesNacimiento,
                        int añoNacimiento,
                        double altura,
                        double peso) {

        setPrimerNombre(primerNombre);
        setApellido(apellido);
        setSexo(sexo);
        setDiaNacimiento(diaNacimiento);
        setMesNacimiento(mesNacimiento);
        setAñoNacimiento(añoNacimiento);
        setAltura(altura);
        setPeso(peso);
    }

    // METODOS SET

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        }
    }
    // METODOS GET
    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }
    // CALCULAR EDAD
    public int calcularEdad() {

        GregorianCalendar fechaActual =
                new GregorianCalendar();

        int añoActual =
                fechaActual.get(GregorianCalendar.YEAR);

        int mesActual =
                fechaActual.get(GregorianCalendar.MONTH) + 1;

        int diaActual =
                fechaActual.get(GregorianCalendar.DAY_OF_MONTH);

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
    // FRECUENCIA CARDIACA MAXIMA
    public int calcularFrecuenciaMaxima() {
        int frecuenciaMaxima = 220 - calcularEdad();
        return frecuenciaMaxima;
    }
    // FRECUENCIA ESPERADA MINIMA
    public double calcularFrecuenciaEsperadaMinima() {
        double frecuenciaMinima =
                calcularFrecuenciaMaxima() * 0.50;
        return frecuenciaMinima;
    }
    // FRECUENCIA ESPERADA MAXIMA
    public double calcularFrecuenciaEsperadaMaxima() {
        double frecuenciaMaxima =
                calcularFrecuenciaMaxima() * 0.85;
        return frecuenciaMaxima;
    }
    // CALCULAR BMI
    public double calcularBMI() {

        if (altura > 0 && peso > 0) {
            double bmi = (peso * 10000) / (altura * altura);
            return bmi;
        }
        return 0.0;
    }
    // CLASIFICAR BMI
    public String clasificarBMI() {

        if (altura <= 0 || peso <= 0) {
            return "No calculable";
        }

        double bmi = calcularBMI();

        if (bmi < 18.5) {
            return "Bajo peso";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Sobrepeso";
        } else {
            return "Obeso";
        }
    }
}