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
    private ArrayList<Ladron> ladrones = new ArrayList<Ladron>();
    private ArrayList<Policia> policias = new ArrayList<Policia>();
    private ArrayList<Caja> cajas = new ArrayList<Caja>();

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
            ladrones.add((Ladron)atomo[randalto][randancho]);
        }
    }

    public ArrayList<Ladron> getLadrones(){
        return ladrones;
    }

    public void generarPolicias(){

        int cantidad = 1;//(int)((Math.random()*(alto*ancho))*0.02);

        for(int i=0; i<cantidad; i++){
            int randalto = (int)(Math.random()*alto);
            int randancho = (int)(Math.random()*ancho);

            atomo[randalto][randancho] = new Policia(randancho,randalto);
            policias.add((Policia)atomo[randalto][randancho]);
        }
    }

    public ArrayList<Policia> getPolicias() {
        return policias;
    }

    public void generarCaja(){

        int cantidad = 0;//(int)((Math.random()*(alto*ancho))*0.03);

        for(int i=0; i<cantidad; i++){
            int randalto = (int)(Math.random()*alto);
            int randancho = (int)(Math.random()*ancho);

            atomo[randalto][randancho] = new Caja(randancho,randalto);
            cajas.add((Caja)atomo[randalto][randancho]);
        }
    }

    public void moverPolicia(){
        for (int i = 0; i < policias.size(); i++) {
            Policia policia = policias.get(i);
            
            int beforeX = policia.getX();
            int beforeY = policia.getY();
            int newX = beforeX + 1;
            
            if (newX < ancho) {
                policia.setX(newX);
                atomo[beforeY][beforeX] = null;
                atomo[beforeY][newX] = policia;   
            }
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
