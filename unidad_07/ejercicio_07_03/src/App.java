public class App {

    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }   
    public static void main(String[] args) throws Exception {
        
        int n[] = new int[10];
        int num = 0;

        for(int i=0; i<10; i++){
            System.out.print("Introduce un numero: ");
            num = Integer.parseInt(System.console().readLine());
            n[i] = num;     
            limpiarPantalla();
        }

        for(int i=9; i>=0; i--){
            System.out.println(n[i]);
        }

    }
}
