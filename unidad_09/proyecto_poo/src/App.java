public class App {

    static int mapa[][] = new int[10][10];
    static int x = 5;
    static int y = 4;
    static int vx = 1;
    static int vy = 2;

    public static void main(String[] args) throws Exception {

        Personaje p1 = new Personaje("p1", 3, 6);

        do {

            mapa[Personaje.cordy-1][Personaje.cordx-1] = 1;

            PrintGame();

            mapa[y-1][x-1] = 0;

            if(x<=2 || x>=mapa.length-1){
                vx *= -1;
            } 
            if(y<=2 || y>=mapa.length-1){
                vy *= -1;
            }

            x += vx;
            y += vy;

            Thread.sleep(500);
            limpiarPantalla();

        } while (true);
        
    }
    
    public static void PrintGame(){

        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa.length; j++) {
                System.out.printf("%s ",(mapa[i][j] == 1)?"O":"*");
            }
            System.out.println();
        }

    }

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

}

