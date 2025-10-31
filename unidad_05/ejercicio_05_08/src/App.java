public class App {
    public static void main(String[] args) throws Exception {

        int num = 0;

        System.out.print("Introduce de que numero quiere la tabla: ");
        num = Integer.parseInt(System.console().readLine());

        for(int i=0; i<=10; i++){
            System.out.printf("%d * %d = %d%n", num, i, num*i);
        }

    }
}
