public class App {
    public static void main(String[] args) throws Exception {

        int n[] = new int[100];
        int numeroAbuscar = 0;
        int numeroAsustituir = 0;

        for (int i = 0; i < 100; i++) {
            double random = Math.random() * 20;
            n[i] = (int) random;
            System.out.print(n[i] + " ");
        }

        System.out.println();
        System.out.print("Introduce un numero que salga en la lista: ");
        numeroAbuscar = Integer.parseInt(System.console().readLine());

        System.out.print("Introduce un numero para Sustituir el elegido: ");
        numeroAsustituir = Integer.parseInt(System.console().readLine());

        for (int numero : n) {
            System.out.printf("%s ", (numero == numeroAbuscar) ? "-" + numeroAsustituir + "-" : numero + "");
        }
    }
}
