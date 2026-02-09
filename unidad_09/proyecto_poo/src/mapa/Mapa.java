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
        int cantidad = (int)((Math.random()*((alto*ancho))*0.04)+2);

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
        for (int i = 0; i < policias.size(); i++){
            Policia hunter = policias.get(i);
            Ladron aBuscar = hunter.buscarLadronCercano(ladrones);

            if(ladrones.isEmpty()){
                victoria();
                return;
            }

            if(hunter.getX() == aBuscar.getX() && hunter.getY() == aBuscar.getY()){

                atomo[aBuscar.getY()][aBuscar.getX()] = null;

                for (int j=ladrones.size()-1; j >= 0; j--) {

                    Ladron l = ladrones.get(j);

                    if((l.getX() == aBuscar.getX()) && (l.getY() == aBuscar.getY())){
                        ladrones.remove(j);
                        break;
                    }

                }
            }

            if(aBuscar.getX() > hunter.getX()){
                aumentarX(hunter);
            }else{
                reducirX(hunter);
            }

            if(aBuscar.getY() > hunter.getY()){
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

            if(hunter.getX() >= presa.getX()){
                reducirX(presa);
            }else{
                aumentarX(hunter);
            }

            if(hunter.getY() >= presa.getY()){
                reducirY(hunter);
            }else{
                aumentarY(hunter);
            }
        }
    }


    /**
     * Pinta el mapa usando StringBuilder para evitar parpadeo (doble buffer)
     */
    public void Pintar(){
        // Códigos ANSI para colores
        String RESET = "\033[0m";
        String CYAN = "\033[96m";
        String YELLOW = "\033[93m";
        String GREEN = "\033[92m";
        String RED = "\033[91m";
        String BLUE = "\033[94m";
        String BOLD = "\033[1m";
        String BG_DARK = "\033[100m";
        
        // Usar StringBuilder para construir toda la salida de una vez (doble buffer)
        StringBuilder buffer = new StringBuilder();
        
        // Título de la simulación
        buffer.append(BOLD).append(CYAN).append("+================================================================+").append(RESET).append("\n");
        buffer.append(BOLD).append(CYAN).append("|").append(RESET).append(BOLD).append(YELLOW)
              .append("       SIMULACION POLICIAS VS LADRONES - MIAMI PD              ")
              .append(CYAN).append("|").append(RESET).append("\n");
        buffer.append(BOLD).append(CYAN).append("+================================================================+").append(RESET).append("\n");
        
        // Leyenda
        buffer.append(BOLD).append(CYAN).append("|").append(RESET).append("  ")
              .append(BLUE).append(BOLD).append("[P]").append(RESET).append(BLUE)
              .append(" Policias: ").append(String.format("%-2d", policias.size())).append(RESET).append("  ")
              .append(RED).append(BOLD).append("[L]").append(RESET).append(RED)
              .append(" Ladrones: ").append(String.format("%-2d", ladrones.size())).append(RESET).append("  ")
              .append(YELLOW).append(BOLD).append("[#]").append(RESET).append(YELLOW)
              .append(" Cajas: ").append(String.format("%-2d", cajas.size())).append(RESET)
              .append("           ").append(CYAN).append("|").append(RESET).append("\n");
        buffer.append(BOLD).append(CYAN).append("+================================================================+").append(RESET).append("\n");
        buffer.append("\n");
        
        // Borde superior del mapa
        buffer.append(GREEN).append(BOLD).append("╔");
        for (int j = 0; j < atomo[0].length; j++) {
            buffer.append("══");
        }
        buffer.append("╗").append(RESET).append("\n");
        
        // Contenido del mapa
        for (int i = 0; i < atomo.length; i++){
            buffer.append(GREEN).append(BOLD).append("║").append(RESET);
            for (int j = 0; j < atomo[i].length; j++) {
                if(atomo[i][j] == null) {
                    buffer.append(BG_DARK).append("  ").append(RESET);
                } else {
                    buffer.append(atomo[i][j]);
                }
            }
            buffer.append(GREEN).append(BOLD).append("║").append(RESET).append("\n");
        }
        
        // Borde inferior del mapa
        buffer.append(GREEN).append(BOLD).append("╚");
        for (int j = 0; j < atomo[0].length; j++) {
            buffer.append("══");
        }
        buffer.append("╝").append(RESET).append("\n");
        buffer.append("\n");
        
        // Imprimir todo de una vez (evita parpadeo)
        System.out.print(buffer.toString());
        System.out.flush();
    }

}
