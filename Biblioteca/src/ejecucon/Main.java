package ejecucon;

import Biblioteca.Libro;
import Biblioteca.Prestamo;
import Biblioteca.Usuario;

public class Main {
    public static void main(String[] args) {
        // Crear libros
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "978-0307474728");
        Libro libro2 = new Libro("1984", "George Orwell", "978-0451524935");

        // Crear usuarios
        Usuario usuario1 = new Usuario("Juan Perez", 101);
        Usuario usuario2 = new Usuario("Ana López", 102);

        // Crear préstamos
        Prestamo prestamo1 = new Prestamo(usuario1, libro1, "10/03/2026");
        Prestamo prestamo2 = new Prestamo(usuario2, libro2, "11/03/2026");

        // Mostrar préstamos
        prestamo1.mostrarPrestamo();
        prestamo2.mostrarPrestamo();
    }
}