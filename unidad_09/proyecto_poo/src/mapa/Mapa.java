package mapa;
import personajes.*;
import java.util.ArrayList;

/**
 * Clase que gestiona el tablero de juego y la lógica principal de la simulación.
 * 
 * Esta clase es responsable de:
 * - Crear y mantener el grid del mapa
 * - Generar y gestionar todas las entidades (policías, ladrones, cajas)
 * - Implementar la lógica de movimiento de los personajes
 * - Detectar capturas de ladrones
 * - Renderizar el estado visual del juego
 * 
 * El mapa utiliza una matriz bidimensional de Atomo para representar
 * todas las posiciones posibles donde pueden ubicarse los personajes y obstáculos.
 * 
 * @author Marco
 * @version 1.0
 * @see Atomo
 * @see Policia
 * @see Ladron
 * @see Caja
 */
public class Mapa{

    /** Altura del mapa en unidades */
    private int alto;
    
    /** Ancho del mapa en unidades */
    private int ancho;
    
    /** 
     * Matriz bidimensional que representa el tablero del juego.
     * Cada posición puede contener un Atomo (Policia, Ladron o Caja)
     * o ser null si está vacía.
     */
    private Atomo atomo[][];
    
    /** Lista dinámica que mantiene todos los ladrones activos en el juego */
    private ArrayList<Ladron> ladrones = new ArrayList<Ladron>();
    
    /** Lista dinámica que mantiene todos los policías activos en el juego */
    private ArrayList<Policia> policias = new ArrayList<Policia>();
    
    /** Lista dinámica que mantiene todas las cajas (obstáculos) del juego */
    private ArrayList<Caja> cajas = new ArrayList<Caja>();
    
    /** 
     * Bandera que indica si se ha alcanzado la condición de victoria.
     * Se activa cuando todos los ladrones han sido capturados.
     */
    public boolean victoria = false;

    /**
     * Constructor que inicializa el mapa con dimensiones específicas.
     * Crea la matriz del tablero pero no genera las entidades aún.
     * 
     * @param alto Número de filas del mapa
     * @param ancho Número de columnas del mapa
     */
    public Mapa(int alto, int ancho){
        this.alto = alto;
        this.ancho = ancho;
        this.atomo = new Atomo[alto][ancho];
    }

    /**
     * Establece el estado de victoria del juego a verdadero.
     * Este método se llama cuando todos los ladrones han sido capturados.
     */
    public void victoria(){
        victoria = true;
    }

    /**
     * Obtiene el estado actual de victoria del juego.
     * 
     * @return true si todos los ladrones han sido capturados, false en caso contrario
     */
    public boolean getVictoria(){
        return victoria;
    }

    /**
     * Genera ladrones en posiciones aleatorias del mapa.
     * La cantidad de ladrones es aproximadamente el 3% del tamaño total del mapa,
     * con un mínimo de 2 ladrones.
     * 
     * Los ladrones se ubican en posiciones aleatorias y se añaden tanto
     * a la matriz del mapa como a la lista de ladrones.
     */
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

    /**
     * Obtiene la lista de todos los ladrones activos en el juego.
     * 
     * @return ArrayList con todos los ladrones que aún no han sido capturados
     */
    public ArrayList<Ladron> getLadrones(){
        return ladrones;
    }

    /**
     * Genera policías en posiciones aleatorias del mapa.
     * La cantidad de policías es aproximadamente el 1% del tamaño total del mapa,
     * con un mínimo de 2 policías.
     * 
     * Los policías se ubican en posiciones aleatorias y se añaden tanto
     * a la matriz del mapa como a la lista de policías.
     */
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

    /**
     * Obtiene la lista de todos los policías en el juego.
     * 
     * @return ArrayList con todos los policías activos
     */
    public ArrayList<Policia> getPolicias() {
        return policias;
    }

