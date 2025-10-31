public class App {
    public static void main(String[] args) throws Exception {
        
        double num = 0d;
        int dec = 0;

        System.out.print("Introduce tu número: ");
        num = Double.parseDouble(System.console().readLine());

        do{

            dec += 1;
            num = num/10;

        }while(num>1);

        System.out.printf("Tu numero tiene %d decimales", dec);

    }
}
