public class App {

    static int max = 20;
    static int mitad = max/2;

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

        for(int i=mitad; i>=1; i--){
            int numS = mitad - i;
            int numA = i*2 -1;

            for(int j=0; j<numS; j++){
                System.out.print(" ");
            }
            
            for(int j=0; j<numA; j++){
                if(i==1 || j==0 || i==mitad || j==numA-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            
            
            if(i!=1)System.out.println();
        }
        
        for(int i=1; i<=mitad; i++){
            int numS = mitad - i;
            int numA = i*2 -1;

            for(int j=0; j<numS; j++){
                System.out.print(" ");
            }
            
            for(int j=0; j<numA; j++){
                if(i==1 || j==0 || i==mitad || j==numA-1){
                    System.out.print("*");
                }else{
                    System.out.printf(" ");
                }
            }

            System.out.println();
        }

    }
    public static void main(String[] args) throws Exception {
        
        do{
            limpiarPantalla();
            
            printClock();
            Thread.sleep(1000);
        }while(true);
        

    }
}
