import mapa.Mapa;

public class App {
    public static void main(String[] args) throws Exception{

        Mapa mapa = new Mapa(20, 40);

        mapa.generarLadrones();

        mapa.generarPolicias();

        mapa.generarCaja();

        limpiarPantalla();
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
        System.out.print("\033[H");
        System.out.flush();

    }
}