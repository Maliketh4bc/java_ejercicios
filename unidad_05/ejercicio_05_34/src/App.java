public class App {

    public static long pedirNum(String mensaje){
        
        System.out.print(mensaje);
        long num = Long.parseLong(System.console().readLine());
        return num;

    }
    public static void main(String[] args) throws Exception {
        
        long num1 = pedirNum("Introduce el primer numero: ");
        long num2 = pedirNum("Introduce el segundo nombre: ");

        long turn1 = 0;
        long turn2 = 0;

        long par = 0;
        long impar = 0;

        while(num1 > 1){
            turn1 = (turn1*10) + num1%10;
            num1 /= 10;
        }

        while(num2 > 1){
            turn2 = (turn2*10) + num2%10;
            num2 /= 10;
        }
        
        int digit1 = 0;
        int digit2 = 0;
        int cont = 0;

        while(turn1 > 1 && turn2 > 1){
            
            if(cont%2 == 0){
                digit1 = (int)(turn1%10);

                if(digit1%2 == 0){
                    par = (par*10) + digit1;
                }else{
                    impar = (impar*10) + digit1;
                }
                
                turn1 /= 10;

            }else{

                digit2 = (int)(turn2%10);

                if(digit2%2 == 0){
                    par = (par*10) + digit2;
                }else{
                    impar = (impar*10) + digit2;
                }
                
                turn2 /= 10;
            }

            cont++;
        }

        System.out.printf("Pares: %d%n", par);
        System.out.printf("Impares: %d", impar);
        
    }
}
