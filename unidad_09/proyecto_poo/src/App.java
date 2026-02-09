import mapa.Mapa;

public class App {
    public static void main(String[] args) throws Exception{

        Mapa mapa = new Mapa(20, 40);

        mapa.generarLadrones();

        mapa.generarPolicias();

        mapa.generarCaja();

        do {
            mapa.Pintar();
            mapa.moverPolicia();
            mapa.moverLadron();
            Thread.sleep(100);
            limpiarPantalla();
        } while (mapa.getVictoria() == false);

        limpiarPantalla();

        System.out.println("VICTORIA DEL DEPARTAMENTO DE POLICIA DE MIAMI");

    }

    public static void limpiarPantalla() {
        try {
            String sistemaOperativo = System.getProperty("os.name");
            
            if (sistemaOperativo.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            // Fallback: imprimir líneas en blanco
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
        }
    }
}