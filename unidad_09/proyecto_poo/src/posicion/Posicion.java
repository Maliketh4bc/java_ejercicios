package posicion;

/**
 * Clase que representa una posición en un sistema de coordenadas cartesianas 2D.
 * Encapsula las coordenadas X e Y y proporciona métodos para manipularlas
 * y calcular distancias entre posiciones.
 * 
 * @author Marco
 * @version 1.0
 */
public class Posicion {
    /** Coordenada horizontal en el plano */
    private int x;
    
    /** Coordenada vertical en el plano */
    private int y;

    /**
     * Constructor que inicializa una posición con coordenadas específicas.
     * 
     * @param x Coordenada horizontal (eje X)
     * @param y Coordenada vertical (eje Y)
     */
    public Posicion(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Obtiene la coordenada X de la posición.
     * 
     * @return Valor de la coordenada X
     */
    public int getcordX() {
        return x;
    }

    /**
     * Obtiene la coordenada Y de la posición.
     * 
     * @return Valor de la coordenada Y
     */
    public int getcordY() {
        return y;
    }

    /**
     * Establece un nuevo valor para la coordenada X.
     * 
     * @param x Nuevo valor para la coordenada X
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Establece un nuevo valor para la coordenada Y.
     * 
     * @param y Nuevo valor para la coordenada Y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Calcula la distancia Manhattan entre esta posición y otra.
     * La distancia Manhattan es la suma de las diferencias absolutas
     * de las coordenadas X e Y. Es apropiada para movimientos en grid
     * donde solo se permite movimiento horizontal y vertical.
     * 
     * @param presa Posición destino con la que calcular la distancia
     * @return Distancia Manhattan como valor entero (siempre positivo)
     */
    public int calcularDistancia(Posicion presa){
        int distancia;
        distancia = Math.abs(presa.x - this.x) + Math.abs(presa.y - this.y);
        return distancia;
    }
}
