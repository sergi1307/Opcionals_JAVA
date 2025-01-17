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

    public static void opcional2() {};

    public static void opcional3() {};

    public static void opcional4() {};

    public static void opcional5() {};

    public static void opcional6() {};
}
