public class App {

    static int snake = 10;
    static int numS = 0;
    static int ultPos = 0;

    static char head = '@';
    static char body = '*';
    public static final String CLEAR_SCREEN = "\033[H\033[2J";


    public static void request(){

        System.out.print("Introduce el largo de la serpiente: ");
        snake = Integer.parseInt(System.console().readLine());

        //do{
            System.out.print("Introduce la separación de la serpiente con la pared: ");
            numS = Integer.parseInt(System.console().readLine());
        //}while(numS>0 || numS<150);

    }

    public static void printSnake(){

        for(int i=0; i<snake; i++){

            int random = (int)(Math.random() * 3) - 1;

            //float seno = (int)Math.toRadians((int)(Math.random() * 360));
            float seno = (float)Math.sin(Math.toRadians(i*10));
            if(i==0){
                ultPos = numS + (int)seno;
                numS = ultPos;
            } 
            else{
                ultPos = (int)(ultPos + ((ultPos==0)?1:(ultPos==30)?-1:seno));
            } 

            for(int j=0; j<ultPos; j++){
                System.out.print(' ');
            }

            System.out.printf("%s",(i==0)?head:body);
            System.out.println();
        }

    }
    public static void main(String[] args) throws Exception {
        
        request();
        System.out.print(CLEAR_SCREEN);

        do{
            printSnake();
            Thread.sleep(200);
            System.out.print(CLEAR_SCREEN);    
        }while(true);
        
    }
}
