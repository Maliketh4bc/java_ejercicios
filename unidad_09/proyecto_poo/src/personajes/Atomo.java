package personajes;

import posicion.Posicion;

public abstract class Atomo {
    protected Posicion posicion;

    protected Atomo(int cordx, int cordy){
        this.posicion = new Posicion(cordx, cordy);    
    }

    public Posicion getPosicion(){
        return posicion;
    }

    public void setPosicion(Posicion nuevaPos){
        this.posicion = nuevaPos;
    }

    public int getX(){
        return posicion.getcordX();
    }
    
    public int getY(){
        return posicion.getcordY();
    }

    public void setX(int x){
        posicion.setX(x);
    }

    public void setY(int y){
        posicion.setY(y);
    }

    public int calcularDistancia(Posicion presa){
        return this.posicion.calcularDistancia(presa);
    }

    public abstract String toString();//Si atomo es abstracto necesita al menos un metodo abstracto
    //por eso lo pongo
}
