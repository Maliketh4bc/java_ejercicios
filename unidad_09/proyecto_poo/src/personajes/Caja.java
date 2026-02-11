package personajes;

/**
 * Clase que representa un obstáculo estático en el mapa.
 * Las cajas bloquean el movimiento de policías y ladrones,
 * funcionando como barreras que añaden complejidad al juego.
 * 
 * A diferencia de Policia y Ladron, las cajas no tienen comportamiento
 * activo y permanecen inmóviles durante toda la partida.
 * 
 * @author Marco
 * @version 1.0
 * @see Atomo
 */
public class Caja extends Atomo{
    
    /**
     * Constructor que crea una caja en una posición específica.
     * Las cajas son inmóviles una vez creadas.
     * 
     * @param cordx Coordenada X donde se ubicará la caja
     * @param cordy Coordenada Y donde se ubicará la caja
     */
    public Caja(int cordx, int cordy){
        super(cordx, cordy);
    }

    /**
     * Proporciona la representación visual de la caja en el mapa.
     * Utiliza códigos ANSI para mostrar un bloque sólido ('██') en color amarillo y negrita.
     * El doble carácter crea una apariencia de obstáculo más sólido.
     * 
     * @return String con código ANSI que representa una caja amarilla
     */
    public String toString(){
        return "\033[1m\033[93m██\033[0m";
    }
}
