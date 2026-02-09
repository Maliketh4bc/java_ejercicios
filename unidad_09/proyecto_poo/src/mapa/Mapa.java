package mapa;
import personajes.Atomo;
import personajes.Ladron;
import personajes.Policia;
import personajes.Caja;
import java.util.ArrayList;

public class Mapa{

    private int alto;
    private int ancho;
    private Atomo atomo[][];
    private ArrayList<Ladron> ladrones = new ArrayList<Ladron>();
    private ArrayList<Policia> policias = new ArrayList<Policia>();
    private ArrayList<Caja> cajas = new ArrayList<Caja>();
    public boolean victoria = false;

    public Mapa(int alto, int ancho){
        this.alto = alto;
        this.ancho = ancho;
        this.atomo = new Atomo[alto][ancho];
    }

    public void victoria(){
        victoria = true;
    }

    public boolean getVictoria(){
        return victoria;
    }

    public void generarLadrones(){
        int cantidad = (int)((Math.random()*((alto*ancho))*0.03)+2);

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

        int cantidad = (int)((Math.random()*((alto*ancho))*0.03)+2);

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

    public ArrayList<Caja> getCajas() {
        return cajas;
    }

    public void aumentarX(Atomo aMover){
            int beforeX = aMover.getX();
            int beforeY = aMover.getY();
            int newX = beforeX + 1;

            if (newX < ancho) {
                aMover.setX(newX);
                atomo[beforeY][beforeX] = null;
                atomo[beforeY][newX] = aMover;   
            }
    }

    public void reducirX(Atomo aMover){
            int beforeX = aMover.getX();
            int beforeY = aMover.getY();
            int newX = beforeX - 1;

            if (newX >= 0) {
                aMover.setX(newX);
                atomo[beforeY][beforeX] = null;
                atomo[beforeY][newX] = aMover;   
            }
    }

    public void aumentarY(Atomo aMover){
            int beforeX = aMover.getX();
            int beforeY = aMover.getY();
            int newY = beforeY + 1;

            if (newY < alto) {
                aMover.setY(newY);
                atomo[beforeY][beforeX] = null;
                atomo[newY][beforeX] = aMover;   
            }
    }

    public void reducirY(Atomo aMover){
            int beforeX = aMover.getX();
            int beforeY = aMover.getY();
            int newY = beforeY - 1;

            if (newY >= 0) {
                aMover.setY(newY);
                atomo[beforeY][beforeX] = null;
                atomo[newY][beforeX] = aMover;   
            }
    }

    public void moverPolicia(){
        for (int i = 0; i < policias.size(); i++) {
            Policia policia = policias.get(i);
            Ladron aBuscar = policia.buscarLadronCercano(ladrones);

            if(ladrones.isEmpty()){
                victoria();
                return;
            }

            if(policia.getX() == aBuscar.getX() && policia.getY() == aBuscar.getY()){

                atomo[aBuscar.getY()][aBuscar.getX()] = null;

                for (int j=ladrones.size()-1; j >= 0; j--) {

                    Ladron l = ladrones.get(j);

                    if((l.getX() == aBuscar.getX()) && (l.getY() == aBuscar.getY())){
                        ladrones.remove(j);
                        break;
                    }

                }
            }

            if(aBuscar.getX() > policia.getX()){
                aumentarX(policia);
            }else{
                reducirX(policia);
            }

            if(aBuscar.getY() > policia.getY()){
                aumentarY(policia);
            }else{
                reducirY(policia);
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
