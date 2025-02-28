import java.util.Scanner;

public class ejercicio2 {
    
    public static double tiempoCrecimiento(double Xi, double Xf, double velocidad) {
        return (Xf - Xi) / velocidad;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final double Xi_cm = 1.5;
        final double velocidad_cm_mes = 2.0;
        double Xf_cm;
        int opcion;

        while (true) {
            System.out.print("Ingrese el largo deseado del cabello en cm: ");
            if (scanner.hasNextDouble()) {
                Xf_cm = scanner.nextDouble();
                if (Xf_cm > Xi_cm) {
                    break;
                } else {
                    System.out.println("Error: La longitud final debe ser mayor que 1.5 cm.");
                }
            } else {
                System.out.println("Entrada no válida. Ingrese un número.");
                scanner.next();
            }
        }

        double tiempoMeses = tiempoCrecimiento(Xi_cm, Xf_cm, velocidad_cm_mes);

        double[] conversiones = {
            tiempoMeses * 2.628e+6,  // Segundos
            tiempoMeses * 43800,     // Minutos
            tiempoMeses * 730,       // Horas
            tiempoMeses * 30.44,     // Días
            tiempoMeses * 4.34,      // Semanas
            tiempoMeses              // Meses
        };

        String[] unidades = {"segundos", "minutos", "horas", "días", "semanas", "meses"};

        while (true) {
            System.out.println("Elija la unidad de tiempo:\n1. Segundos\n2. Minutos\n3. Horas\n4. Días\n5. Semanas\n6. Meses");
            System.out.print("Ingrese una opcion (1-6): ");
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                if (opcion >= 1 && opcion <= 6) {
                    break;
                } else {
                    System.out.println("Error: Opcion invalida.");
                }
            } else {
                System.out.println("Entrada no valida. Ingrese un numero entre 1 y 6.");
                scanner.next();
            }
        }

        System.out.printf("El cabello tardar aproximadamente %.3f %s en alcanzar la longitud deseada.%n", 
                          conversiones[opcion - 1], unidades[opcion - 1]);

        scanner.close();
    }
}
