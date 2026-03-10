package ejercicios;

import java.util.Random;

public class Ejercicio8 {
    public void ejecutar() {
        Random r = new Random();
        int n = r.nextInt(31) + 40; // número entre 40 y 70
        System.out.println("Número aleatorio (Ej8): " + n);
    }
}
