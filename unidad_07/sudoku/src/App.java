public class App {
    public static void main(String[] args) throws Exception {

        int sudoku[][] = new int[9][9];

        int lin = sudoku[1][0];
        int col = sudoku[0][1];

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                int num = ((int)(Math.random()*2) == 0)?1:-1;
                sudoku[i][j] = (j+1) * num;
                System.out.printf("%s",(sudoku[i][j] >= 0)?(sudoku[i][j] + " "):"  ");
            }
            System.out.println();
        }
    }
}
