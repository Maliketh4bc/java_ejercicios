public class App {  //SIX SEVEEEEEEEEN
    public static void main(String[] args) throws Exception {
        int num1 = 0;
        int num2 = 0;

        int max = 0;
        int min = 0;

        int numSmax = 0;
        int numAmax = 0;
        int numSmin = 0;
        int numAmin = 0;

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

            numSmax = max - i;
            numAmax = i*2 -1;

            if(i <= max && max==num1){

                for(int j=0; j<numSmax; j++) System.out.printf(" ");

                for(int j=0; j<numAmax; j++) System.out.printf("*");

                for(int j=0; j<numSmax; j++) System.out.printf(" ");

                if(i == max) System.out.print(" ");
            }

            if(i > diff && min==num2){
                cont++;
                numSmin = ((max-diff) - cont) + ((i == max)?0:1);
                numAmin = cont*2 -1;

                for(int j=0; j<numSmin; j++) System.out.printf(" ");

                for(int j=0; j<numAmin; j++) System.out.printf("*");

                for(int j=0; j<numSmax; j++) System.out.printf(" ");
            }

            if(i <= diff && min==num1){
                for(int j=0; j<min*2; j++) System.out.print(" ");
            }

            if(i > diff && min==num1){
                cont++;
                numSmin = (max-diff) - cont;
                numAmin = cont*2 -1;

                for(int j=0; j<numSmin; j++) System.out.printf(" ");

                for(int j=0; j<numAmin; j++) System.out.printf("*");

                for(int j=0; j<numSmin+1; j++) System.out.printf(" ");
            }

            if(i <= max && max==num2){

                for(int j=0; j<numSmax; j++) System.out.printf(" ");

                for(int j=0; j<numAmax; j++) System.out.printf("*");

                for(int j=0; j<numSmax; j++) System.out.printf(" ");

                if(i == max) System.out.print(" ");
            }
        
            System.out.println();
        }
    }
}