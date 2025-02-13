import java.util.Arrays;

public class Opcionales {

    /**
     * Ejercicio opcional 1: Haz un programa que haga lo siguiente:
     * Crear un array de nombre vector con 5 elementos de tipo entero.
     * Mostrar el contenido del vector.
     * Asignar a cada elemento el valor de 3.
     * Volver a mostrar el contenido del vector.
     * Calcular y mostrar el tamaño del array en bytes. (truco - sizeof)
     */
    public static void opcional1() {
        int[] vector = {5,89,4,3,14};
        int tamanyo;

        for (int i = 0; i < vector.length; i++) {
            System.out.println("El valor en la posición " + i + " és igual a: " + vector[i]);
        }
        for (int i = 0; i < vector.length; i++) {
            vector[i] = 3;
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println("El valor en la posición " + i + " és igual a: " + vector[i]);
        }

        tamanyo = vector.length * Integer.BYTES;
        System.out.println("El tamaño en bytes es: " + tamanyo + ".");
    }

    /**
     * Ejercicio opcional 2: Haz un programa que haga lo siguiente:
     * Crear un array de nombre edades con 10 elementos de tipo entero.
     * Llena el vector pidiendo las edades por teclado.
     * Pedir un número y mostrar la edad que está almacenada en esa posición.
     * Calcular la suma de los n primeros elementos de edades (parámetro dado por el usuario).
     */
    public static void opcional2() {
        int[] edades = new int[10];
        int edadBuscar, edadSuma, suma = 0;

        for (int i = 0; i < edades.length; i++) {
            edades[i] = Leer.leerEntero("Introduzca una edad: ");
        }

        edadBuscar = Leer.leerEntero("Introduzca la posición de la edad que quiere buscar: ");
        edadSuma = Leer.leerEntero("Introduzca la cantidad de posiciones que quieres sumar: ");

        System.out.println("La edad en la posición: " + edadBuscar + " és: " + edades[edadBuscar] + ".");

        for (int i = 0; i < edadSuma; i++) {
            suma = suma + edades[i];
        }

        System.out.println("La suma de las posiciones es: " + suma + ".");
    }

    /**
     * Ejercicio opcional 3: Haz un programa que haga lo siguiente:
     * Crear el vector origen, inicializado con los valores: 15,22,55,67,33,46,26,54,21,4
     * Recorrer el vector poniendo en un segundo vector, de nombre destino, todos los elementos
     * pares mayores de 30.
     * Muestra por pantalla el contenido del segundo vector (solo los valores añadidos).
     */
    public static void opcional3() {
        int[] origen = {15,22,55,67,33,46,26,54,21,4};
        int[] destino = new int[2];
        int iteraciones = -1;

        for (int j : origen) {
            if (j > 30 && j % 2 == 0) {
                iteraciones = iteraciones + 1;
                destino[iteraciones] = j;
            }
        }

        for (int i = 0; i < destino.length; i++) {
            System.out.println("-destino[" + i + "] = " + destino[i]);
        }
    }

    /**
     * Ejercicio opcional 4: Haz un programa que haga lo siguiente:
     * Crear la matriz calcular de dimensión 4x3 para almacenar valores enteros.
     * Imprimir la matriz
     */
    public static void opcional4() {
        int[][] matriz = new int[4][3];
        System.out.println(Arrays.deepToString(matriz));
    }

    /**
     * Ejercicio opcional 5: Haz un programa que haga lo siguiente:
     * Crear una matriz de dimensión 3x2 (3 filas y 2 columnas) llamada tabla para almacenar palabras.
     * Inicializala con la palabra: “libre”
     * Imprime la tabla
     */
    public static void opcional5() {
        String[][] tabla = new String [3][2];

        for (int i = 0; i < tabla.length; i++) {
            for(int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = "Libre";
            }
        }

        System.out.println("Contenido de la tabla:");
        for (int i = 0; i < tabla.length; i++) {
            for(int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * Ejercicio opcional 6: Haz un programa que haga lo siguiente:
     * Crear un array llamado opcional para almacenar 5 valores enteros.
     * Inicializalo con el valor 5
     * Modifica los valores del array restando, a cada valor, el valor de su posición.
     * Ordena los valores
     * Imprime el array con los valores finales.
     */
    public static void opcional6() {
        int[] opcional = {5,5,5,5,5};

        for (int i = 1; i < opcional.length; i++) {
            opcional[i] = 5 - i;
        }
        System.out.println(Arrays.toString(opcional));
    }
}
