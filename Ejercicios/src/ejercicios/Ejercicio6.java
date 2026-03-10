package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public void ejecutar(Scanner sc) {
        System.out.print("Ingrese número celular (Ej6): ");
        String numero = sc.next();

        String pref = numero.substring(0, 3);
        if (pref.equals("305") || pref.equals("306")) System.out.println("Operador: VivaTel");
        else if (pref.equals("315") || pref.equals("316")) System.out.println("Operador: NetMovil");
        else if (pref.equals("325") || pref.equals("326")) System.out.println("Operador: FastCall");
        else System.out.println("Operador desconocido");
    }
}