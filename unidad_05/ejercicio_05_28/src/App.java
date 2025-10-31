public class App {
    public static void main(String[] args) throws Exception {
        
        int num = 0;

        do{
            System.out.print("Introduce un número entero: ");
            num = Integer.parseInt(System.console().readLine());
        }while(num < 0);
        
        int cont = num;
        while(cont > 1){

            cont--;

            num *= cont;

        }

        System.out.print(num);
        
    }
}
