package personajes;
import java.util.ArrayList;

/**
 * Clase que representa un policía en el juego.
 * Los policías persiguen a los ladrones más cercanos y los capturan
 * cuando están adyacentes a ellos.
 * 
 * Hereda de Atomo y proporciona comportamiento específico para
 * la búsqueda y persecución de ladrones.
 * 
 * @author Marco
 * @version 1.0
 * @see Atomo
 * @see Ladron
 */
public class Policia extends Atomo{

    /**
     * Constructor que crea un policía en una posición específica.
     * 
     * @param cordx Coordenada X inicial del policía
     * @param cordy Coordenada Y inicial del policía
     */
    public Policia(int cordx, int cordy){
        super(cordx, cordy);
    }

    /**
     * Busca el ladrón más cercano a este policía en una lista de ladrones.
     * Utiliza la distancia Manhattan para determinar cuál está más cerca.
     * Si la lista está vacía, retorna null.
     * 
     * @param ladrones Lista de ladrones entre los que buscar
     * @return El ladrón más cercano, o null si la lista está vacía
     */
    public Ladron buscarLadronCercano(ArrayList<Ladron> ladrones){
        int min = Integer.MAX_VALUE;
        Ladron aBuscar = null;
        
        for (int i=0; i<ladrones.size(); i++) {
            Ladron ladron = ladrones.get(i);
            int distancia = this.calcularDistancia(ladron.getPosicion());
        
            if(distancia < min){
                min = distancia;
                aBuscar = ladron;
            }
        }

        return aBuscar;
    }

    /**
     * Proporciona la representación visual del policía en el mapa.
     * Utiliza códigos ANSI para mostrar una 'P' en color azul y negrita.
     * 
     * @return String con código ANSI que representa un policía azul
     */
    @Override
    public String toString(){
        return "\033[1m\033[94mP \033[0m";
    }
}
