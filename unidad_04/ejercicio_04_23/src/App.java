public class App {
    public static void main(String[] args) throws Exception {

        float baseImp = 0;
        float IVA = 0;
        float desc = 0;

        System.out.print("Introduce la base imponible: ");
        baseImp = Integer.parseInt(System.console().readLine());

        //Tipo de IVA
        System.out.print("Introduce el tipo de IVA (general, reducido o superreducido): ");
        String typeIVA = System.console().readLine();

        if(typeIVA.toLowerCase().equals("general")){
            IVA = 0.21f;
        }else if(typeIVA.toLowerCase().equals("reducido")){
            IVA = 0.10f;
        }else if(typeIVA.toLowerCase().equals("superreducido")){
            IVA = 0.04f;
        }else{
            System.out.println("Tipo de IVA incorrecto");
        }

        //Tipo de descuento
        System.out.print("Introduce el tipo de descuento (nopro, mitad, meno5 o 5porc): ");
        String typeDesc = System.console().readLine();

        if(typeDesc.toLowerCase().equals("nopro")){
            desc = 0;
        }else if(typeDesc.toLowerCase().equals("mitad")){
            desc = 0.5f;
        }else if(typeDesc.toLowerCase().equals("meno5")){
            desc = 5;
        }else if(typeDesc.toLowerCase().equals("5porc")){
            desc = 0.05f;
        }else{
            System.out.println("Tipo de descuento incorrecto");
        }

        float wIVA = baseImp + (baseImp*IVA);
        //Resultado final
        System.out.printf("Base Imponible: %.2f\n", baseImp);
        System.out.printf("IVA(%.2f%s): %.2f \n", IVA*100, "%", baseImp*IVA);
        System.out.printf("Precio con IVA: %.2f\n", wIVA);
        float finalPrice = 0;
        switch (typeDesc) {
            case "nopro":
                System.out.printf("Promo (%s): %.2f\n", typeDesc, finalPrice = wIVA);
                break;
            case "mitad":
                System.out.printf("Promo (%s): %.2f\n", typeDesc, finalPrice = wIVA * desc);
                break;
            case "meno5":
                System.out.printf("Promo (%s): %.2f\n", typeDesc, finalPrice = wIVA - desc);
                break;
            case "5porc":
                System.out.printf("Promo (%s): %.2f\n", typeDesc, finalPrice = wIVA - (wIVA * desc));
                break;
            default:  
                break;
        }
        System.out.printf("TOTAL: %.2f", finalPrice);
        

    }
}
