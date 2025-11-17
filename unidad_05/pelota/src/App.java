public class App {

    static int ancho = 20;
    static int alto = 20;
    static int vx = 1;
    static int vy = 2;
    static int x = ancho/2;
    static int y = alto/2;
    static boolean paint = false;

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

    public static void printBox(){

        for(int i=1; i<=alto; i++){
            
            for(int j=1; j<=ancho; j++){
                
                if(i==1 || i==alto || j==1 || j==ancho){
                    System.out.print("* ");
                }else if(i==y && j==x){
                    System.out.print("O ");
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }

    }

    public static void main(String[] args) throws Exception {
        do{
            limpiarPantalla();
            if(x<=2 || x>=ancho-1) vx *= -1;
            if(y<=2 || y>=alto-1) vy *= -1;
            x += vx;
            y += vy;
            printBox();
            Thread.sleep(300);
        }while(true);
    }
}
