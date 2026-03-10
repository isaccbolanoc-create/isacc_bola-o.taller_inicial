package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    public void ejecutar(Scanner sc) {
        System.out.print("Ingrese edad (Ej9): ");
        int edad = sc.nextInt();

        if (edad <= 2) System.out.println("Lactante");
        else if (edad <= 12) System.out.println("Niñez");
        else if (edad <= 19) System.out.println("Adolescencia");
        else System.out.println("Adultez");
    }
}