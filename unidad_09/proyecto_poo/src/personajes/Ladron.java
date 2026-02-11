package personajes;

import java.util.ArrayList;

/**
 * Clase que representa un ladrón en el juego.
 * Los ladrones intentan huir de los policías cuando estos se encuentran
 * a una distancia menor a un umbral definido.
 * 
 * Hereda de Atomo y proporciona comportamiento específico para
 * detectar amenazas y escapar de ellas.
 * 
 * @author Marco
 * @version 1.0
 * @see Atomo
 * @see Policia
 */
public class Ladron extends Atomo{

    /**
     * Constructor que crea un ladrón en una posición específica.
     * 
     * @param cordx Coordenada X inicial del ladrón
     * @param cordy Coordenada Y inicial del ladrón
     */
    public Ladron(int cordx, int cordy){
        super(cordx, cordy);
    }

    /**
     * Busca el policía más cercano a este ladrón en una lista de policías.
     * Utiliza la distancia Manhattan para determinar cuál está más cerca.
     * Este método es crucial para la lógica de huida del ladrón.
     * Si la lista está vacía, retorna null.
     * 
     * @param policias Lista de policías entre los que buscar
     * @return El policía más cercano, o null si la lista está vacía
     */
    public Policia buscarPoliciaCercano(ArrayList<Policia> policias){
        int min = Integer.MAX_VALUE;
        Policia hunter = null;
        
        for (int i=0; i<policias.size(); i++) {
            Policia policia = policias.get(i);
            int distancia = this.calcularDistancia(policia.getPosicion());
        
            if(distancia < min){
                min = distancia;
                hunter = policia;
            }
        }

        return hunter;
    }

    /**
     * Proporciona la representación visual del ladrón en el mapa.
     * Utiliza códigos ANSI para mostrar una 'L' en color rojo y negrita.
     * 
     * @return String con código ANSI que representa un ladrón rojo
     */
    @Override
    public String toString(){
        return "\033[1m\033[91mL \033[0m";
    }
}
