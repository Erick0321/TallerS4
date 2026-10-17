package interfaz;

import negocio.Fecha;
import javax.swing.JOptionPane;

public class PruebaFecha {

    public static void main(String[] args) {

        int mes = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el mes:"));

        int dia = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el dia:"));

        int año = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el año:"));

        Fecha fecha1 = new Fecha(mes, dia, año);

        fecha1.mostrarFecha();

        JOptionPane.showMessageDialog(null,
                "Fecha ingresada: " + fecha1.getMes() + "/"
                        + fecha1.getDia() + "/" + fecha1.getAño());
    }
}
