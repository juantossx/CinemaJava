package cinemajava;

public class Clase_Pelicula {
 // Declaré las variables que almacenarán los atributos de la película.
    private String titulo; // En esta variable guardé el título de la película.
    private int edadMinima; // Aquí almacené la edad mínima requerida para ver la película.
    private int duracion; // En esta variable guardé la duración de la película en minutos.
    private String director; // Aquí almacené el nombre del director de la película.

    /* 
       Profesor, aquí definí el constructor de la clase `Clase_Pelicula`.
       Este constructor me permitió inicializar los atributos de la película, 
       incluyendo el título, edad mínima, duración y director.
    */
    public Clase_Pelicula(String titulo, int edadMinima, int duracion, String director) {
        this.titulo = titulo; // Asigné el título de la película a la variable `titulo`.
        this.edadMinima = edadMinima; // Asigné la edad mínima a la variable `edadMinima`.
        this.duracion = duracion; // Asigné la duración de la película a la variable `duracion`.
        this.director = director; // Asigné el nombre del director a la variable `director`.
    }

    /* 
       Profesor, en este apartado creé un método que me permite devolver todos los detalles de la película 
       como una sola cadena de texto. Esto incluyó el título, edad mínima, duración y director, 
       para poder mostrarlos en la consola.
    */
    public String mostrarDetallesPelicula() {
        // Devolví una cadena que contiene todos los detalles de la película formateados.
        return "Título: " + titulo + 
               ", Edad Mínima: " + edadMinima + 
               ", Duración: " + duracion + " minutos" + 
               ", Director: " + director;
    }

    // Definí un método que devuelve la edad mínima permitida para ver la película
    public int getEdadMinima() {
        return edadMinima; // Retorné el valor de la edad mínima
    }
}