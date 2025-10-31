public class App {
    public static void main(String[] args) throws Exception {

        int base = 0;
        int exp = 0;

        System.out.print("Introduce una base: ");
        base = Integer.parseInt(System.console().readLine());

        System.out.print("Introduce una base: ");
        exp = Integer.parseInt(System.console().readLine());

        for(int i=0; i<exp; i++){

            int sol = (int)Math.pow(base, i);

            System.out.printf("%d ", sol);

        }

    }
}
