public class App {
    public static void main(String[] args) throws Exception {
        
        int num = 0;
        int password = 6967;
        int tries = 0;

        do{
            tries += 1;

            System.out.print("Introduce la contraseña: ");
            num = Integer.parseInt(System.console().readLine());

            if(num != password)
                System.out.println("Incorrecto");

        }while(num != password && num < 9999 && tries < 4);

        if(num == password)
            System.out.println("Caja abierta");
        else if(tries == 4)
            System.out.println("Máximo de intentos alcanzados");
        else if(num > 9999)
            System.out.println("Introduzca un número de 4 dígitos");

    }
}
