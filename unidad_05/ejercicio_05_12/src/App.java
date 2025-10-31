public class App {
    public static void main(String[] args) throws Exception {
        
        int max = 0;
        int n1 = 0;
        int n2 = 1;
        int actual = 1;

        System.out.print("Introduce cuantos números de la sucesión de Fibonacci quieres:  ");
        max = Integer.parseInt(System.console().readLine());

        if(max>3)
            System.out.printf("%d %d %d ",n1 , n2, actual);
        else if(max == 2)
            System.out.printf("%d %d",n1 , n2);
        else if(max == 1)
            System.out.printf("%d",n1);
        else if(max == 0)
            System.out.printf("Pues entonces vete");



        for(int i = 0; i < max-3; i++){

            int temp = actual;
            actual = actual + n2;
            n2 = temp;
            
            System.out.printf("%d ", actual);
        }

    }
}
