public class App {
    public static void main(String[] args) throws Exception {
        
        int num = 0;
        int div = 0;

        System.out.print("Introduce un número entero(relativamente grande): ");
        num = Integer.parseInt(System.console().readLine());

        System.out.print("Introduce otro número entero(relativamente pequeño): ");
        div = Integer.parseInt(System.console().readLine());


        System.out.printf("%nLos números enteros positivos menores que %d que no son divisibles entre %d son los siguientes: %n",num,div);
        for(int i = 0; i < num; i++){
            if(i%div != 0){
                System.out.print(i + " ");
            }
        }

    }
}
