import mapa.Mapa;

public class App {
    public static void main(String[] args) {

        Mapa mapa = new Mapa(40, 80);

        mapa.generarLadron();

        mapa.generarPolicia();

        mapa.generarCaja();

        mapa.Pintar();

    }
}