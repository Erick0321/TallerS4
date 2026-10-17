package interfaz;

import negocio.FrecuenciasCardiacas;
import javax.swing.JOptionPane;

public class PruebaFrecuenciasCardiacas {

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog(
                "Ingrese su primer nombre:");
        String apellido = JOptionPane.showInputDialog(
                "Ingrese su apellido:");
        int dia = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese su dia de nacimiento:"));
        int mes = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese su mes de nacimiento:"));
        int año = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese su año de nacimiento:"));
        FrecuenciasCardiacas persona = new FrecuenciasCardiacas(
                nombre, apellido, mes, dia, año);
        JOptionPane.showMessageDialog(null,
                "DATOS DE LA PERSONA" +
                        "\nNombre: " + persona.getPrimerNombre() +
                        "\nApellido: " + persona.getApellido() +
                        "\nFecha de nacimiento: " +
                        persona.getDiaNacimiento() + "/" +
                        persona.getMesNacimiento() + "/" +
                        persona.getAñoNacimiento() +
                        "\nEdad: " + persona.calcularEdad() + " años" +
                        "\nFrecuencia cardiaca maxima: " +
                        persona.calcularFrecuenciaMaxima() +
                        "\nFrecuencia cardiaca esperada: " +
                        persona.calcularFrecuenciaEsperadaMinima() +
                        " a " + persona.calcularFrecuenciaEsperadaMaxima() +
                        " pulsaciones por minuto");

    }
}