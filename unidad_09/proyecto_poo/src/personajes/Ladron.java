package personajes;

import java.util.ArrayList;

public class Ladron extends Atomo{

    public Ladron(int cordx, int cordy){
        super(cordx, cordy);
    }

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

    @Override
    public String toString(){
        return "\033[1m\033[91mL \033[0m";
    }
}
