package ejercicios;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Ejercicio5 {
    public void ejecutar(Scanner sc) {
        System.out.print("Año de nacimiento (Ej5): ");
        int anio = sc.nextInt();
        System.out.print("Mes: ");
        int mes = sc.nextInt();
        System.out.print("Día: ");
        int dia = sc.nextInt();

        LocalDate nacimiento = LocalDate.of(anio, mes, dia);
        LocalDate hoy = LocalDate.now();
        int edad = Period.between(nacimiento, hoy).getYears();

        System.out.println("Edad calculada: " + edad);
    }
}