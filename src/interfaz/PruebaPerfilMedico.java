package interfaz;

import negocio.PerfilMedico;
import javax.swing.JOptionPane;

public class PruebaPerfilMedico {

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog(
                "Ingrese su primer nombre:");

        String apellido = JOptionPane.showInputDialog(
                "Ingrese su apellido:");

        String sexo = JOptionPane.showInputDialog(
                "Ingrese su sexo:");

        int dia = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese su dia de nacimiento:"));

        int mes = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese su mes de nacimiento:"));

        int año = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese su año de nacimiento:"));

        double altura = Double.parseDouble(
                JOptionPane.showInputDialog(
                        "Ingrese su altura en centimetros:"));

        double peso = Double.parseDouble(
                JOptionPane.showInputDialog(
                        "Ingrese su peso en kilogramos:"));

        PerfilMedico persona = new PerfilMedico(
                nombre, apellido, sexo, dia, mes, año,
                altura, peso);

        String resultadoBMI;

        if (persona.getAltura() > 0 &&
                persona.getPeso() > 0) {
            resultadoBMI = "" + persona.calcularBMI();
        } else {
            resultadoBMI = "No calculable";
        }

        JOptionPane.showMessageDialog(null,
                "PERFIL MEDICO" +
                        "\nNombre: " + persona.getPrimerNombre() +
                        "\nApellido: " + persona.getApellido() +
                        "\nSexo: " + persona.getSexo() +
                        "\nFecha de nacimiento: " +
                        persona.getDiaNacimiento() + "/" +
                        persona.getMesNacimiento() + "/" +
                        persona.getAñoNacimiento() +
                        "\nAltura: " + persona.getAltura() + " cm" +
                        "\nPeso: " + persona.getPeso() + " kg" +
                        "\nEdad: " + persona.calcularEdad() + " años" +
                        "\nFrecuencia cardiaca maxima: " +
                        persona.calcularFrecuenciaMaxima() +
                        "\nFrecuencia esperada: " +
                        persona.calcularFrecuenciaEsperadaMinima() +
                        " a " +
                        persona.calcularFrecuenciaEsperadaMaxima() +
                        " pulsaciones por minuto" +
                        "\nBMI: " + resultadoBMI +
                        "\nClasificacion: " + persona.clasificarBMI() +
                        "\n\nTABLA DE VALORES BMI" +
                        "\nBajo peso: menos de 18.5" +
                        "\nNormal: entre 18.5 y 24.9" +
                        "\nSobrepeso: entre 25 y 29.9" +
                        "\nObeso: 30 o mas");
    }
}