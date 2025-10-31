public class App {
    public static void main(String[] args) throws Exception {

        float euro = 6.0f;
        float peseta;

        peseta = euro * 166.386f;

        System.out.printf("%.0f\n", peseta);
        System.out.printf("%.1f euros son %.0f pesetas", euro, peseta);

    }
}
