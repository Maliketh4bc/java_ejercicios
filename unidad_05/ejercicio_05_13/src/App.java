public class App {
    public static void main(String[] args) throws Exception {

        int num = 0;
        int minus = 0;
        int plus = 0;

        System.out.print("Dame 10 numeros y te dire cuantos son negativos y cuantos positivos: ");

        for(int i=0; i<10; i++){

            num = Integer.parseInt(System.console().readLine());

            //voy a contar el 0 como negativo aunq no sea ninguno de los dos
            if(num < 0){
                minus += 1;
            }

        }

        plus = 10 - minus;

        System.out.printf("Hay %d numeros positivos y %d negativos", plus, minus);
    }
}
