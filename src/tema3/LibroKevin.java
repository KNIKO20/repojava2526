package tema3;

/**
 * La clase LibroKevin representa un libro con título, autor, número total de páginas
 * y páginas leídas. Permite leer páginas, consultar información del libro y verificar
 * si se ha terminado de leer.
 * @author Kevin
 * @since 1.0
 */
public class LibroKevin {
    
    /** Título del libro */
    private String titulo;
    
    /** Autor del libro */
    private String autor;
    
    /** Número total de páginas del libro */
    private int paginasTotales;
    
    /** Número de páginas leídas hasta el momento */
    private int paginasLeidas = 0;

    /**
     * Constructor que inicializa un libro con título, autor y páginas totales.
     * @param titulo Título del libro
     * @param autor Autor del libro
     * @param paginasTotales Número total de páginas del libro
     */
    public LibroKevin(String titulo, String autor, int paginasTotales) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginasTotales = paginasTotales;
        paginasLeidas = 0;
    }

    /** @return el título del libro */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece un nuevo título para el libro.
     * @param titulo Nuevo título
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /** @return el autor del libro */
    public String getAutor() {
        return autor;
    }

    /**
     * Establece un nuevo autor para el libro.
     * @param autor Nuevo autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /** @return el número total de páginas del libro */
    public int getPaginasTotales() {
        return paginasTotales;
    }

    /**
     * Establece un nuevo número total de páginas.
     * @param paginasTotales Nuevo total de páginas
     */
    public void setPaginasTotales(int paginasTotales) {
        this.paginasTotales = paginasTotales;
    }

    /**
     * Permite leer una cantidad de páginas del libro.
     * Verifica que no se exceda el total ni se lean páginas negativas.
     * @param paginas Número de páginas a leer
     */
    public void leer(int paginas) {
        if (paginas > paginasTotales - paginasLeidas) {
            System.out.println("No se pueden leer más páginas de las que tiene el libro");
        } else if (paginas < 0) {
            System.out.println("No se pueden desleer páginas");
        } else {
            paginasLeidas += paginas;
            System.out.println("Has leído " + paginasLeidas + " de " + paginasTotales + " páginas.");
        }
    }

    /**
     * Verifica si el libro ha sido completamente leído.
     * @return true si todas las páginas han sido leídas, false en caso contrario
     */
    public boolean estaTerminado() {
        return paginasTotales == paginasLeidas;
    }

    /** @return el número de páginas leídas hasta el momento */
    public int getPaginasLeidas() {
        return paginasLeidas;
    }

    /**
     * Muestra por consola la información del libro.
     */
    public void mostrarInformacion() {
        System.out.println("Título:\t " + titulo);
        System.out.println("Autor:\t " + autor);
        System.out.println("Páginas totales: " + paginasTotales);
        System.out.println("Páginas leídas:\t " + paginasLeidas);
    }

    /**
     * Devuelve la información del libro como una cadena de texto.
     * @return Información del libro en formato texto
     */
    public String mostrarInfo() {
        return "Título:\t " + titulo + "\nAutor:\t " + autor + "\nPáginas totales: " + paginasTotales + "\nPáginas leídas:\t " + paginasLeidas;
    }
}

