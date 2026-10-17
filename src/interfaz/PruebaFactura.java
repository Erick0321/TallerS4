package interfaz;

import negocio.Factura;
import java.util.Scanner;

public class PruebaFactura {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el numero de pieza:");
        String numeroPieza = entrada.nextLine();

        System.out.println("Ingrese el nombre del producto:");
        String descripcionPieza = entrada.nextLine();

        System.out.println("Ingrese la cantidad:");
        int cantidad = entrada.nextInt();

        System.out.println("Ingrese el precio por articulo (ejemplo: 12,5):");
        double precio = entrada.nextDouble();

        Factura factura1 = new Factura(numeroPieza,
                descripcionPieza, cantidad, precio);

        System.out.println("FACTURA");
        System.out.println("Numero de pieza: " + factura1.getNumeroPieza());
        System.out.println("Producto: " + factura1.getDescripcionPieza());
        System.out.println("Cantidad: " + factura1.getCantidad());
        System.out.println("Precio unitario: " + factura1.getPrecioPorArticulo());
        System.out.println("Monto total: " + factura1.obtenerMontoFactura());

        entrada.close();
    }
}