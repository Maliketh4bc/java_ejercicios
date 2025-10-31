public class App {
    public static void main(String[] args) throws Exception {
        
        String food = "";
        String typePit = "";
        String drink = "";
        float price = 0;
        float foodPrice = 0;
        float drinkPrice = 0;

        System.out.print("Introduce la comida de tu desayuno(palmera, donut o pitufo): ");
        food = System.console().readLine();
        
        switch (food) {
            case "palmera":
                foodPrice = 1.40f;
                price = price + foodPrice;
                break;
            case "donut":
                foodPrice = 1.0f;
                price = price + foodPrice;
                break;
            case "pitufo":
                System.out.print("\nQue clase de pitufo es(aceite o tortilla): ");
                typePit = System.console().readLine();
                if(typePit.toLowerCase().equals("aceite")){
                    foodPrice = 1.20f;
                    price = price + foodPrice;
                }else{
                    foodPrice = 1.60f;
                    price = price + foodPrice;
                }
                break;
            default:
                break;
        }

        System.out.print("\nQue tipo de bebida es(zumo o café):");
        drink = System.console().readLine();

        if(drink.toLowerCase().equals("zumo")){
            drinkPrice = 1.60f;
            price = price + drinkPrice;
        }else{
            drinkPrice = 1.20f;
            price = price + drinkPrice;
        }

        //Salida total
        System.out.printf("%s con %s: %.2f\n", food, typePit, foodPrice);
        System.out.printf("%s: %.2f\n", drink, drinkPrice);
        System.out.printf("%s: %.2f\n", "Total desayuno", price);

    }
}
