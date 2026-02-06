package posicion;

public class Posicion {
    private int x;
    private int y;

    public Posicion(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getcordX() {
        return x;
    }

    public int getcordY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int calcularDistancia(Posicion presa){

        int distancia;

        distancia = Math.abs(presa.x - this.x) + Math.abs(presa.y - this.y);

        return distancia;
    }
}
