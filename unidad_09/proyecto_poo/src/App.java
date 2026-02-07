import mapa.Mapa;

public class App {
    public static void main(String[] args) throws Exception{

        Mapa mapa = new Mapa(10, 10);

        mapa.generarLadrones();

        mapa.generarPolicias();

        mapa.generarCaja();

        do {
            mapa.Pintar();
            mapa.moverPolicia();
            Thread.sleep(500);
        } while (true);

    }
}