public class App {
    public static void main(String[] args) throws Exception {
        
        int num = 0;
        int turn = 0;
        int dig = 0;

        System.out.print("Introduce tu numero: ");
        num = Integer.parseInt(System.console().readLine());

        System.out.print("Introduce tu dígito: ");
        dig = Integer.parseInt(System.console().readLine());

        //darle la vuelta al número
        while(num > 1){
            turn = (turn*10) + num % 10;
            num /= 10;
        }
        //--------------------------

        System.out.println();
        System.out.print("Las posiciones de tu dígito son: ");

        int cont = 1;
        while(turn > 1){
            int rest = turn % 10;
            
            if(rest == dig){
                System.out.print(cont + " ");
            }
            
            cont ++;
            turn /= 10;
        }
    }
}
