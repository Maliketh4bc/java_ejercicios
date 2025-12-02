public class App {
    public static void main(String[] args) throws Exception {

        String mes[] = { "enero", "febrero", "marzo", "abril", "mayo", "juno", "julio", "agosto", "septiembre",
                "octubre", "noviembre", "diciembre" };
        int temp[] = {6,10,15,20,24,30,35,36,31,21,12,7};

        for (int i = 0; i < 12; i++) {
            //System.out.printf("Introduce la temperatura media de %s:", mes[i]);
            //temp[i] = Integer.parseInt(System.console().readLine());
        }

        for (int i = 0; i < 12; i++) {
            System.err.printf("%12s |", mes[i]);
            for (int j = 0; j < temp[i]; j++) {
                System.out.print("*");
            }
            System.out.printf("  %d Cº", temp[i]);
            System.out.println();
        }
    }
}
