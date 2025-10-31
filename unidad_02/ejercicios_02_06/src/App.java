public class App {
    public static void main(String[] args) throws Exception {

        float base = 22.75f;

        System.out.printf("%-12s%10s", "Base Imponible", base);
        System.out.printf("\n%-12s%12.1f", "IVA", base * 0.21f);
        System.out.printf("\n------------------------");
        System.out.printf("\n%-12s%12.2f", "IVA", (base * 0.21f) + base);

    }
}
