public class App {
    public static void main(String[] args) throws Exception {

        int n[] = new int[12];

        for(int i=0; i<12; i++){
            System.out.print("Introduce un numero: ");
            n[i] = Integer.parseInt(System.console().readLine());
        }

        System.out.println("Original");

        for(int i=0; i<12; i++){
            System.out.printf("| %d ", i);
        }

        System.err.println();
        System.out.println("--------------------------------------------------------------------------");
        for(int i=0; i<12; i++){
            System.out.printf("| %d ", n[i]);
        }

        System.out.println();
        System.out.println("Cambiado");

        for(int i=0; i<12; i++){
            System.out.printf("| %d ", i);
        }

        System.err.println();
        System.out.println("--------------------------------------------------------------------------");
        for(int i=0; i<12; i++){
            System.out.printf("| %d ", (i==0)?n[11]:n[i-1]);
        }

    }
}
