package cinemajava;

public class Clase_Asiento {
    
    //Realizamos la determinada creación de variables.

    private int fila; //  Esta variable procedera almacenar el número de fila del asiento.
    private char columna; // Esta variable procedera almacenar la Letra de columna del respectivo asiento.
    private boolean ocupado;  //Esta variable nos indicara si el asiento se encuentra ocupado o no.

    
    // En este apartado, crearemos un constructor que inicialice los atributos correspondientes al asiento.

    public Clase_Asiento(int fila, char columna) {
        this.fila = fila; // Este asigna el número de fila a la variable de instancia.
        this.columna = columna; // Este asigna la letra de columna a la variable de instancia.
        this.ocupado = false; // Este apartado nos indica que inicialmente, el asiento se encuentra vacío o no se cuentra ocupado.
    }

   // Creamos un método que verificara si el asiento está ocupado.

    public boolean estaOcupado() {
        return ocupado; // Este devuelve o devolverá si el asiento está ocupado.
    }
    
    // Creamos un método que marca o indicará el asiento como ocupado.

    public void ocupar() {
        ocupado = true; // Este apartado realizara el cambio de estado del asiento a ocupado.
    }
    
   /* Acá profesor creamos un método que devuelve la etiqueta del asiento en formato.
     "fila-columna" por ejemplo: 1A  */


    public String getEtiqueta() {
        return fila + "" + columna; //Y por ultimo para este apartado retornamos la etiqueta combinada de fila y columna.
    }
}
