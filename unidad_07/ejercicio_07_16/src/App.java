public class App {
    public static void main(String[] args) throws Exception {

        int array[] = new int[20];

        for(int i=0; i<array.length;i++){
            array[i] = (int)(Math.random()*401);
            System.out.print(array[i] + " ");
        }

        int numADestacar = Integer.parseInt(System.console().readLine("Introduce los multiplos que quieres destacar(5/7): "));

        for (int i=0; i<array.length;i++) {
            System.out.printf("%s %s%s%s - ",(i==0)?"-":"",(array[i]%numADestacar==0)?"[":"",array[i],(array[i]%numADestacar==0)?"]":"");
        }

    }
}
