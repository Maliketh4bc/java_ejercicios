import mapa.Mapa;

public class App {

    public static final String RED = "\u001B[31m";
    public static final String RESET = "\u001B[0m";
    public static void main(String[] args) throws Exception{

        Mapa mapa = new Mapa(40, 80);

        mapa.generarLadrones();

        mapa.generarPolicias();

        mapa.generarCaja();

        pantallaCarga();

        limpiarPantalla();

        do {
            mapa.Pintar();
            mapa.moverPolicia();
            mapa.moverLadron();
            Thread.sleep(10);
            limpiarPantalla();
        } while (mapa.getVictoria() == false);

        limpiarPantalla();
        mapa.Pintar();
        Thread.sleep(500);
        System.out.printf(RED + "\nVICTORIA DEL DEPARTAMENTO DE POLICIA DE MIAMI" + RESET);

    }

    public static void limpiarPantalla() {
        System.out.print("\033[H");
        System.out.flush();

    }

    public static void pantallaCarga() throws InterruptedException {
        System.out.printf("Cargando");

        for(int i=0; i<(int)((Math.random()*2)+2);i++){
            System.out.print(".");
            Thread.sleep(500);
        }
        System.out.println();
        for(int i=3; i>=0; i--){
            if (i>0) {
                System.out.printf("%s", i);
                System.out.println("");
            }else{
                System.out.print("GO!");
            }
            Thread.sleep(500);
        }
        Thread.sleep(500);
    }
}