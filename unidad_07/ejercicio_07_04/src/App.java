public class App {
    public static void main(String[] args) throws Exception {
        
        int base[] = new int[12];
        int cuadrado[] = new int[12];
        int cubo[] = new int[12];

        System.out.println("  n  |  n2  |  n3  ");
        System.out.println("-------------------");

        for(int i=0; i<12; i++){

            int random = (int)(Math.random()*100);

            base[i] = random;
            cuadrado[i] = (int)Math.pow(random, 2);
            cubo[i] = (int)Math.pow(random, 3);
            
            System.out.printf("  %d  |  %d  |  %d  %n", base[i], cuadrado[i], cubo[i]);
        }

    }
}
