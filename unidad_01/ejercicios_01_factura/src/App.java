public class App {
    public static void main(String[] args) throws Exception {
        //primer tercio
        System.out.printf("\nRojo Polo Paella Inc. \n\n");
        System.out.printf("Carretera Muelle 38 \n");
        System.out.printf("37531 Ávila, Ávila \n\n\n\n");
        System.out.printf("%-30s%-30s%-30s%11s\n\n", "FACTURAR A", "ENVIAR A", "Nº DE FACTURA", "ES-001");
        System.out.printf("%-30s%-30s%-30s%11s\n", "Leda Villareal", "Leda Villareal", "FECHA", "29.01.2019");
        System.out.printf("%-30s%-30s%-30s%11s\n", "Virgen BLanca 63", "Cercas Bajas 68", "Nº DE PEDIDO", "1730/2019");
        System.out.printf("%-30s%-30s%-30s%11s\n", "08759 Burgos, Burgos", "47300 Cádiz, Cádiz", "FECHA", "29.01.2019");
        System.out.printf("%-30s%-30s%-30s%11s\n\n", "", "", "VENCIMIENTO", "");
        
        //segundo tercio
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.printf("%-50s%50s\n", "Total Factura", "199,65");
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────────────\n");

        //Tercer tercio
        System.out.printf("%-8s%-34s%30s%29s\n", "CANT.", "DESCRIPCIÓN", "PRECIO UNITARIO", "IMPORTE");
        System.out.printf("%-8s%-34s%28s%29s\n", "1", "Talla pequeña traje de luces en rojo", "100.00", "100.00");
        System.out.printf("%-8s%-34s%30s%29s\n", "2", "Mui grande churrolito", "25.00", "50.00");
        System.out.printf("%-8s%-34s%30s%29s\n", "3", "Equipaje de Fútbol", "5.00", "15.00");
        System.out.printf("%-8s%-34s%30s%29s\n", "", "", "Subtotal", "165.00");
        System.out.printf("%-8s%-34s%30s%29s\n\n", "", "", "IVA 21.0%", "34.65");

    }
}
