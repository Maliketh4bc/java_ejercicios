public class App {

    static int snake = 0;
    static int position = 0;
    static int lastPosition = 0;
    static int angle = 0;

    static final String CLEAR_SCREEN = "\033[H\033[2J";
    static char head = '@';
    static char body = '*';

    public static void printSnake(){

        position = 15;

        for(int i=0;i<snake; i++){

            for(int j=0; j<position; j++){
                System.out.print(" ");
            }

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
