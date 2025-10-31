public class App {
    public static void main(String[] args) throws Exception {
        
        int max = 0;
        int numA = -1;

        System.out.print("Introduce el número de filas que quieres que tenga la piramide: ");
        max = Integer.parseInt(System.console().readLine());

        for(int i=0; i < max; i++){

            int numS = max - i;
            for(int j=0; j < numS; j++){
                System.out.print(" ");
            }

            numA += 2;
            int half = (int)Math.ceil(numA/2.0);
            int temp = half;

            for(int j=1; j <= numA; j++){

                if(numA < 2){
                    System.out.print(j);
                }else{
                    if(j < half+1){
                        System.out.print(j);
                    }else{
                        
                        for(int k = half; k < half+1; k++){
                            temp -= 1; 
                        }
                        System.out.print(temp);
                        
                    }
                }
            }

            System.out.println();

        }

    }
}
