package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public void ejecutar(Scanner sc) {
        System.out.print("Ingrese un número entero (Ej3): ");
        int n = sc.nextInt();
        System.out.println(n % 2 == 0 ? "Par" : "Impar");
    }
}
