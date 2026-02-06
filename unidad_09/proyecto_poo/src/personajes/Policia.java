package personajes;
import mapa.Mapa;
import posicion.Posicion;
import java.util.ArrayList;

public class Policia extends Atomo{

    public Policia(int cordx, int cordy){
        super(cordx, cordy);
    }

    public Atomo buscarLadronCercano(ArrayList<Atomo> ladrones){
        int min = Integer.MAX_VALUE;
        Atomo aBuscar = null;
        for (int i=0; i<ladrones.size(); i++) {
            Atomo ladron = ladrones.get(i);
            int distancia = this.CalcularDistancia(ladron.getPosicion());
        
            if(distancia < min){
                min = distancia;
                aBuscar = ladron;
            }
        }

        return aBuscar;
    }

    @Override
    public String toString(){
        return "P░";
    }
}
