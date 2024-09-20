package gestionlibros;

import java.util.List;

public class AdminLibros {

    public static void main(String[] args) {

        Libros libroUno = new Libros("El Principito", "Antoine de Saint-Exupéry", 150, 2016);
        Libros libroDos = new Libros("El Perfume", "Patrick Süskind ", 500, 1985);

        System.out.println("Datos del primer libro: " + "\n");
        libroUno.mostraDatosLibros();

        System.out.println("Datos del segundo libro: " + "\n");
        libroDos.mostraDatosLibros();

        libroUno.setPaginas(300);
        //System.out.println("Datos del primer libro modificado: " + libroUno.getPaginas());
        System.out.println("Datos libro uno modificado: " + "\n");
        libroUno.mostraDatosLibros();

    }
}
