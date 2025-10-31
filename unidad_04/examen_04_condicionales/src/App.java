public class App {
    public static void main(String[] args) throws Exception {
        try {

            //variables
            int idTypeFood = 0;
            int ans = 0;

            String productName = "";
            double productCuant = 0.0;
            double productUnit = 0.0;

            float desc = 0f;
            float iva = 0f;

            double price = 0.0;
            double priceWdesc = 0.0;
            double priceWiva = 0.0;
            
            //Pedido inicial
            System.out.println("""
                Introduzca el tipo de producto:
                1. Alimentación
                2. Electrónica
                3. Farmacia
                4. Moda
                    """);
            System.out.print("Opción: ");
            ans = Integer.parseInt(System.console().readLine());

            //aplicar ivas y descuentos
            switch (ans) {
                case 1:
                    System.out.println("""
                        Introduzca el tipo de alimento:
                        1. Huevos
                        2. Leche
                        3. Pan
                        4. Fruta
                        5. Verdura
                        6. Otros
                    """);
                    System.out.print("Opción: ");
                    ans = Integer.parseInt(System.console().readLine());
                    idTypeFood = ans;

                    if(idTypeFood <= 5)
                        iva = 0.04f;
                    else
                        iva = 0.10f;
                    
                    break;
                case 2:
                    desc = 0.20f;
                    iva = 0.21f;
                    break;
                case 3:
                    iva = 0.04f;
                    break;
                case 4:
                    iva = 0.21f;
                    break;
                default:
                    System.out.println("Introduzca un número válido");
                    break;
            }
            
            //pedir especificaciones
            System.out.print("Introduzca el nombre del producto: ");
            productName = System.console().readLine();
            System.out.print("Introduzca la cantidad de productos: ");
            productCuant = Integer.parseInt(System.console().readLine());
            System.out.print("Introduzca el precio por unidad del producto: ");
            productUnit = Double.parseDouble(System.console().readLine());

            //aplicar 3x2
            double indvDesc = productCuant/3.0;
            if(ans == 4){
                productCuant = productCuant - indvDesc;
            }
            
            price = productCuant * productUnit;
            priceWdesc = price - (price * desc);
            priceWiva = priceWdesc + (priceWdesc*iva);
            
            //SALIDA FINAL
            System.out.println("\nFactura");
            System.out.println("----------------------------------------");
            System.out.printf("%-20s%20s%n", "Artículo", productName);
            System.out.printf("%-20s%20s%n", "Precio", "$ " + productUnit + "/Unidad");
            System.out.printf("%-20s%20d%n", "Cantidad", (int)productCuant);
            System.out.printf("%-20s%11s%2s%7.2f%n", "Total", "","$ ", price);

            if(ans == 2)
                System.out.printf("%-20s%11s%2s%7.2f%n", "Descuento (" + (int)(desc*100) + "%)", "","$ ", -1f*(price*desc));
            else if(ans == 4){
                System.out.printf("%-20s%11s%2s%7.2f%n", "Descuento (3x2)", "","$ ", -1f*(indvDesc));
            }
            
            System.out.printf("%-20s%11s%2s%7.2f%n", "Total con Descuento", "","$ ", priceWdesc);
            System.out.printf("%-20s%11s%2s%7.2f%n", "IVA al " + (int)iva*100 + "%", "","$ ", priceWdesc*iva);
            System.out.println("----------------------------------------");
            System.out.printf("%-20s%11s%2s%7.2f%n", "Total con IVA", "","$ ", priceWiva);

        } catch (NumberFormatException e){
            System.out.println("Error de formato, introduzca un número");
        }  catch (NullPointerException e){
            System.out.println("Error de formato, no puede ser null");
        }catch (Exception e) {
            System.out.println("Error inesperado");
        }
    }
}
