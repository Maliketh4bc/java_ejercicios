package mapa;
import personajes.*;
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
        
            Ladron ladron = new Ladron(randancho,randalto);
            atomo[randalto][randancho] = ladron;
            ladrones.add(ladron);
        }
    }

    public ArrayList<Ladron> getLadrones(){
        return ladrones;
    }

    public void generarPolicias(){

        int cantidad = (int)((Math.random()*((alto*ancho))*0.01)+2);

        for(int i=0; i<cantidad; i++){
            int randalto = (int)(Math.random()*alto);
            int randancho = (int)(Math.random()*ancho);

            Policia policia = new Policia(randancho,randalto);
            atomo[randalto][randancho] = policia;
            policias.add(policia);
        }
    }

    public ArrayList<Policia> getPolicias() {
        return policias;
    }

    public void generarCaja(){

        int cantidad = (int)((Math.random()*(alto*ancho))*0.03);

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

            if (newX < ancho && atomo[beforeY][newX] == null) {
                aMover.setX(newX);
                atomo[beforeY][beforeX] = null;
                atomo[beforeY][newX] = aMover;   
            }

    }

    public void reducirX(Atomo aMover){
            int beforeX = aMover.getX();
            int beforeY = aMover.getY();
            int newX = beforeX - 1;

            if (newX >= 0 && atomo[beforeY][newX] == null) {
                aMover.setX(newX);
                atomo[beforeY][beforeX] = null;
                atomo[beforeY][newX] = aMover;   
            }
    }

    public void aumentarY(Atomo aMover){
            int beforeX = aMover.getX();
            int beforeY = aMover.getY();
            int newY = beforeY + 1;

            if (newY < alto && atomo[newY][beforeX] == null) {
                aMover.setY(newY);
                atomo[beforeY][beforeX] = null;
                atomo[newY][beforeX] = aMover;   
            }
    }

    public void reducirY(Atomo aMover){
            int beforeX = aMover.getX();
            int beforeY = aMover.getY();
            int newY = beforeY - 1;

            if (newY >= 0 && atomo[newY][beforeX] == null) {
                aMover.setY(newY);
                atomo[beforeY][beforeX] = null;
                atomo[newY][beforeX] = aMover;   
            }
    }

    public void moverPolicia(){
        for (int i = 0; i < policias.size(); i++){
            Policia hunter = policias.get(i);
            Ladron aBuscar = hunter.buscarLadronCercano(ladrones);

            if(ladrones.isEmpty()){
                victoria();
                return;
            }

            if(hunter.getX() == aBuscar.getX()-1 && hunter.getY() == aBuscar.getY() || 
                hunter.getX() == aBuscar.getX()+1 && hunter.getY() == aBuscar.getY() ||
                    hunter.getX() == aBuscar.getX() && hunter.getY() == aBuscar.getY()+1 ||
                        hunter.getX() == aBuscar.getX() && hunter.getY() == aBuscar.getY()-1){

                atomo[aBuscar.getY()][aBuscar.getX()] = null;

                for (int j=ladrones.size()-1; j >= 0; j--) {

                    Ladron l = ladrones.get(j);

                    if((l.getX() == aBuscar.getX()) && (l.getY() == aBuscar.getY())){
                        ladrones.remove(j);
                        break;
                    }

                }
            }

            if(aBuscar.getX() >= hunter.getX()){
                aumentarX(hunter);
            }else{
                reducirX(hunter);
            }

            if(aBuscar.getY() >= hunter.getY()){
                aumentarY(hunter);
            }else{
                reducirY(hunter);
            }
        }
    }

    /**
     * Para huir
     */
    public void moverLadron(){
        for (int i = 0; i < ladrones.size(); i++){
            Ladron presa = ladrones.get(i);
            Policia hunter = presa.buscarPoliciaCercano(policias);
            if ((presa.calcularDistancia(hunter.getPosicion()) < 10)) {

                    if(presa.getX() < hunter.getX()){
                        reducirX(presa);
                    }else{
                        aumentarX(presa);
                    }

                    if(presa.getY() < hunter.getY()){
                        reducirY(presa);
                    }else{
                        aumentarY(presa);
                    }
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
