public class App {

    static int coordenadas[][] = new int[4][5];

    static int xTesoro = (int) (Math.random() * 4);
    static int yTesoro = (int) (Math.random() * 3);

    static int xMina = (int) (Math.random() * 4);
    static int yMina = (int) (Math.random() * 3);

    static int yInput = 0;
    static int xInput = 0;

    static boolean derrota = false;
    static boolean victoria = false;

    static int num = 0;

    public static void main(String[] args) throws Exception {

        while (xMina == xTesoro || yMina == yTesoro) {
            xMina = (int) (Math.random() * 4);
            yMina = (int) (Math.random() * 3);
        }

        do {
            System.out.print("Coordenada x: ");
            xInput = Integer.parseInt(System.console().readLine());

            System.out.print("Coordenada y: ");
            yInput = Integer.parseInt(System.console().readLine());

            coordenadas[yInput][xInput] = 1;
            coordenadas[yTesoro][xTesoro] = 2;
            coordenadas[yMina][xMina] = 200;

            if (coordenadas[yInput][xInput] == coordenadas[yMina][xMina]) {
                derrota = true;
            }

            if (coordenadas[yInput][xInput] == coordenadas[yTesoro][xTesoro]) {
                victoria = true;
            }

            if (derrota == false && victoria == false)
                printGame();

            num = (xInput == 0 || xInput == 4 || yInput == 0 || yInput == 3) ? 0 : 1;

            if (Math.abs(xInput - xMina) < 2 && Math.abs(yInput - yMina) < 2) {
                System.out.printf("Cuidado! Hay una mina cerca%n%n");
            }

        } while ((derrota == false) && (victoria == false));

        if (coordenadas[yInput][xInput] == 2) {
            System.out.println("GANASTE");
            printGame();
        } else if (coordenadas[yInput][xInput] == 200) {
            System.out.println("PERDISTE");
            printGame();
        }
    }

    public static void printGame() {

        System.out.println("¡EN BUSCA DEL TESORO!");
        System.out.println();

        for (int i = 0; i < 4; i++) {
            System.out.printf("%d |", i);
            for (int j = 0; j < 5; j++) {
                System.out.printf(" %-2s", (coordenadas[i][j] == 1) ? "X"
                        : (coordenadas[i][j] == 2 && (victoria == true || derrota == true)) ? "$"
                                : (coordenadas[i][j] == 200 && (victoria == true || derrota == true)) ? "*" : " ");
            }

            System.err.println();
        }
        System.out.println("------------------");
        System.out.print("  |");
        for (int j = 0; j < 5; j++) {
            System.out.printf(" %-2s", j);
        }

        System.out.println();
    }
}