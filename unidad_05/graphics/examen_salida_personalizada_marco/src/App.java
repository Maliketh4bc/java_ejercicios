public class App {
    public static void main(String[] args) throws Exception {
        
        //DEFINICIÓN CÓDIGOS---------------------------------------
        String NEGRITA = "\033[1m";
        String SUB = "\033[4m";
        String RESET = "\033[0m";
        String ROJO = "\033[31m";
        String ROJO_F = "\033[41m";
        String AMARILLO_F = "\033[43m";
        String VERDE_F = "\033[42m";
        String CIAN_F = "\033[46m";
        String GRIS_F = "\033[100m";


        //EJERCICIO 1 ----------------------------------------------
        System.out.printf("\n\n----Ejercicio 1---- \n");
        System.out.printf(NEGRITA + "\nVUELTAS A LA TIERRA" + RESET);
        System.out.printf("\n===================");
        System.out.printf("\nIntroduzca un número de años: %d" ,45);
        System.out.printf("\nLa tierra habrá dado un total de %d vueltas en %d años.\n\n",16425 ,45);
        //FIN EJERCICIO 1 ------------------------------------------

        //EJERCICIO 2 ----------------------------------------------
        System.out.printf("\n\n----Ejercicio 2---- \n");
        System.out.printf(NEGRITA + "\nVOLUMEN DE UN TOROIDE" + RESET);
        System.out.printf("\n=====================");
        System.out.printf("\nIntroduzca el radio mayor (cms): %d", 5);
        System.out.printf("\nIntroduzca el radio menor (cms): %.1f", 2.5);
        System.out.printf("\nEl volumen del toroide es de " + ROJO + "%.4f" + RESET + " cm3.", 616.8531);
        //FIN EJERCICIO 2 ------------------------------------------

        //EJERCICIO 3 ----------------------------------------------
        System.out.printf("\n\n----Ejercicio 3---- \n");
        System.out.printf(NEGRITA + "\nCALCULADORA DE TIEMPO" + RESET);
        System.out.printf("\n=====================");
        System.out.printf("\nIntroduce una cantidad de segundos: %d", 3650);
        System.out.printf("\n%d segundos son " + NEGRITA + AMARILLO_F + "%d horas" + RESET + ", " + NEGRITA + ROJO_F + "%d minutos" + RESET + " y " + NEGRITA + VERDE_F + "%d segundos" + RESET + ".", 3650, 1, 0, 50);
        //FIN EJERCICIO 3 ------------------------------------------

        //EJERCICIO 4 ----------------------------------------------
        System.out.printf("\n\n----Ejercicio 4---- \n");
        System.out.printf(NEGRITA + "\nCALCULADORES DE MEDIDAS IMPERIALES" + RESET);
        System.out.printf("\n===========================");
        System.out.printf("\nIntroduzca una cantidad en litros: %d", 25);
        System.out.printf(SUB + "\n%d litros" + RESET + " son:", 25);
        System.out.printf("\n" + NEGRITA + AMARILLO_F + "%.2f" + RESET + " galones (gal)", 6.6);
        System.out.printf("\n" + NEGRITA + VERDE_F + "%.2f" + RESET + " cuartos de galon (qt)", 26.42);
        System.out.printf("\n" + NEGRITA + ROJO_F + "%.2f" + RESET + " pinzas (pt)", 52.83);
        System.out.printf("\n" + NEGRITA + CIAN_F + "%.2f" + RESET + " onzas líquidas (fl oz)", 845.35);
        //FIN EJERCICIO 4 ------------------------------------------

        //EJERCICIO 5 ----------------------------------------------
        System.out.printf("\n\n----Ejercicio 5---- \n");
        System.out.printf(NEGRITA + "\nTANGO MODAS" + RESET);
        System.out.printf("\n==============================");
        System.out.printf("\nIntroduce código de artículo: %d" ,235643);
        System.out.printf("\nIntroduce precio: %.2f", 15.5);
        System.out.printf("\nIntroduce unidades vendidas: %d", 3);
        System.out.printf("\nIntroduce descuento (%s): %d\n\n", "%", 10);
        System.out.printf("Su ticket:\n\n");
        System.out.printf(NEGRITA + "TANGO MODAS" + RESET);
        System.out.printf("\n==============================");
        System.out.printf("\n%-15s%15s", "235643", "15.50$");
        System.out.printf("\n%-15s%15s", "3 uds.", "46.50$");
        System.out.printf("\n%-15s%15s", "-10%", "-4.65$");
        System.out.printf("\n%-15s%15s", "16% IVA", "+7.44$");
        System.out.printf("\n" + GRIS_F + "%-15s%19s", "TOTAL", "49.29$" + RESET);

        //FIN EJERCICIO 5 ------------------------------------------

    }
}
