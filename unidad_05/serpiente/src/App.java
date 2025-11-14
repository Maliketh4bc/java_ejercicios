public class App {

    static int snake = 0;
    static double position = 0;
    static double lastPosition = 0;
    static double angle = 0;
    static double seno = 0;

    static char head = '@';
    static char body = '*';

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

    public static void printSnake(){

        position = 15;

        for(int i=0;i<snake; i++){

            seno = Math.sin(Math.toRadians(angle));
            position = (seno*10)+15;

            for(int j=0; j<position; j++){
                System.out.print(" ");
            }

            angle += 30;

            System.out.printf("%s",(i==0)?head:body);

            System.out.println();
        }

    }

    public static void main(String[] args) throws Exception {

        System.out.print("Introduce la altura de la serpiente: ");
        snake = Integer.parseInt(System.console().readLine());

        do {
            limpiarPantalla();

            printSnake();
            Thread.sleep(300);
        } while (true);

    }
}
