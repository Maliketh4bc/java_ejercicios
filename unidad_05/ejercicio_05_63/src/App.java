public class App {  //SIX SEVEEEEEEEEN
    public static void main(String[] args) throws Exception {
        int num1 = 0;
        int num2 = 0;

        int max = 0;
        int min = 0;
        
        int numS1 = 0;
        int numA1 = 0;
        int numS2 = 0;
        int numA2 = 0;

        System.out.print("Introduce el número de la primera pirámide: "); num1 = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce la altura de la segunda pirámide: "); num2 = Integer.parseInt(System.console().readLine());

        if(num1 > num2){
            max = num1;
            min = num2;
        }else{
            max = num2;
            min = num1;
        } 

        int diff = max - min;
        int cont = 0;
        for(int i=1; i<=max; i++){
            
            if(i <= num1){

                numS1 = max - i;
                numA1 = i*2 -1;

                for(int j=0; j<numS1; j++) System.out.printf(" ");

                for(int j=0; j<numA1; j++) System.out.printf("*");

                for(int j=0; j<numS1; j++) System.out.printf(" ");

                if(i == max) System.out.print(" ");
            }

            if(i > diff){
                cont++;
                numS2 = ((max-diff) - cont) + ((i == max)?0:1);
                numA2 = cont*2 -1;

                for(int j=0; j<numS2; j++) System.out.printf(" ");

                for(int j=0; j<numA2; j++) System.out.printf("*");
            }
        
            System.out.println();
        }
    }
}