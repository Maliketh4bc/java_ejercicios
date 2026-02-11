package personajes;

import posicion.Posicion;

/**
 * Clase abstracta que representa la entidad base de todos los elementos
 * que pueden ubicarse en el mapa del juego.
 * Define el comportamiento común para todos los personajes y objetos,
 * como la gestión de posición y el cálculo de distancias.
 * 
 * Esta clase implementa el patrón Template Method, donde los hijos
 * deben proporcionar su propia implementación de toString() para
 * definir su representación visual.
 * 
 * @author Marco
 * @version 1.0
 * @see Policia
 * @see Ladron
 * @see Caja
 */
public abstract class Atomo {
    /** 
     * Posición actual del átomo en el mapa.
     * Protected para permitir acceso a los hijos.
     */
    protected Posicion posicion;

    /**
     * Constructor protegido que inicializa un átomo con coordenadas específicas.
     * Solo puede ser invocado por los hijos.
     * 
     * @param cordx Coordenada X inicial
     * @param cordy Coordenada Y inicial
     */
    protected Atomo(int cordx, int cordy){
        this.posicion = new Posicion(cordx, cordy);    
    }

    /**
     * Obtiene la posición actual del átomo.
     * 
     * @return Objeto Posicion que representa la ubicación actual
     */
    public Posicion getPosicion(){
        return posicion;
    }

    /**
     * Establece una nueva posición para el átomo.
     * 
     * @param nuevaPos Nueva posición a asignar
     */
    public void setPosicion(Posicion nuevaPos){
        this.posicion = nuevaPos;
    }

    /**
     * Obtiene la coordenada X actual del átomo.
     * Método de conveniencia que delega en la posición interna.
     * 
     * @return Coordenada X actual
     */
    public int getX(){
        return posicion.getcordX();
    }
    
    /**
     * Obtiene la coordenada Y actual del átomo.
     * Método de conveniencia que delega en la posición interna.
     * 
     * @return Coordenada Y actual
     */
    public int getY(){
        return posicion.getcordY();
    }

    /**
     * Establece la coordenada X del átomo.
     * Método de conveniencia que delega en la posición interna.
     * 
     * @param x Nueva coordenada X
     */
    public void setX(int x){
        posicion.setX(x);
    }

    /**
     * Establece la coordenada Y del átomo.
     * Método de conveniencia que delega en la posición interna.
     * 
     * @param y Nueva coordenada Y
     */
    public void setY(int y){
        posicion.setY(y);
    }

    /**
     * Calcula la distancia Manhattan entre este átomo y una posición destino.
     * Delega el cálculo al objeto Posicion interno.
     * 
     * @param presa Posición con la que calcular la distancia
     * @return Distancia Manhattan como entero positivo
     */
    public int calcularDistancia(Posicion presa){
        return this.posicion.calcularDistancia(presa);
    }

    /**
     * Método abstracto que debe ser implementado por los hijos
     * para proporcionar una representación visual del átomo.
     * Permite el polimorfismo en la visualización del mapa.
     * 
     * @return String con la representación visual del átomo (generalmente con códigos ANSI)
     */
    public abstract String toString();
}
