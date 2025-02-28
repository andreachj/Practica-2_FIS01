import java.util.Scanner;

public class ejercicio1 {
    
    public static double tiempoImpulso(double distancia, double velocidad) {
        return distancia / velocidad;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double velocidad_impulso = 100.0;
        int opcion;

        do {
            System.out.print("Ingrese la distancia en metros a calcular el tiempo en llegar el impulso nervioso hasta el cerebro: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Ingrese un número válido.");
                scanner.next();
            }
            double distancia = scanner.nextDouble();

            double tiempo = tiempoImpulso(distancia, velocidad_impulso);
            System.out.printf("El impulso nervioso tardara aproximadamente %.3f segundos.%n", tiempo, " segundos");

            System.out.print("¿Desea calcular otro tiempo? (1: Si, 2: No): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada no valida. Ingrese 1 o 2.");
                scanner.next();
            }
            opcion = scanner.nextInt();

        } while (opcion == 1);

        System.out.println("Programa finalizado. Gracias");
        scanner.close();
    }
}
