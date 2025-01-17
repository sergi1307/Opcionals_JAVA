//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int opc;

        do {
            System.out.println("1 - Opcional 1");
            System.out.println("2 - Opcional 2");
            System.out.println("3 - Opcional 3");
            System.out.println("4 - Opcional 4");
            System.out.println("5 - Opcional 5");
            System.out.println("6 - Opcional 6");

            opc = Leer.leerEntero("Introduzca una opción: ");

            if (opc == 1) {
                Opcionales.opcional1();
            } else if (opc == 2) {
                Opcionales.opcional2();
            } else if (opc == 3) {
                Opcionales.opcional3();
            } else if (opc == 4) {
                Opcionales.opcional4();
            } else if (opc == 5) {
                Opcionales.opcional5();
            } else if (opc == 6) {
                Opcionales.opcional6();
            }
        } while (opc != 0);
    }
}