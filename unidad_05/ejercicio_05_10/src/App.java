public class App {
    public static void main(String[] args) throws Exception {

        float num = 0f;
        float acc = 0f;
        float div = 0f;
        float media = 0f;

        System.out.println("Introduce números para la media(Añade un numero negativo para terminar): ");

        do{
            num = Float.parseFloat(System.console().readLine());
            System.out.println();
            if(num>0){
                acc = acc + num;
                div += 1;
            }
        }while(acc*num > 0);

        media = acc/div;

        System.out.printf("La media de tus numeros es: %.2f", media);

    }
}
