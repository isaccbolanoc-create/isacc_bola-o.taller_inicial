package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    public void ejecutar(Scanner sc) {
        System.out.print("Número X: ");
        int x = sc.nextInt();
        System.out.print("Número Y: ");
        int y = sc.nextInt();

        int temp = x;
        x = y;
        y = temp;

        System.out.println("Después de intercambio: X=" + x + ", Y=" + y);
    }
}