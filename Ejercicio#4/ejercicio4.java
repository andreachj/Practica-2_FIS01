import java.util.Scanner;

public class  ejercicio4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double d, a1, a2, t;

        System.out.println("Seleccione una opción:");
        System.out.println("1. Usar datos predefinidos del enunciado");
        System.out.println("2. Ingresar valores manualmente");
        System.out.print("Opcion: ");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            d = 10.0;  
            a1 = 2.0;  
            a2 = 1.0;  
            t = 3.0;  
        } else if (opcion == 2) {
            System.out.print("Ingrese la distancia inicial entre los carritos en metros: ");
            d = scanner.nextDouble();

            System.out.print("Ingrese la aceleracion del primer carrito en (m/s^2): ");
            a1 = scanner.nextDouble();

            System.out.print("Ingrese la aceleracion del segundo carrito en(m/s^2): ");
            a2 = scanner.nextDouble();

            System.out.print("Ingrese el tiempo transcurrido segundos: ");
            t = scanner.nextDouble();
        } else {
            System.out.println("Opcion invalida. Terminando programa.");
            scanner.close();
            return;
        }

        double t_elevado = t * t;  
        double d1 = 0.5 * a1 * t_elevado; //carrito 1
        double d2 = 0.5 * a2 * t_elevado; //carrito 2

        double separacion = d1 + d + d2;

        double t_toparse_elevado = (2 * d) / (a1 + a2);
        double t_toparse = Math.sqrt(t_toparse_elevado); 

        System.out.println("\nResultados:");
        System.out.println("La separacioon de los carritos luego de " + t + "s es de " + separacion + " m");
        System.out.println("A los pilotos les tomara " + t_toparse + "s toparse");

        // Cerrar scanner
        scanner.close();
    }
}