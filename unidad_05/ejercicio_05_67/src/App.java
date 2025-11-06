public class App {  //SIX SEVEEEEEEEEN
    public static void main(String[] args) throws Exception {
        int esc = 0;
        int alt = 0;
        int numA = 4;

        System.out.print("Introduce el número de escalones: "); esc = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce la altura de los escalones: "); alt = Integer.parseInt(System.console().readLine());

        for(int j=0; j< esc; j++){
            for(int k=0; k<alt; k++){
                for(int l=0; l<numA; l++){
                    System.out.print("*");
                }
                System.out.println();
            }
            numA += 4;
        } 
    }
}