public class App {
    public static void main(String[] args) throws Exception {

        int n[] = new int[8];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 8; i++) {
            System.out.print("Introduce un numero: ");
            n[i] = Integer.parseInt(System.console().readLine());
            min = (n[i] < min) ? n[i] : min;
            max = (n[i] > max) ? n[i] : max;
        }

        for (int numero : n) {
            System.out.printf("%d %s%n", numero, (numero == max) ? "MAXIMO" : (numero == min) ? "MINIMO" : "");
        }
    }
}
