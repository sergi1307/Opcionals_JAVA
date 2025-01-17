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
    };

    public static void opcional3() {};

    public static void opcional4() {};

    public static void opcional5() {};

    public static void opcional6() {};
}
