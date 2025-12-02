public class App {

    public static final String FONDO_NEGRO = "\u001B[40m";
    public static final String FONDO_BLANCO = "\u001B[47m";
    public static final String FONDO_ROJO = "\u001B[41m";
    public static final String RESET = "\033[0m";

    static int casilla[][] = new int[8][8];
    static char letraCasillaInput = ' ';
    static int letraCasilla = 0;
    static int numCasilla = 0;

    static int diagonales[][] = new int[7][7];

    static boolean color = false;

    public static void main(String[] args) throws Exception {

        printBox(casilla);

        do {
            System.out.print("Introduce la letra de la casilla que quieres: ");
            letraCasillaInput = System.console().readLine().charAt(0);
        } while (letraCasillaInput < 'a' || letraCasillaInput > 'h');

        do {
            System.out.print("Introduce el numero de la casilla que quieres: ");
            numCasilla = Integer.parseInt(System.console().readLine());
        } while (numCasilla < 1 || numCasilla > 8);

        asignLetter(letraCasillaInput);

        casilla[numCasilla][letraCasilla] = 1;

        printBox(casilla);

    }

    public static int asignLetter(char caracter) {
        switch (letraCasillaInput) {
            case 'a':
                letraCasilla = 0;
                break;
            case 'b':
                letraCasilla = 1;
                break;
            case 'c':
                letraCasilla = 2;
                break;
            case 'd':
                letraCasilla = 3;
                break;
            case 'e':
                letraCasilla = 4;
                break;
            case 'f':
                letraCasilla = 5;
                break;
            case 'g':
                letraCasilla = 6;
                break;
            case 'h':
                letraCasilla = 7;
                break;
            default:
                System.out.println("Introduce letra válida");
                break;
        }
        return letraCasilla;
    }

    public static void printBox(int n[][]) {
        System.out.println();
        for (int i = -1; i <= 8; i++) {

            if (i == -1) {
                for (char letrilla = 'a' - 1; letrilla <= 'h'; letrilla++)
                    System.out.printf("%s ", (letrilla == 'a' - 1 || letrilla == 8) ? "" : letrilla);
            }

            for (int j = -1; j <= 8; j++) {

                if (j == -1 && i >= 0 && i < 8)
                    System.out.print(i + 1);
                if (j != 8)
                    color = !color;

                if (j > -1 && j < 8 && i > -1 && i < 8) {
                    System.out.printf("%s",
                            (casilla[i][j] == casilla[numCasilla][letraCasilla]) ? FONDO_ROJO + "  " + RESET
                                    : (color) ? FONDO_BLANCO + "  " + RESET : FONDO_NEGRO + "  " + RESET);
                }

                if (j == 8 && i >= 0 && i < 8)
                    System.out.print(i + 1);
            }

            if (i == 8) {
                for (char letrilla = 'a' - 1; letrilla <= 'h'; letrilla++)
                    System.out.printf("%s ", (letrilla == 'a' - 1 || letrilla == 8) ? "" : letrilla);
            }

            System.out.println();
        }
    }

}
