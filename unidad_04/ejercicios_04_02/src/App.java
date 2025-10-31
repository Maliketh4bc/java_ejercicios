public class App {
    public static void main(String[] args) throws Exception {
        
        int hour;

        System.out.print("Introduce que hora es: ");
        hour = Integer.parseInt(System.console().readLine());

        if(hour>6 && hour<12){
            System.out.println("bon dia");

        }else if(hour>13 && hour<20){
            System.out.println("buenas tardes");

        }else if(hour>21 && hour<5){
            System.out.println("buenas noches bb");

        }
    }
}
