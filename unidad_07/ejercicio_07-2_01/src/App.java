public class App {
    public static void main(String[] args) throws Exception {
        
        int n[][] = new int[3][6];

        n[0][0] = 0;
        n[0][1] = 30;
        n[1][0] = 75;
        n[0][2] = 2;
        n[2][2] = -2;
        n[2][3] = 9;
        n[1][4] = 0;
        n[0][5] = 5;
        n[2][5] = 11;

        for(int i=0; i<3; i++){
            for(int j=0; j<6; j++){
                System.out.print(" " + n[i][j] + " ");
            }

            System.out.println();
        }

    }
}
