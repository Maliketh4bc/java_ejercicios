public class App {

    public static final String FONDO_NEGRO = "\u001B[40m";
    public static final String FONDO_BLANCO = "\u001B[47m";
    public static final String FONDO_ROJO = "\u001B[41m";
    public static final String FONDO_CYAN = "\u001B[46m";
    public static final String RESET = "\033[0m";

    public static int casilla[][] = new int[8][8];

    static int letraCasilla = 0;
    static int numCasilla = 0;

    static int numAleatorio = 0;
    static int letraAleatorio = 0;
    
    public static boolean color = false;


    public static void main(String[] args) throws Exception {

        //primera reina
        numAleatorio = (int)(Math.random()*8);
        letraAleatorio = (int)(Math.random()*8);

        numCasilla = numAleatorio;
        letraCasilla = letraAleatorio;

        casilla[numCasilla][letraCasilla] = 1;
        
        movReina();

        printBox(casilla);

        colocarNuevaReina();

        printBox(casilla);

    }

    /**
     * Función para Imprimir el tablero de ajedrez junto con la
     * casilla seleccionada y las posibles rutas del alfil.
     * @param n
     */
    public static void printBox(int n[][]) {
        System.out.println();
        for (int i = -1; i <= 8; i++) {

            if (i == -1) {
                for (char j = 'a' - 1; j <= 'h'; j++) System.out.printf("%s ", (j == 'a' - 1 || j == 8) ? "" : j);
            }

            for (int j = -1; j <= 8; j++) {

                if (j == -1 && i >= 0 && i < 8) System.out.print(i + 1);
                if (j != 8) color = !color;

                if (j > -1 && j < 8 && i > -1 && i < 8) {
                    System.out.printf("%s",
                            (casilla[i][j] == 1) ? FONDO_CYAN + "  " + RESET : (casilla[i][j] == 2)?FONDO_ROJO + "  " + RESET
                                    : (color) ? FONDO_BLANCO + "  " + RESET : FONDO_NEGRO + "  " + RESET);
                }

                if (j == 8 && i >= 0 && i < 8) System.out.print(i + 1);
            }

            if (i == 8) {
                for (char j = 'a' - 1; j <= 'h'; j++) System.out.printf("%s ", (j == 'a' - 1 || j == 8) ? "" : j);
            }

            System.out.println();
        }
        System.out.println();
    }

    public static void movReina(){

        for(int i=0; i<4; i++){
            int num1 = (i==0 || i==2)?1:-1;
            int num2 = (i==1 || i==3)?1:-1;
            int aux1 = numCasilla;
            int aux2 = letraCasilla;
            while (aux2 >= 0 && aux2 < 8 && aux1 >= 0 && aux1 < 8) {
                aux1 += (i==0 || i==3)?num1:0;
                aux2 += (i==1 || i==2)?num2:0;
                if((aux2 >= 0 && aux2 < 8 && aux1 >= 0 && aux1 < 8) && casilla[aux1][aux2] != 1)casilla[aux1][aux2] = 2;
                if(aux1 == numCasilla && aux2 == letraCasilla) casilla[aux1][aux2] = 1;
            }
        }

        for(int i=0; i<4; i++){
            int num1 = (i==0 || i==3)?1:-1;
            int num2 = (i==0 || i==2)?1:-1;
            int aux1 = numCasilla;
            int aux2 = letraCasilla;
            while (aux2 >= 0 && aux2 < 8 && aux1 >= 0 && aux1 < 8) {
                aux1 += num1;
                aux2 += num2;
                if(aux2 >= 0 && aux2 < 8 && aux1 >= 0 && aux1 < 8)casilla[aux1][aux2] = 2;
                if(aux1 == numCasilla && aux2 == letraCasilla) casilla[aux1][aux2] = 1;
            }
        }
    }

    public static void colocarNuevaReina(){

        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                if(casilla[i][j] == 0){
                    numCasilla = i;
                    letraCasilla = j;
                    movReina();
                }
            }
        }

    }
}
