package mapa;
import personajes.Atomo;
import personajes.Ladron;

public class Mapa{

    private int alto;
    private int ancho;
    private Atomo atomo[][]; 

    public Mapa(int alto, int ancho){
        this.alto = alto;
        this.ancho = ancho;
        this.atomo = new Atomo[alto][ancho];
    }

    public void generarLadron(){
        atomo[5][7] = new Ladron(7,5);
    }

    public void Pintar(){

        for (int i = 0; i < atomo.length; i++) {
            for (int j = 0; j < atomo.length; j++) {
                System.out.printf("%-2s", (atomo[i][j] == null)?" ":atomo[5][7].toString());
            }
            System.out.println();
        }
    }
}
