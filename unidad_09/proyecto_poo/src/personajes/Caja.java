package personajes;

public class Caja extends Atomo{
    
    public Caja(int cordx, int cordy){
        super(cordx, cordy);
    }

    public String toString(){
        return "\033[1m\033[93m██\033[0m";
    }
}