    /**
     * Genera cajas (obstáculos) en posiciones aleatorias del mapa.
     * La cantidad de cajas es aproximadamente el 3% del tamaño total del mapa.
     * 
     * Las cajas funcionan como obstáculos estáticos que bloquean el movimiento
     * de policías y ladrones.
     */
    public void generarCaja(){

        int cantidad = (int)((Math.random()*(alto*ancho))*0.03);

        for(int i=0; i<cantidad; i++){
            int randalto = (int)(Math.random()*alto);
            int randancho = (int)(Math.random()*ancho);

            atomo[randalto][randancho] = new Caja(randancho,randalto);
            cajas.add((Caja)atomo[randalto][randancho]);
        }
    }

    /**
     * Obtiene la lista de todas las cajas en el mapa.
     * 
     * @return ArrayList con todas las cajas (obstáculos) del juego
     */
    public ArrayList<Caja> getCajas() {
        return cajas;
    }

    /**
     * Intenta mover un átomo una posición hacia la derecha (incrementa X).
     * El movimiento solo se realiza si:
     * - La nueva posición está dentro de los límites del mapa
     * - La posición destino está vacía
     * 
     * Si el movimiento es válido, actualiza tanto la posición del átomo
     * como la matriz del mapa.
     * 
     * @param aMover Átomo que se desea mover hacia la derecha
     */
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

    /**
     * Intenta mover un átomo una posición hacia la izquierda (decrementa X).
     * El movimiento solo se realiza si:
     * - La nueva posición está dentro de los límites del mapa
     * - La posición destino está vacía
     * 
     * Si el movimiento es válido, actualiza tanto la posición del átomo
     * como la matriz del mapa.
     * 
     * @param aMover Átomo que se desea mover hacia la izquierda
     */
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

    /**
     * Intenta mover un átomo una posición hacia abajo (incrementa Y).
     * El movimiento solo se realiza si:
     * - La nueva posición está dentro de los límites del mapa
     * - La posición destino está vacía
     * 
     * Si el movimiento es válido, actualiza tanto la posición del átomo
     * como la matriz del mapa.
     * 
     * @param aMover Átomo que se desea mover hacia abajo
     */
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

    /**
     * Intenta mover un átomo una posición hacia arriba (decrementa Y).
     * El movimiento solo se realiza si:
     * - La nueva posición está dentro de los límites del mapa
     * - La posición destino está vacía
     * 
     * Si el movimiento es válido, actualiza tanto la posición del átomo
     * como la matriz del mapa.
     * 
     * @param aMover Átomo que se desea mover hacia arriba
     */
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

    /**
     * Ejecuta el turno de movimiento de todos los policías.
     * 
     * Para cada policía:
     * 1. Busca el ladrón más cercano
     * 2. Verifica si está adyacente al ladrón (captura)
     * 3. Si hay captura, elimina al ladrón del juego
     * 4. Si no, mueve al policía en dirección al ladrón
     * 
     * El policía se mueve tanto en el eje X como en el Y en el mismo turno,
     * permitiendo movimiento diagonal.
     * 
     * Si todos los ladrones son capturados, establece el estado de victoria.
     */
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
     * Ejecuta el turno de movimiento de todos los ladrones.
     * 
     * Para cada ladrón:
     * 1. Busca el policía más cercano
     * 2. Calcula la distancia al policía
     * 3. Si el policía está a menos de 10 unidades, el ladrón huye
     * 4. El movimiento de huida es en dirección opuesta al policía
     * 
     * El ladrón se mueve tanto en el eje X como en el Y en el mismo turno,
     * permitiendo movimiento diagonal.
     * 
     * Los ladrones solo reaccionan cuando hay un policía suficientemente cerca,
     * creando un comportamiento de "zona de peligro".
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


    /**
     * Renderiza el estado actual del mapa en la consola.
     * 
     * Recorre toda la matriz y para cada posición:
     * - Si contiene un átomo, imprime su representación toString()
     * - Si está vacía, imprime el símbolo "░░"
     * 
     * Utiliza códigos ANSI para colores que ya están incluidos
     * en el toString() de cada tipo de átomo.
     */
    public void Pintar(){

        for (int i = 0; i < atomo.length; i++) {
            for (int j = 0; j < atomo[i].length; j++) {
                System.out.printf("%-2s", (atomo[i][j] == null)?"░░":atomo[i][j]);
            }
            System.out.println();
        }
    }

}
