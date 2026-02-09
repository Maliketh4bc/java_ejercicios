package personajes;
import java.util.ArrayList;

public class Policia extends Atomo{

    public Policia(int cordx, int cordy){
        super(cordx, cordy);
    }

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

    @Override
    public String toString(){
        return "P░";
    }
}
