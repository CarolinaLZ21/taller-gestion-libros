package gestionlibros;

public class Libros {

    String titulo;
    String autor;
    int paginas;
    int publicacion;

    public Libros(String titulo, String autor, int paginas, int publicacion) {

        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.publicacion = publicacion;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(int publicacion) {
        this.publicacion = publicacion;
    }


    public void mostraDatosLibros(){

        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de Paginas: " + paginas);
        System.out.println("Año de Publicación: " + publicacion);

    }


}
