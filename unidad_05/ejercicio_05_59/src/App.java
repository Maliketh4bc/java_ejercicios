public class App {

    static int max = 0;

    //colores
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String BROWN   = "\u001B[38;5;52m";
    public static final String CLEAR_SCREEN = "\033[H\033[2J";

    public static void request(){
        System.out.print("Introduce la altura del arbol de navidad: ");
        max = Integer.parseInt(System.console().readLine());
    }

    public static void printTree(){

        for(int i=1; i <= max-1; i++){
            int numS = max - i;
            for(int j=0; j< numS; j++){
                System.out.print(" ");
            }

            int numA = i*2 -1;
            if(i == 1){
                System.out.println(YELLOW + "*" + RESET);
                for(int j=0; j< numS; j++){
                    System.out.print(" ");
                }
            }
            for(int j=0; j < numA; j++){
                int random = (int)((Math.random()*10)-7);
                String color = (random==0)?RED + "*" + RESET:(random==1)?YELLOW + "*" + RESET:(random==2)?BLUE + "*" + RESET:GREEN + "^" + RESET;
                System.out.printf("%s", (i==1)?GREEN + "^" + RESET:(j==0 || j==numA-1)?GREEN + "^" + RESET:(i==max-1)?GREEN + "^" + RESET:color);
            }

            System.out.println();
        }

        int numSbase = max-1;
        for(int j=0; j<numSbase ;j++){
            System.out.print(" ");
        }

        System.out.print(BROWN + "Y" + RESET);

    }
    public static void main(String[] args) throws Exception {
        
        request();

        System.out.print(CLEAR_SCREEN); 
        do{
            printTree();
            Thread.sleep(200);
            System.out.print(CLEAR_SCREEN);    
        }while(true);
        

    }
}
