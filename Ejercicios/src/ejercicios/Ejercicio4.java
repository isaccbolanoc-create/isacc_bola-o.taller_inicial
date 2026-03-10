package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public void ejecutar(Scanner sc) {
        System.out.print("Ingrese un número entero (Ej4): ");
        int n = sc.nextInt();

        if (n > 0 && n % 2 == 0) System.out.println("Par positivo");
        else if (n < 0 && n % 2 != 0) System.out.println("Impar negativo");
        else System.out.println("Otro tipo de número");
    }
}