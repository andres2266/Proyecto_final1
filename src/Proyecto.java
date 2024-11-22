import java.util.Scanner;

public class Proyecto {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("Como quieres acceder al sistema?");
        System.out.println("1. Administrador");
        System.out.println("2. Gestor");
        System.out.println("3. Inversor");
        int opcion = Integer.parseInt(S.next());
        int contador = 0;
        String Usuario = "";
        switch (opcion) {

            case 1:
                System.out.println("Bienvenido al modo Administrador, Introduce el usuario y la contraseña");
                System.out.println("Usuario");
                String usuario = S.nextLine();
                System.out.println("Contraseña");
                String contraseña = S.nextLine();
                for (int i = 1; i == 1; i++) {


                }
            case 2:
                System.out.println();
            case 3:
                System.out.println();

            default:
                System.out.println("Opciópn incorrecta: ");

        }
    }
}
