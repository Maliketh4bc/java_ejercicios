public class App {
    public static void main(String[] args) throws Exception {
       
        int num;
       
        do{
        System.out.println("Introduce un número con menos de 5 cifras (Introduce 0 para salir): ");
        num = Integer.parseInt(System.console().readLine());
        int primera = 0;

        if(num < 10){
            primera = num;
        }else if(num < 100){
            primera = num/10;
        }else if(num < 1000){
            primera = num/100;
        }else if(num < 10000){
            primera = num/1000;
        }else if(num < 100000){
            primera = num/10000;
        }else{
            System.out.println("con menos de 5 cifras por favor");
        }

        System.out.printf("La primera cifra es: %d\n", primera);
       }while(num != 0);

    }
}
