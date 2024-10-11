package cinemajava;

import java.util.Scanner;

public class Clase_Main {

    public static void main(String[] args) {
        /* 
           Profesor, aquí creamos la película "El Exorcismo" con una restricción de edad mínima de 17 años.
           Esta instancia de Clase_Pelicula almacenará el título y la edad mínima para poder verla.
         */
        Clase_Pelicula pelicula = new Clase_Pelicula("El Exorcismo", 17, 120, "chespirito");

        /* 
           Creamos el objeto Clase_Cine para representar la sala de cine.
           El cine tendrá 8 filas y 9 columnas de asientos, usando la película creada y estableciendo 
           el precio de la entrada en 13,000 pesos. (Estamos hablando en este caso, de la moneda colombiana).
         */
        Clase_Cine cine = new Clase_Cine(8, 9, pelicula, 13000.0);

        // Creamos un objeto Scanner para recibir los datos de entrada desde la consola.
        Scanner scanner = new Scanner(System.in);

        // Llamamos al método mostrarAsientos para imprimir el estado actual de todos los asientos en la consola.
        cine.mostrarAsientos();

        // Inicializo la variable "continuar" en "si" para controlar el bucle de asignación de asientos.
        String continuar = "si";
        // Creamos un respectivo bucle para asignar asientos a los espectadores, en este caso el while, mientras el usuario ingrese "si" como respuesta.
        while (continuar.equals("si")) {
            System.out.print("Ingrese el nombre del espectador: "); // Solicitamos el nombre del espectador.
            String nombre = scanner.nextLine(); // Leemos el nombre ingresado por el usuario.

            System.out.print("Ingrese la edad del espectador: "); // Solicitamos la edad del espectador.
            int edad = scanner.nextInt(); // Leemos la edad ingresada.

            System.out.print("Ingrese el dinero del espectador: "); // Solicitamos lo que es la cantidad de dinero del espectador.
            double dinero = scanner.nextDouble(); // Leemos el dinero ingresado.
            scanner.nextLine(); // Limpiamos el buffer del scanner.

            /* 
               Profesor, en este apartado, cremos un nuevo objeto Clase_Espectador con los datos ingresados (nombre, edad y dinero).
               Este objeto representa al espectador que quiere ver la película y a quien se le intentará asignar un asiento.
             */
            Clase_Espectador espectador = new Clase_Espectador(nombre, edad, dinero);

            // Llamamos al método de Clase_Cine para asignar un asiento aleatorio al espectador si cumple los requisitos.
            cine.asignarAsientoAleatorio(espectador);

            // Le Preguntamos al usuario si desea asignar otro asiento, esperando "si" o "no" como respuesta.
            System.out.print("¿Quieres asignar otro asiento? (si/no): ");
            continuar = scanner.nextLine(); // Lee la respuesta ingresada.
        }

        // Y por ultimo y para finalizar el programa profesor, mostramos un mensaje indicando que el programa ha finalizado.
        System.out.println("Programa finalizado.");
        // PD: Este paso es opcional, cerramos el scanner para liberar los recursos utilizados.
        scanner.close();
    }
}
