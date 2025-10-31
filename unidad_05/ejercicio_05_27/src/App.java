public class App {
    public static void main(String[] args) throws Exception {
        
        int num = 0;
        int cont = 0;
        int total = 0;

        System.out.print("Introduce un numero entero mayor que 1: ");
        num = Integer.parseInt(System.console().readLine());
        
        for(int i = 0; i < num; i++){

            if(i % 3 == 0){
                System.out.print(i + " ");
                cont ++;
                total += i;
            }
        }

        System.out.printf("%nDesde 1 hasta %d hay %d múltiplos de 3 que suman: %d", num, cont, total);

    }
}
