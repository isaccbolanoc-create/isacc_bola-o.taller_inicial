package ejecucion;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int resultado;

        System.out.println("Ingresa el primer numero:");
        a = sc.nextInt();

        System.out.println("Ingresa el segundo numero:");
        b = sc.nextInt();

        resultado = a + b;

        System.out.println("Resultado: " + resultado);
    }
}