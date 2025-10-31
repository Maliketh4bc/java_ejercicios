public class App {
    public static void main(String[] args) throws Exception {
        
        int basef = 0;
        int base = 0;
        int exp = 0;

        System.out.print("Dame una base: ");
        base = Integer.parseInt(System.console().readLine());
        
        System.out.print("Dame una exponente: ");
        exp = Integer.parseInt(System.console().readLine());

        basef = base;

        for(int i = 1; i < exp; i++){

            base *= basef;

        }

        System.out.print(base);
    }
}
