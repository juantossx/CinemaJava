package cinemajava;

public class Clase_Cine {

    private Clase_Asiento[][] asientos; // Esta matriz almacenó los asientos del cine.
    private Clase_Pelicula pelicula; // Este objeto representó la película que se proyecta.
    private double precioEntrada; // Esta variable guardó el precio de la entrada en pesos colombianos.

    // Constructor que inicializó el cine con la matriz de asientos, la película y el precio de la entrada.
    public Clase_Cine(int filas, int columnas, Clase_Pelicula pelicula, double precio) {
        asientos = new Clase_Asiento[filas][columnas]; // Inicialicé la matriz de asientos con el tamaño dado.
        this.pelicula = pelicula; // Asigné la película que se proyectará en el cine.
        this.precioEntrada = precio; // Asigné el precio de la entrada.
        inicializarAsientos(); // Llamé al método para llenar la matriz con los asientos.
    }

    /* 
       Profesor, este método inicializó los asientos en la matriz, asignándoles etiquetas
       según su posición en la sala. Usé números para las filas y letras para las columnas.
     */
    private void inicializarAsientos() {
        char columna = 'A'; // Inicié las etiquetas de columna desde la letra 'A'.
        for (int i = 0; i < asientos.length; i++) { // Recorrí cada fila de la matriz de asientos.
            for (int j = 0; j < asientos[i].length; j++) { // Recorrí cada asiento en la fila.
                // Profesor, aquí creé un nuevo asiento en la posición i, j de la matriz,
                // y le asigné un número de fila y una letra de columna.
                asientos[i][j] = new Clase_Asiento(i + 1, (char) (columna + j));
            }
        }
    }

    /*
       Profesor, este método mostró todos los asientos del cine y su estado (ocupado o libre) en la consola.
       Cada asiento se mostró con su etiqueta, seguido de "O" si estaba libre o "X" si estaba ocupado.
     */
    public void mostrarAsientos() {
        for (Clase_Asiento[] fila : asientos) { // Recorrí cada fila de asientos.
            for (Clase_Asiento asiento : fila) { // Recorrí cada asiento en la fila.
                // Aquí mostré la etiqueta de cada asiento y su estado
                System.out.print(asiento.getEtiqueta() + (asiento.estaOcupado() ? " X " : " O "));
            }
            System.out.println(); // Agregué una nueva línea después de cada fila.
        }
    }

    /*
       Profesor, este método intenta asignar un asiento aleatorio a un espectador si cumplía con los requisitos.
       Verifica que el asiento estuviera libre, y que el espectador cumpliera con la edad mínima y el dinero suficiente.
     */
    public void asignarAsientoAleatorio(Clase_Espectador espectador) {
        int fila; // Variable para almacenar la fila del asiento seleccionado.
        int columna; // Variable para almacenar la columna del asiento seleccionado.
        boolean asientoAsignado = false; // Variable que indicó si se asignó un asiento.

        while (!asientoAsignado) { // Bucle que intentó asignar un asiento aleatorio al espectador.
            // Generé índices aleatorios para seleccionar una fila y columna dentro de los límites de la matriz.
            fila = (int) (Math.random() * asientos.length);
            columna = (int) (Math.random() * asientos[0].length);

            Clase_Asiento asiento = asientos[fila][columna]; // Obtuve el asiento en la posición seleccionada.

            if (!asiento.estaOcupado()) { // Verifiqué si el asiento estaba libre.
                if (espectador.puedeVerPelicula(pelicula, precioEntrada)) { // Verifiqué si cumplía con los requisitos de edad y dinero.
                    asiento.ocupar(); // Marqué el asiento como ocupado.
                    espectador.pagar(precioEntrada); // Desconté el precio de la entrada del dinero del espectador.

                    // Profesor, mostré en la consola los detalles del espectador, película y asiento asignado.
                    System.out.println("Espectador: " + espectador.getNombre()); // Nombre del espectador.
                    System.out.println("Detalles de la Película: " + pelicula.mostrarDetallesPelicula()); // Detalles de la película.
                    System.out.println("Asiento asignado: " + asiento.getEtiqueta()); // Asiento asignado.
                    System.out.println("---------------------------------------------");

                    asientoAsignado = true; // Cambié el estado a asignado.
                } else {
                    // Profesor, si el espectador no cumplía con los requisitos, mostré un mensaje y terminé la asignación.
                    System.out.println("El espectador " + espectador.getNombre() + " no cumple con los requisitos.");
                    asientoAsignado = true; // Terminé el bucle si el espectador no cumplía con los requisitos.
                }
            } else {
                // Mostré un mensaje si el asiento aleatorio ya estaba ocupado y se buscaría otro.
                System.out.println("El asiento " + asiento.getEtiqueta() + " ya está ocupado.");
            }
        }
    }
}
