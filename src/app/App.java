package app;

public class App {
    public static void main(String[] args) throws Exception {

        Olimpiada olimpiadaCoronaEdition;

        olimpiadaCoronaEdition = new Olimpiada();

        Maratonista maratonista1;

        maratonista1 = new Maratonista();

        maratonista1.nombre = "Sonic";
        maratonista1.procedencia = "SEGAWORLD";
        maratonista1.pasaporte = "SE58996023";
        maratonista1.edad = 25;
        maratonista1.energia = 100;

        boolean corrio;
        maratonista1.participar(olimpiadaCoronaEdition);

        while (maratonista1.energia > 0) {
            corrio = maratonista1.correr();

            /*
             * if (corrio) { System.out.println("Lo logro, " + maratonista1.nombre +
             * " esta corriendo.");
             * 
             * } else System.out.println("No pudo, esta lesionado");
             * 
             * }
             */

            if (maratonista1.energia <= 0) {
                System.out.println("  " + maratonista1.nombre + " se quedo sin energia.");

            }
        }
    }
}