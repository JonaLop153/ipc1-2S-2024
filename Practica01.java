import java.util.Scanner;

public class Practica01 {

    private static final String USUARIO_VALIDO = "sensei_<3020059940101>"; //Variable, el final es porque no se modificarán
    private static final String CONTRASEÑA_VALIDA = "ipc1_<3020059940101>";//Variable

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean autenticado = false;

        while (!autenticado) {
            System.out.println("Ingrese su usuario:");
            String usuario = scanner.nextLine();

            System.out.println("Ingrese su contraseña:");
            String contraseña = scanner.nextLine(); // Corrección: variable contraseña

            if (autenticarUsuario(usuario, contraseña)) {
                autenticado = true;
                mostrarMenu();
            } else {
                System.out.println("Error: Usuario o contraseña incorrectos. Inténtelo nuevamente.");
            }
        }
    }

    private static boolean autenticarUsuario(String usuario, String contraseña) {
        return usuario.equals(USUARIO_VALIDO) && contraseña.equals(CONTRASEÑA_VALIDA);
    }

    private static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al menú:");
        System.out.println("1. Opción 1");
        System.out.println("2. Opción 2");
        System.out.println("3. Salir");

        int opcion = scanner.nextInt();
        scanner.nextLine(); // Corrección: limpiar el buffer

        switch (opcion) {
            case 1:
                System.out.println("Has seleccionado la opción 1");
                break;
            case 2:
                System.out.println("Has seleccionado la opción 2");
                break;
            case 3:
                System.out.println("Hasta luego");
                break;
            default:
                System.out.println("Opción inválida");
        }
    }
}
