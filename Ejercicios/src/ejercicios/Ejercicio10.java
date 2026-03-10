package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
    public void ejecutar(Scanner sc) {
        System.out.print("Valor venta (Ej10): ");
        double venta = sc.nextDouble();
        double iva = venta * 0.18; // cambié el IVA
        double total = venta + iva;

        if (venta > 200000) total *= 0.80; // 20% descuento
        else total *= 0.85; // 15% descuento

        System.out.println("Total final con IVA y descuento: " + total);
    }
}