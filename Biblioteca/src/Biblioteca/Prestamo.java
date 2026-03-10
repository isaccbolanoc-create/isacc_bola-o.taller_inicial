package Biblioteca;

public class Prestamo {
    private Usuario usuario;
    private Libro libro;
    private String fecha;

    public Prestamo(Usuario usuario, Libro libro, String fecha) {
        this.usuario = usuario;
        this.libro = libro;
        this.fecha = fecha;
    }

    public void mostrarPrestamo() {
        System.out.println("Usuario: " + usuario.getNombre() +
                " tiene prestado el libro: \"" + libro.getTitulo() +
                "\" de " + libro.getAutor() +
                " (ISBN: " + libro.getIsbn() + ") el día " + fecha);
    }
}