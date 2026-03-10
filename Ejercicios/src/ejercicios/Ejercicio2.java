package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public void ejecutar(Scanner sc) {
        System.out.print("Ingrese un número decimal (Ej2): ");
        double n = sc.nextDouble();
        System.out.println(n >= 0 ? "Es positivo" : "Es negativo");
    }
}