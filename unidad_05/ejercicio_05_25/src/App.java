public class App {
    public static void main(String[] args) throws Exception {
        
        int num = 0;
        int digits = 0;
        int rest = 0;

        System.out.print("Introduce tu numero: ");
        num = Integer.parseInt(System.console().readLine());
        int aux = num;

        //saber cuantas cifras tiene el num
        do{
            aux /= 10;
            digits ++;
        }while(aux > 1);
        //---------------------------------

        for(int i = 0; i < digits; i++){
            rest = num % 10;
            System.out.print(rest);
            num /= 10;
        }


    }
}
