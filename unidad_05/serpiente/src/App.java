public class App {

    static int snake = 0;
    static double position = 0;
    static double lastPosition = 0;
    static double angle = 0;
    static double seno = 0;

    static final String CLEAR_SCREEN = "\033[H\033[2J";
    static char head = '@';
    static char body = '*';

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
            System.out.print(CLEAR_SCREEN);
            System.out.flush();

            printSnake();
            Thread.sleep(300);
        } while (true);

    }
}
