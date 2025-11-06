public class App {
    public static void main(String[] args) throws Exception {
        
       long num = 0L;

       System.out.print("Introduce el numero: ");
       num = Long.parseLong(System.console().readLine());

       long invert = 0;
        
       long aux = num;
       while(aux > 1){
            int digit = (int)aux%10;
            invert = invert*10 + digit;
            aux /= 10;
       }

       if(invert == num) System.out.println("Es capicuo");
       else System.out.println("NO es capicuo");

    }
}