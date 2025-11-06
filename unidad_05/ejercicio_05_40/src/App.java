public class App {
    public static void main(String[] args) throws Exception {
        
        int num = 0;
        int numS = 0;
        int numA = 1;

        do{
            System.out.print("Introduce la altura de la X: ");
            num = Integer.parseInt(System.console().readLine());
        }while(num < 0 || num < 3 || num%2 == 0);
        System.out.println();

        int num1 = (int)Math.round(num/2)+1;
        int num2 = num - num1;

        for(int i=0; i < num1 ; i++){

            numS = num1 - i;

            for(int j=0; j < numS; j++) System.out.print(" ");

            for(int j=0; j< numA; j++) System.out.printf("%s", (j==0 || j==numA-1)?"*":" ");
            numA += 2;

            System.out.println();
        }

        for(int i= num2; i >= 0; i--){

            numS = (num2+1) - i;
            numA = i*2-1;

            for(int j=0; j <= numS; j++) System.out.print(" ");

            for(int j=0; j< numA; j++) System.out.printf("%s", (j==0 || j==numA-1)?"*":" ");
            

            System.out.println();
        }
        

    }
}
