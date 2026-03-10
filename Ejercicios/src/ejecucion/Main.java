package ejecucion;

import ejercicios.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        new Ejercicio1().ejecutar(sc);
        new Ejercicio2().ejecutar(sc);
        new Ejercicio3().ejecutar(sc);
        new Ejercicio4().ejecutar(sc);
        new Ejercicio5().ejecutar(sc);
        new Ejercicio6().ejecutar(sc);
        new Ejercicio7().ejecutar(sc);
        new Ejercicio8().ejecutar();
        new Ejercicio9().ejecutar(sc);
        new Ejercicio10().ejecutar(sc);

        sc.close();
    }
}