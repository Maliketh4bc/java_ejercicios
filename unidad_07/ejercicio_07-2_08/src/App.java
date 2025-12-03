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
        do{ 
            for(int i=0; i<8; i++){
                for(int j=0; j<8; j++){
                    casilla[i][j] = 0;
                }
            }
            printBox(casilla);
            reqCasilla();

            System.out.println("Introduce con que pieza quieres jugar:");
            int cont=0;
            for(String palabra : ficha){
                System.out.printf("%s %s%n",cont + ".",palabra);
                cont++;
            }
            System.out.println("6. Salir");
            option = Integer.parseInt(System.console().readLine());

            casilla[numCasilla][letraCasilla] = 1;

            limpiarPantalla();
            printBox(casilla);

            setMovement(option);

            posiblesMovimientos();

            printBox(casilla);
            Thread.sleep(2000);
            limpiarPantalla();

        }while(option != 6);
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

    /**
     * Función para pedir al usuario las dos coordenadas del
     * tablero para colocar su pieza.
     */
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

    /**
     * Función en la que clasifica el movimiento que tiene que
     * seguir según la opcion que haya escogido el usuario.
     * @param option
     */
    public static void setMovement(int option){

        switch (option) {
            case 0: // peon
                for(int i=0; i<3; i++){
                    for(int j=0; j<3; j++) {
                        int num1 = (i==0 && (j==0 || j==2))?-1:0;
                        int num2 = (j==0 && i==0)?-1:(j==2 && i==0)?1:0;
                        int aux1 = numCasilla;
                        int aux2 = letraCasilla;
                        aux1 += num1;
                        aux2 += num2;
                        if(aux2 >= 0 && aux2 < 8 && aux1 >= 0 && aux1 < 8)casilla[aux1][aux2] = 2;
                        if(aux1 == numCasilla && aux2 == letraCasilla) casilla[aux1][aux2] = 1;
                    }
                }
                break;
            case 1: // torre
                for(int i=0; i<4; i++){
                    int num1 = (i==0 || i==2)?1:-1;
                    int num2 = (i==1 || i==3)?1:-1;
                    int aux1 = numCasilla;
                    int aux2 = letraCasilla;
                    while (aux2 >= 0 && aux2 < 8 && aux1 >= 0 && aux1 < 8) {
                        aux1 += (i==0 || i==3)?num1:0;
                        aux2 += (i==1 || i==2)?num2:0;
                        if(aux2 >= 0 && aux2 < 8 && aux1 >= 0 && aux1 < 8)casilla[aux1][aux2] = 2;
                    }
                }
                break;
            case 2: // caballo
                int[][] movimientos = {{-2, 1}, {-2, -1},{2, 1}, {2, -1},{-1, 2}, {-1, -2},{1, 2}, {1, -2}};
                for(int i=0; i<8; i++){
                    int aux1 = numCasilla;
                    int aux2 = letraCasilla;
                    aux1 += movimientos[i][0];
                    aux2 += movimientos[i][1];

                    if(aux2 >= 0 && aux2 < 8 && aux1 >= 0 && aux1 < 8) casilla[aux1][aux2] = 2;
                }
                break;
            case 3: // alfil

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
            case 4: // rey

                for(int i=0; i<3; i++){
                    for(int j=0; j<3; j++) {
                        int num1 = (i==0)?-1:(i==2)?1:0;
                        int num2 = (j==0)?-1:(j==2)?1:0;
                        int aux1 = numCasilla;
                        int aux2 = letraCasilla;
                        aux1 += num1;
                        aux2 += num2;
                        if(aux2 >= 0 && aux2 < 8 && aux1 >= 0 && aux1 < 8)casilla[aux1][aux2] = 2;
                        if(aux1 == numCasilla && aux2 == letraCasilla) casilla[aux1][aux2] = 1;
                    }
                }

                break;
            case 5: // reina
                for(int i=0; i<4; i++){
                    int num1 = (i==0 || i==2)?1:-1;
                    int num2 = (i==1 || i==3)?1:-1;
                    int aux1 = numCasilla;
                    int aux2 = letraCasilla;
                    while (aux2 >= 0 && aux2 < 8 && aux1 >= 0 && aux1 < 8) {
                        aux1 += (i==0 || i==3)?num1:0;
                        aux2 += (i==1 || i==2)?num2:0;
                        if(aux2 >= 0 && aux2 < 8 && aux1 >= 0 && aux1 < 8)casilla[aux1][aux2] = 2;
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
                    }
                }
                break;
            default:
                System.out.println("Introduce pieza existente");
                break;
        }
    }

    /**
     * Imprimir en texto las casillas posibles
     */
    public static void posiblesMovimientos(){

        System.out.printf("%n%s puede ir a: ",ficha[option]);
        for(int i=0; i<8;i++){
            for(int j=0; j<8; j++){
                if(casilla[i][j] == 2) System.out.printf("%s%s%s ",(char)(j+97),i+1,(i!=7)?",":"."); 
            }
        }

    }

    /**
     * Limpiar pantalla
     */
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