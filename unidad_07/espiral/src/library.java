import java.util.Arrays;

public interface library {

    public static void printArray(int n[][]){
        for (int j = 0; j < n.length; j++) {
            for (int i = 0; i < n.length; i++) {
                System.out.printf(" %-3s ",n[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] setRandom(int n[][]){
        int min = 200;
        int max = 300;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                n[i][j] = (int)((Math.random()*(max-min+1)+ min));
            }
        }
        return n;
    }

    public static int[][] rotateArray(int n[][]){

        int capas = sacarCapas(n);
        int extendido[] = new int[n.length*2 + n[0].length*2];
        
        for(int i=0; i<capas; i++){

            for(int j=1; j<=4; j++){

                int max = (j%2 != 0)?(n[0].length-1):n.length-1;

                for(int k=0; k<max; k++){
                    extendido[k*j] = n[j][k]; 
                }

            }
            
        }

        return n;
    }

    public static int sacarCapas(int n[][]){

        int num = 0;

        num = (int)Math.ceil(n.length/2);

        return num;
    }



    public static int[][] makeIdentidad(int n[][]){

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if(j==i){
                    n[i][j] = 1;
                }else{
                    n[i][j] = 0;
                }
            }
        }

        return n;
    }

}
