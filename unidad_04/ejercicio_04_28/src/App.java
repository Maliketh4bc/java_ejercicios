public class App {
    public static void main(String[] args) throws Exception {

        String player1 = "";
        String player2 = "";

        System.out.println("Introduce la jugada del primer jugador(piedra, papel o tijera): ");
        player1 = System.console().readLine();

        System.out.println("Introduce la jugada del segundo jugador(piedra, papel o tijera): ");
        player2 = System.console().readLine();

        //Resultados partidas
        switch (player1.toLowerCase()) {
            case "piedra":

                if(player2.toLowerCase().equals("tijera"))//victoria
                    System.out.println("Gana jugador 1");
                else if(player2.toLowerCase().equals("papel"))//derrota
                    System.out.println("Gana jugador 2");
                else if(player2.toLowerCase().equals("piedra"))//empate
                    System.out.println("Empate");
                break;

            case "papel":
                
                if(player2.toLowerCase().equals("piedra"))//victoria
                    System.out.println("Gana jugador 1");
                else if(player2.toLowerCase().equals("tijera"))//derrota
                    System.out.println("Gana jugador 2");
                else if(player2.toLowerCase().equals("papel"))//empate
                    System.out.println("Empate");
                break;
                
            case "tijera":
                
                if(player2.toLowerCase().equals("papel"))//victoria
                    System.out.println("Gana jugador 1");
                else if(player2.toLowerCase().equals("piedra"))//derrota
                    System.out.println("Gana jugador 2");
                else if(player2.toLowerCase().equals("tijera"))//empate
                    System.out.println("Empate");
                break;
                   
            default:
                System.out.println("Ha ocurrido un error");
                break;
        }
    }
}
