public class App {
    public static void main(String[] args) throws Exception {
        
        long num = 0;
        int total = 0;

        System.out.print("Introduce un número: ");
        num = Long.parseLong(System.console().readLine());

        while(num > 1){
            int digit = (int)(num % 10);

            if(digit % 2 == 0){
                total += digit;
            }

            num /= 10;
        }

        System.out.printf("Suma de los numeros pares: %d", total);

    }
}
