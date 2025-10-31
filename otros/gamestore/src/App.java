public class App {
    public static void main(String[] args) throws Exception {

        String name = "";
        int age = 0;
        double cash = 0.0;
        String memVip = "";
        int selectedGame = 0;
        double tempPrice = 0.0;
        String buyedGame = "";

        //caja titulo
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║       GAME WORLD. Tu tienda Gamer      ║");
        System.out.println("╚════════════════════════════════════════╝");

        //Meter datos
        System.out.print("\nCual es tu nombre: ");
        name = System.console().readLine();
        System.out.print("\nCual es tu edad: ");
        age = Integer.parseInt(System.console().readLine());
        System.out.print("\nDe cuanto dinero dispones: ");
        cash = Integer.parseInt(System.console().readLine());
        System.out.print("\n¿Eres miembro vip? (si o no): ");
        memVip = System.console().readLine();

        //titulo catalogo
        System.out.println("\n──────────────────────────────────────────");
        System.out.println("           Catálogo de Videojuegos");
        System.out.println("──────────────────────────────────────────\n");

        //declaracion juegos

        int idGame1 = 1;
        String nameGame1 = "Aventura Épica";
        float priceGame1 = 59.99f;

        int idGame2 = 2;
        String nameGame2 = "Carreras Extremas";
        float priceGame2 = 49.99f;

        int idGame3 = 3;
        String nameGame3 = "Puzzle Master";
        float priceGame3 = 29.99f;

        int idGame4 = 4;
        String nameGame4 = "Acción Total";
        float priceGame4 = 69.99f;

        System.out.printf("%d %s - $%.2f%n%n", idGame1, nameGame1, priceGame1);
        System.out.printf("%d %s - $%.2f%n%n", idGame2, nameGame2, priceGame2);
        System.out.printf("%d %s - $%.2f%n%n", idGame3, nameGame3, priceGame3);
        System.out.printf("%d %s - $%.2f%n%n", idGame4, nameGame4, priceGame4);

        System.out.println("Selecciona que juego quieres comprar: ");
        selectedGame = Integer.parseInt(System.console().readLine());

        switch (selectedGame) {
            case 1:
                tempPrice = tempPrice + priceGame1;
                buyedGame = nameGame1;
                break;
            case 2:
                tempPrice = tempPrice + priceGame2;
                buyedGame = nameGame2;
                break;
            case 3:
                tempPrice = tempPrice + priceGame3;
                buyedGame = nameGame3;
                break;
            case 4:
                tempPrice = tempPrice + priceGame4;
                buyedGame = nameGame4;
                break;
            default:
                System.out.println("Juego no disponible");
                return;
        }

    }
}
