public class App {
    public static void main(String[] args) throws Exception {
        
        long num = 0L;
        long invert = 0L;

        System.out.print("Introduce el numero: ");
        num = Long.parseLong(System.console().readLine());

        long aux = num;
        while(aux > 1){
            int digit = (int)aux%10;
            invert = invert*10 + digit;
            aux /= 10;
        }

        while(invert>0){

            int digit = (int)invert%10;
            int cont = 0;

            if(digit>0){ 
                for(int i=0; i<digit; i++) System.out.print(" | "); 
                cont ++;
                if(cont != digit)System.out.print("-");
            }else{  
                System.out.print(" -");
            }
            invert /= 10;
        }

    }
}
