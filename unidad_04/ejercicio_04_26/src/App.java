public class App {
    public static void main(String[] args) throws Exception {
        
        final float BASETICKET = 8f;

        String dayWeek = "";
        int numTicket = 0;
        String ans = "";
        float ticketPrice = 0f;

        System.out.println("Venta de entradas CineTuring");

        System.out.print("Numero de entradas: ");
        numTicket = Integer.parseInt(System.console().readLine());

        System.out.print("Día de la semana: ");
        dayWeek = System.console().readLine();

        System.out.print("¿Tiene tarjeta Turing? (si o no): ");
        ans = System.console().readLine();

        switch (dayWeek.toLowerCase()) {
            case "lunes":
            case "martes":
            case "viernes":
            case "sábado":
            case "domingo":
                ticketPrice = BASETICKET * numTicket;
                break;
            case "miércoles":
                ticketPrice = numTicket * 5;
                break;
            case "jueves":
                if(numTicket % 2 == 0){
                    ticketPrice = (numTicket/2)*11;
                }else if(numTicket % 2 != 0 && numTicket > 2){
                    ticketPrice = (numTicket/2)*11 + BASETICKET;
                }else
                    ticketPrice = BASETICKET * numTicket;
                
                break;
            default:
                break;
        }

        System.out.printf("%-30s%d%n", (dayWeek.toLowerCase().equals("jueves"))?"Entrada de pareja": "Entradas individuales", (dayWeek.toLowerCase().equals("jueves"))? numTicket/2 : numTicket);
        System.out.printf("%-30s%.2f%n", (dayWeek.toLowerCase().equals("jueves"))?"Precio por entrada de pareja": "Precio por entrada individual", (dayWeek.toLowerCase().equals("jueves"))?11f: ticketPrice/numTicket);
        System.out.printf("%-30s%.2f%n", "Total", ticketPrice);
        System.out.printf("%-30s%.2f%n", "Descuento", (ans.toLowerCase().equals("si"))? ticketPrice * 0.10f: 0f);
        System.out.printf("%-30s%.2f%n", "A pagar", (ans.toLowerCase().equals("si"))? ticketPrice - (ticketPrice * 0.10f): ticketPrice);
    }
}
