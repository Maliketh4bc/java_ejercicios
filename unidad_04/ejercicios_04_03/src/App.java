public class App {
    public static void main(String[] args) throws Exception {

        int num;

        do{

            System.out.print("Introduce un numero del uno al siete: ");
            num = Integer.parseInt(System.console().readLine());

            switch (num) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Introduce un numero correcto");
                break;
            }
        }while(num!=8);
    }
}
