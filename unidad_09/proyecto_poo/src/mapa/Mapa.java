package mapa;
import personajes.Atomo;
import personajes.Ladron;
import personajes.Policia;
import posicion.Posicion;
import personajes.Caja;
import java.util.ArrayList;

public class Mapa{

    private int alto;
    private int ancho;
    private Atomo atomo[][];
    private ArrayList<Atomo> ladrones = new ArrayList<Atomo>();

    public Mapa(int alto, int ancho){
        this.alto = alto;
        this.ancho = ancho;
        this.atomo = new Atomo[alto][ancho];
    }

    public void generarLadrones(){
        int cantidad = 4;//(int)((Math.random()*(alto*ancho))*0.02);

        for(int i=0; i<cantidad; i++){
            int randalto = (int)(Math.random()*alto);
            int randancho = (int)(Math.random()*ancho);

            atomo[randalto][randancho] = new Ladron(randancho,randalto);
            ladrones.add(atomo[randalto][randancho]);
        }
    }

    public ArrayList<Atomo> getLadrones(){
        return ladrones;
    }

    public void generarPolicias(){

        int cantidad = 1;//(int)((Math.random()*(alto*ancho))*0.02);

        for(int i=0; i<cantidad; i++){
            int randalto = (int)(Math.random()*alto);
            int randancho = (int)(Math.random()*ancho);

            atomo[randalto][randancho] = new Policia(randancho,randalto);
        }
    }

    public void generarCaja(){

        int cantidad = 0;//(int)((Math.random()*(alto*ancho))*0.03);

        for(int i=0; i<cantidad; i++){
            int randalto = (int)(Math.random()*alto);
            int randancho = (int)(Math.random()*ancho);

            atomo[randalto][randancho] = new Caja(randancho,randalto);
        }
    }

    public void Pintar(){

        for (int i = 0; i < atomo.length; i++) {
            for (int j = 0; j < atomo[i].length; j++) {
                System.out.printf("%-2s", (atomo[i][j] == null)?"░░":atomo[i][j]);
            }
            System.out.println();
        }
    }

}
