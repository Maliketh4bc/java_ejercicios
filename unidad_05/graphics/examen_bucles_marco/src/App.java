public class App {

    // variables
    static double min = 0;
    static double max = 0;
    static double rand = 0;
    static double invert = 0;

    static int digit = 0;
    static int maxDigit = 0;
    static int length = 0;

    static String paint = "";

    // declaración colores
    public static final String RESET = "\033[0m";
    public static final String RED_BACKGROUND = "\033[41m"; 
    public static final String GREEN_BACKGROUND = "\033[42m";
    public static final String BLUE_BACKGROUND = "\033[44m";
    public static final String PURPLE_BACKGROUND = "\033[45m";

    // declaración símbolos
    public static final String LINE = "\u2550"; 
    public static final String VERTICAL = "\u2551"; 
    public static final String CORNER_SUP_LFT = "\u2554";
    public static final String CORNER_SUP_RGT = "\u2557";
    public static final String CORNER_INF_LFT = "\u255A";
    public static final String CORNER_INF_RGT = "\u255D";
    public static final String INTER_LEFT = "\u2560";
    public static final String INTER_RGT = "\u2563";
    public static final String INTER_UP = "\u2566";
    public static final String INTER_DOWN = "\u2569";
    public static final String INTER_CENTER = "\u256C";


    public static void request(){

        try {
            System.out.println("GRAPHIFY");
            System.out.println("===================");

            do{
                System.out.print("Introduce el valor mínimo del rango: ");
                min = Double.parseDouble(System.console().readLine());

                if(min < 0) System.out.println("ERROR: Los valores del rango deben ser mayor o igual a cero");
            }while(min < 0);
            
            do{
                System.out.printf("Introduce el valor máximo del rango: ");
                max = Double.parseDouble(System.console().readLine());

                if(max < 0) System.out.println("ERROR: Los valores del rango deben ser mayor o igual a cero");
            }while(max < 0);

            if(min > 0 && max > 0){
                System.out.printf("Dibujo la gráfica en blanco y negro o en color (B|C): ");
                paint = System.console().readLine();

                rand = Math.abs(Math.random()*(max - min + 1) + min);
            }
            
            System.out.println();
            
        } catch (NumberFormatException e) {
            System.out.println("ERROR: Debes introducir un número válido");
        } catch (Exception e) {
            System.out.println("Error inesperado");
        }
    }
    // TABLA EN NEGRO ---------------------------------------------------------------------
    public static void black(){
    
        // Invertir el número
        long aux = (long)rand;
        while(aux > 0){
            digit = (int)aux%10;
            invert = (invert*10) + digit;
            aux /= 10;
            length++;
        }


        // Ver digito más grande
        aux = (long)invert;
        for(int i=0; i<length; i++){
            digit = (int)aux%10;

            if(i == 0)maxDigit = digit;

            if(digit >= maxDigit) maxDigit = digit;

            aux /= 10;
        } 

        // tabla
        digit = 0;
        for(int i=0; i<(length*2)+1; i++){  

            if(i%2 != 0){

                digit = (int)invert%10;
                invert /= 10;
                
                for(int j=0; j < maxDigit+1; j++){
                    System.out.printf("| %s |",(j==0)?digit:(j<=digit && j != 0)?"*":" ");
                }

            }else{
                
                for(int j=0; j < maxDigit+1; j++){
                    System.out.printf(" --- ");
                }
            }

            System.out.println();
        }
    }

    // TABLA EN COLOR ---------------------------------------------------------------------------
    public static void color(){

        // Invertir el número
        long aux = (long)rand;
        while(aux > 0){
            digit = (int)aux%10;
            invert = (invert*10) + digit;
            aux /= 10;
            length++;
        }


        // Ver digito más grande
        aux = (long)invert;
        for(int i=0; i<length; i++){
            digit = (int)aux%10;

            if(i == 0)maxDigit = digit;

            if(digit >= maxDigit) maxDigit = digit;

            aux /= 10;
        } 

        // tabla
        digit = 0;
        String color = "";
        for(int i=0; i<(length*2)+1; i++){  

            if(i%2 != 0){

                digit = (int)invert%10;
                // get color
                if(digit >= 0 && digit <= 4){
                    color = BLUE_BACKGROUND + " " + RESET;
                }else if(digit >= 5 && digit <= 6){
                    color = RED_BACKGROUND + " " + RESET;
                }else if(digit >= 7 && digit <= 8){
                    color = GREEN_BACKGROUND + " " + RESET;
                }else if(digit == 9){
                    color = PURPLE_BACKGROUND + " " + RESET;
                }
                invert /= 10;
                
                // fila de numeros
                System.out.print(VERTICAL);
                for(int j=0; j < maxDigit+1; j++){
                    System.out.printf(" %s%2s",(j==0)?digit:(j<=digit && j != 0)?color:" ",VERTICAL);
                }

            }else{
                
                // fila superior
                if(i == 0){    
                    for(int j=0; j < maxDigit+2; j++){
                        if(j==0){
                            System.out.printf("%s",CORNER_SUP_LFT);
                        }else if(j==maxDigit+1){
                            for(int k=0; k<3; k++){
                                System.out.printf("%s", LINE);
                            }
                            System.out.printf("%s",CORNER_SUP_RGT);
                        }else{
                            for(int k=0; k<3; k++){
                                System.out.printf("%s", LINE);
                            }
                            System.out.print(INTER_UP);    
                        }
                    }
                    
                // fila inferior    
                }else if(i == (length*2)){
                    for(int j=0; j < maxDigit+2; j++){
                        if(j==0){
                            System.out.printf("%s",CORNER_INF_LFT);
                        }else if(j==maxDigit+1){
                            for(int k=0; k<3; k++){
                                System.out.printf("%s", LINE);
                            }
                            System.out.printf("%s",CORNER_INF_RGT);
                        }else{
                            for(int k=0; k<3; k++){
                                System.out.printf("%s", LINE);
                            }
                            System.out.print(INTER_DOWN);    
                        }
                    }
                    
                // filas intermedias
                }else{
                    for(int j=0; j < maxDigit+2; j++){
                        if(j==0){
                            System.out.printf("%s",INTER_LEFT);
                        }else if(j == maxDigit+1){
                            for(int k=0; k<3; k++){
                                System.out.printf("%s", LINE);
                            }
                            System.out.printf("%s",INTER_RGT);
                        }else{
                            for(int k=0; k<3; k++){
                                System.out.printf("%s", LINE);
                            }
                            System.out.print(INTER_CENTER);    
                        }
                    }
                    
                }
            }

            System.out.println();
        }

    }
    public static void main(String[] args) throws Exception {
        
        request();

        switch (paint.toLowerCase()) {
            case "b":
                black();
                break;
            case "c":
                color();
                break;
            default:
                System.out.println("Introduce una opción válida");
                break;
        }
        
        


    }
}
