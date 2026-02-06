import mapa.Mapa;

public class App {
    public static void main(String[] args) {

        Mapa mapa = new Mapa(40, 80);

        mapa.generarLadrones();

        mapa.generarPolicias();

        mapa.generarCaja();

        mapa.Pintar();

    }
}