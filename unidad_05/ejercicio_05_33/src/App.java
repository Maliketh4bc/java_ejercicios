public class App {
    public static void main(String[] args) throws Exception {
        
        int num = 0;

        System.out.print("Introduce la altura de tu U: ");
        num = Integer.parseInt(System.console().readLine());

        for(int i = 0; i < (num-1); i++){
            System.out.print(" ");

            for(int j=1; j<=num; j++){
                if(j == 1 || j == num)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.print(" ");
        for(int i = 1; i <= num; i++){
            if(i == 1 || i == num)
                System.out.print(" ");
            else
                System.out.print("*");
        }

    }
}
