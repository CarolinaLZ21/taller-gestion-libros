package gestionlibros;

import java.util.List;

public class AdminLibros {

    public static void main(String[] args) {

        Libros libroUno = new Libros("El Principito", "Antoine de Saint-Exupéry", 150, 2016);
        Libros libroDos = new Libros("El Perfume", "Patrick Süskind ", 500, 1985);

        System.out.println("\n" + "Datos del primer libro: " );
        libroUno.mostraDatosLibros();

        System.out.println("\n" + "Datos del segundo libro: " );
        libroDos.mostraDatosLibros();

        libroUno.setPaginas(300);
        //System.out.println("Datos del primer libro modificado: " + libroUno.getPaginas());
        System.out.println("\n" + "Datos libro uno modificado: ");
        libroUno.mostraDatosLibros();

    }
}
