public class App {
    public static void main(String[] args) throws Exception {

        int num = 0;

        System.out.print("Introduce la altura de la L: ");
        num = Integer.parseInt(System.console().readLine());

        for(int i = 0; i < num-1; i++){
            
            System.out.print("*");

            System.out.println();
        }

        int half = (int)Math.ceil(num/2);

        for(int j = 0; j < half+1; j++){
            System.out.print("* ");
        }


    }
}
