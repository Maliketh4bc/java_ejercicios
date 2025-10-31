public class App {
    public static void main(String[] args) throws Exception {
        
        int num = 0;
        
        System.out.print("Introduce el numero que quieres elevar: ");
        num = Integer.parseInt(System.console().readLine());

        System.out.printf("   n1    |   n2    |   n3    |%n");
        System.out.printf("------------------------------%n");

        for(int i=1; i<4; i++){
            System.out.printf("%10s%10s%10s%n", Math.pow(num,i), Math.pow(num,i+1), Math.pow(num,i+2));
        }


    }
}
