public class App {

    public static void main(String[] args) throws Exception {
        
        int n[] = new int[8];
        int num = 0;

        for(int i=0; i<8; i++){
            System.out.print("Introduce el número: ");
            num = Integer.parseInt(System.console().readLine());
            n[i] = num;
            limpiarPantalla();
        }

        for(int i=0; i<8; i++){
            System.out.println(n[i]);

        }

    }

    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }   
}
