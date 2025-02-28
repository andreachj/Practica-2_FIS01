public class ejercicioextra {
    public static void main(String[] args) throws InterruptedException {
        double Vi = 20.0; 
        double Ades = -1.0; 
        double Aace = 0.5; 
        int tiempoParada = 10; 
        int t_s = 1;
        double posicionInicial = 0.0; 
        double velocidad = Vi;

        int distanciaParada = 20; 
        String viaTren = "----------------------------------------------------"; 

        // **Fase 1: Frenado del tren**
        System.out.println("Fase 1: Desaceleracion del tren");
        for (int t = 1; velocidad > 0; t++) {
            posicionInicial += velocidad * t_s + 0.5 * Ades * t_s * t_s;
            velocidad += Ades * t_s;
            imprimirTren(posicionInicial, distanciaParada, viaTren);
            Thread.sleep(200);
        }

        System.out.println("\nFase 2: El tren esta haciendo la parada en la estacion");
        for (int t = 1; t <= tiempoParada; t++) {
            imprimirTren(posicionInicial, distanciaParada, viaTren);
            Thread.sleep(500);
        }

        // **Fase 3: Aceleración del tren**
        System.out.println("\nFase 3: El tren acelera para seguir su recorrido");
        velocidad = 0;
        for (int t = 1; velocidad < Vi; t++) {
            posicionInicial += velocidad * t_s + 0.5 * Aace * t_s * t_s;
            velocidad += Aace * t_s;
            imprimirTren(posicionInicial, distanciaParada, viaTren);
            Thread.sleep(200);
        }

        System.out.println("\nEl tren ya va con velocidad y continúa su recorrido.");
    }

    public static void imprimirTren(double posicion, int estacion, String via) {
        int posInt = (int) (posicion / 10); 
        int longitudVia = via.length();
        posInt = Math.min(posInt, longitudVia - 1); 


        StringBuilder viaDibujo = new StringBuilder(via);
        viaDibujo.setCharAt(estacion, '|'); 
        viaDibujo.setCharAt(posInt, 'T'); 

        System.out.println(viaDibujo.toString());
    }
}
