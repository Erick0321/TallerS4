package interfaz;

import negocio.Empleado;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PruebaEmpleado {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("EMPLEADO 1");
        System.out.println("Ingrese el primer nombre:");
        String nombre1 = entrada.readLine();
        System.out.println("Ingrese el apellido paterno:");
        String apellido1 = entrada.readLine();
        System.out.println("Ingrese el salario mensual:");
        double salario1 = Double.parseDouble(entrada.readLine());
        Empleado empleado1 = new Empleado(nombre1, apellido1, salario1);

        System.out.println("EMPLEADO 2");

        System.out.println("Ingrese el primer nombre:");
        String nombre2 = entrada.readLine();

        System.out.println("Ingrese el apellido paterno:");
        String apellido2 = entrada.readLine();

        System.out.println("Ingrese el salario mensual:");
        double salario2 = Double.parseDouble(entrada.readLine());

        Empleado empleado2 = new Empleado(nombre2, apellido2, salario2);

        System.out.println("SALARIOS ANUALES");

        System.out.println("Empleado 1: " + empleado1.getPrimerNombre()
                + " " + empleado1.getApellidoPaterno());

        System.out.println("Salario anual: "
                + empleado1.getSalarioMensual() * 12);

        System.out.println("Empleado 2: " + empleado2.getPrimerNombre()
                + " " + empleado2.getApellidoPaterno());

        System.out.println("Salario anual: "
                + empleado2.getSalarioMensual() * 12);

        empleado1.setSalarioMensual(
                empleado1.getSalarioMensual() * 1.10);

        empleado2.setSalarioMensual(
                empleado2.getSalarioMensual() * 1.10);

        System.out.println("SALARIOS CON AUMENTO DEL 10%");

        System.out.println("Empleado 1: " + empleado1.getPrimerNombre());
        System.out.println("Nuevo salario anual: "
                + empleado1.getSalarioMensual() * 12);

        System.out.println("Empleado 2: " + empleado2.getPrimerNombre());
        System.out.println("Nuevo salario anual: "
                + empleado2.getSalarioMensual() * 12);
    }
}