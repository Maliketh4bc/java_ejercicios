public class App {

    static final String FONDO_NEGRO = "\u001B[40m";
    static final String FONDO_BLANCO = "\u001B[47m";
    static final String FONDO_ROJO = "\u001B[41m";
    static final String FONDO_CYAN = "\u001B[46m";
    static final String RESET = "\033[0m";

    static int option = 0;

    static int casilla[][] = new int[8][8];
    static String ficha[] = {"peón","torre","caballo","alfil","rey","reina"};

    static char letraCasillaInput = ' ';
    static int letraCasilla = 0;
    static int numCasilla = 0;
    
    static boolean color = false;

    public static void main(String[] args) throws Exception {

        printBox(casilla);

        reqCasilla();

        System.out.println("Introduce con que ficha quieres jugar:");
        int cont=0;
        for(String palabra : ficha){
            System.out.printf("%s %s%n",cont + ".",palabra);
            cont++;
        }
        option = Integer.parseInt(System.console().readLine());

        casilla[numCasilla][letraCasilla] = 1;

        printBox(casilla);

        setMovement(option);

        posiblesMovimientos();

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

    public static void reqCasilla(){

        do {
            System.out.print("Introduce la letra de la casilla que quieres: ");
            letraCasillaInput = System.console().readLine().charAt(0);
        } while (letraCasillaInput < 'a' || letraCasillaInput > 'h');

        do {
            System.out.print("Introduce el numero de la casilla que quieres: ");
            numCasilla = Integer.parseInt(System.console().readLine());
        } while (numCasilla < 1 || numCasilla > 8);
        numCasilla--;

        letraCasilla = letraCasillaInput-97;

    }

    public static void setMovement(int option){

        switch (option) {
            case 0:
                
                break;
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:

                for(int i=0; i<4; i++){
                    int num1 = (i==0 || i==3)?1:-1;
                    int num2 = (i==0 || i==2)?1:-1;
                    int aux1 = numCasilla;
                    int aux2 = letraCasilla;
                    while (aux2 >= 0 && aux2 < 8 && aux1 >= 0 && aux1 < 8) {
                        aux1 += num1;
                        aux2 += num2;
                        if(aux2 >= 0 && aux2 < 8 && aux1 >= 0 && aux1 < 8)casilla[aux1][aux2] = 2;
                    }
                }

                break;
            case 4:

                for(int i=0; i<3; i++){
                    for(int j=0; j<3; j++) {
                        int numero = (i==0)?-1:(i==2)?1:0;
                        int letra = (i==0 || i==2)?1:-1;
                        int aux1 = numCasilla;
                        int aux2 = letraCasilla;
                        if(aux2 >= 0 && aux2 < 8 && aux1 >= 0 && aux1 < 8)casilla[aux1][aux2] = 2;
                    }
                }

                break;
            case 5:
                
                break;
            default:
                System.out.println("Introduce pieza existente");
                break;
        }
    }

    public static void posiblesMovimientos(){

        System.out.printf("%n%s puede ir a: ",ficha[option]);
        for(int i=0; i<8;i++){
            for(int j=0; j<8; j++){
                if(casilla[i][j] == 2) System.out.printf("%s%s%s ",(char)(j+97),i+1,(i!=7)?",":"."); 
            }
        }

    }

}