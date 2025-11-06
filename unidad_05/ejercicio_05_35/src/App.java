public class App {
    public static void main(String[] args) throws Exception {
        
        int num = 0;
        int numS = 0;
        int numA = 0;

        System.out.print("Introduce la altura de la X: ");
        num = Integer.parseInt(System.console().readLine());

        int num1 = (num/2)+1;
        int num2 = num - num1;

        for(int i=num1; i>0; i--){

            numS = num1 - i;
            numA = i*2 - 1;

            for(int j=0; j<numS; j++) System.out.print(" ");

            for(int j=0; j<numA; j++) System.out.printf("%s",(j==0 || j==numA-1)?"*":" ");

            System.out.println();
        }

        for(int i=1; i<=num2; i++){

            numS = num2 - i;
            numA = i*2 + 1;

            for(int j=0; j<numS; j++) System.out.print(" ");

            for(int j=0; j<numA; j++) System.out.printf("%s",(j==0 || j==numA-1)?"*":" ");

            System.out.println();
        }

    }
}
