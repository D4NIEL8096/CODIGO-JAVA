
package com.mycompany.calcularfactura;
import java.util.Scanner;
public class CalcularFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     
        System.out.print("Ingrese el subtotal de la factura: ");
        double subtotal = scanner.nextDouble();
        System.out.print("Ingrese el porcentaje del IVA: ");
        double ivaPorcentaje = 0.12;
        double iva = subtotal * ivaPorcentaje;
        double total = subtotal + iva;
        System.out.println("Subtotal: " + subtotal);
        System.out.println("IVA: " + iva);
        System.out.println("Total: " + total);
    }
}
