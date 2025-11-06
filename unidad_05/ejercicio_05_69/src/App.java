public class App {
    public static void main(String[] args) throws Exception {
        int num = 0; int numS = 0;int numA = 6;
        System.out.print("Introduce la altura de la piramide maya: "); num = Integer.parseInt(System.console().readLine());
        for(int i=0; i < num ; i++){
            numS = num - i;
            for(int j=0; j < numS; j++) System.out.print(" ");
            if(i%2 == 0) for(int j=0; j< numA; j++) System.out.print("*");
            else for(int j=0; j< numA; j++) System.out.printf("%s", (j<(numA/2)-2 || j>=(numA/2)+2)?"*":" ");
            numA += 2;
            System.out.println();
        }
    }
}