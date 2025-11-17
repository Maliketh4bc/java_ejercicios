public class App {

    static int max = 10;
    static int numSand = 8;
    static int aux = 1;
    static int cont = 0;

    public static void limpiarPantalla() {
        try {
            String sistemaOperativo = System.getProperty("os.name");
            
            if (sistemaOperativo.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            // Fallback: imprimir líneas en blanco
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
        }
    }

    public static void printClock(){

        for(int i=max; i>1; i--){
            int numS = max - i;
            int numA = i*2 -1;

            for(int j=0; j<numS; j++){
                System.out.print(" ");
            }
            
            for(int j=0; j<numA; j++){
                System.out.printf("%s", ((i==0 || j==0 || i==max || j==numA-1) || max-i<=numSand)?"*":" ");
            }
            
            
            if(i!=1)System.out.println();
        }
        
        for(int i=1; i<max; i++){
            int numS = max - i;
            int numA = i*2 -1;

            for(int j=0; j<numS; j++){
                System.out.print(" ");
            }
            
            for(int j=0; j<numA; j++){
                System.out.printf("%s", ((i==0 || j==0 || i==max || j==numA-1) || i>=numSand)?"*":" ");
            }

            System.out.println();
        }

    }
    public static void main(String[] args) throws Exception {
        
        do{
            limpiarPantalla();
            
            printClock();
            if(numSand==0) aux = 1; else if(numSand==8) aux *= -1;
            numSand += aux;
            Thread.sleep(1000);
        }while(true);
        

    }
}
