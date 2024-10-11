package cinemajava;

public class Clase_Espectador {

    //Escribimos o declaramos variables.
    private String nombre; //En esta variable almacenaremos el nombre del espectador.
    private int edad; //En esta variable almacenaremos la edad del espectador.
    private double dinero; //En esta variable almacenaremos el dinero que tiene el espectador.

    /*Ahora en este apartado creamos un constructor para inicializar el espectador con su respectivo nombre,
    edad y dinero.
     */
    public Clase_Espectador(String nombre, int edad, double dinero) {
        this.nombre = nombre; //Este asigna el nombre a la variable de instancia.
        this.edad = edad; // Este asigna la edad a la variable de instancia.
        this.dinero = dinero; // Asigna la cantidad de dinero a la variable de instancia.

    }

    //Ahora profesor, creamos un metodo que verifique si el espectador puede ver la película.
    public boolean puedeVerPelicula(Clase_Pelicula pelicula, double precio) {
        // Primero, verificamos si la edad del espectador es valida para ver la película.
        if (edad >= pelicula.getEdadMinima()) {
            // Luego, verificamos si el espectador tiene el dinero suficiente para la película.
            if (dinero >= precio) {
                return true; // Por lo tanto, si ambas condiciones se cumplen, retorna verdadero.
            }
        }
        return false; // // Caso contrario de que si alguna condición no se cumple pues retornara falso.
    }

    /* En este apartado, crearemos un método que descuente el precio de la entrada
    del dinero del espectador. */
    public void pagar(double precio) {
        dinero -= precio; // Procedemos a restar el precio de la entrada al dinero que tiene el espectador.
    }

    /*Por ultimo, para esta clase, crearemos un metodo que devuelva el nombre del espectado.
     */
    
    public String getNombre() {
        return nombre; // Como ultimo paso del metodo, devolvemos o retornamos el nombre del espectador.
    }
}
