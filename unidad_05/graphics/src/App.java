public class App {

    static int big = 0;
    static int mid = 0;
    static int low = 0;

    static int bigValue = 0;
    static int midValue = 0;
    static int lowValue = 0;

    static int num1 = 0;
    static int num2 = 0;
    static int num3 = 0;

    static float div = 2.0f;

    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RED = "\u001B[31m";
    public static final String CLEAN_SCREEN = "\033[H\033[2J";

    public static void Num() {

        System.out.print("Introduce el primer valor: ");
        num1 = Integer.parseInt(System.console().readLine());

        System.out.print("Introduce el segundo valor: ");
        num2 = Integer.parseInt(System.console().readLine());

        System.out.print("Introduce el tercer valor: ");
        num3 = Integer.parseInt(System.console().readLine());
        System.out.println();

        // Ordenar de mayor a menor
        if (num1 >= num2 && num1 >= num3) {
            big = num1;
            if (num2 >= num3) {
                mid = num2;
                low = num3;
            } else {
                mid = num3;
                low = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            big = num2;
            if (num1 >= num3) {
                mid = num1;
                low = num3;
            } else {
                mid = num3;
                low = num1;
            }
        } else {
            big = num3;
            if (num1 >= num2) {
                mid = num1;
                low = num2;
            } else {
                mid = num2;
                low = num1;
            }
        }

        if(big >= 180){
            div = 3.0f;
        }else if(big >= 280){
            div = 4.0f;
        }else if(big >= 380){
            div = 5.0f;
        }

        bigValue = big;
        midValue = mid;
        lowValue = low;

        big = (int)Math.round(bigValue/div);
        mid = (int)Math.round(midValue/div);
        low = (int)Math.round(lowValue/div);
    }

    public static void vertical() {

        Num();
        
        System.out.printf("| %n");
        for(int i=big+1; i>0; i--){
            System.out.printf("| ");

            if(i <= big)
                System.out.printf(RED + "%s" + RESET, "██");
            else if(i == big+1)
                System.out.print(bigValue);
            else
                System.out.print("  ");
            
            System.out.print("  ");
            
            if(i <= mid)
                System.out.printf(YELLOW + "%s" + RESET, "██");
            else if(i == mid+1)
                System.out.print(midValue);
            else
                System.out.print("  ");
            
            System.out.print("  ");

            if(i <= low)
                System.out.printf(GREEN + "%s" + RESET, "██");
            else if(i == low+1)
                System.out.print(lowValue);
            else
                System.out.print("  ");
            
            System.out.print("  ");

            System.out.println();
        }

        for(int i=0; i < 15; i ++){
            System.out.print("-");
        }

    }

    public static void horizontal() {

        Num();
        
        for(int i=0; i<big; i++){
            if(i == 0)
                System.out.print("|");
            else
                System.out.printf(RED + "%s" + RESET, "█");
        }
        System.out.printf("%d%n|%n",bigValue);

        for(int i=0; i<mid; i++){
            if(i == 0)
                System.out.print("|");
            else
                System.out.printf(YELLOW + "%s" + RESET, "█");
        }
        System.out.printf("%d%n|%n",midValue);

        for(int i=0; i<low; i++){
            if(i == 0)
                System.out.print("|");
            else
                System.out.printf(GREEN + "%s" + RESET, "█");
        }
        System.out.printf("%d%n|%n",lowValue);

        for(int i=0; i<(big)+10; i++){
            System.out.print("-");
        }
        System.out.println();

        for(int i=0; i < big; i += 10){
            System.out.printf("%-10d", (int)(i*div));
        }

    }

    public static void main(String[] args) throws Exception {
        
        int start = 0;

        System.out.println("Buenas usuario, bienvenido a graphicSV, que tipo de gráficas desea: ");

        System.out.println("1. Verticales");
        System.out.println("2. Horizontales");
        start = Integer.parseInt(System.console().readLine());

        switch (start) {
            case 1:
                vertical();
                break;
            case 2:
                horizontal();
                break;
            default:
                System.out.print("introduzca una opción válida");
                break;
        }

    }
}
