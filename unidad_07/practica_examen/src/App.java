import java.util.Arrays;
public class App {

    static int num=0;
    public static void main(String[] args) throws Exception {

        int array[] = new int[5];
        int salir = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*21);
        }

        System.out.println("Original");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + i + "  ");
        }
        System.out.println();
        System.out.println(Arrays.toString(array));

        do{ 
            int position = Integer.parseInt(System.console().readLine("De que posicion quieres sacar el numero?"));
            System.out.println();

            if(array.length-1 == position){
                array = sacarNum(array);
                for (int i = 0; i < array.length; i++) {
                    System.out.print(" " + i + "  ");
                }
                System.out.println();
                System.out.println(Arrays.toString(array));
                System.out.println("Y aqui tienes tu numero: " + num);
            }else if(position >= array.length){ 
                System.out.println("No hay tantos punieta");
            }else{
                System.out.println("Tienes que sacar primero el " + array[array.length-1]);
                salir = Integer.parseInt(System.console().readLine("Quieres seguir? 1.SI 2.no:( -> "));
            }
        }while(salir != 2);
    }

    public static int[] sacarNum(int n[]){
        num=n[n.length-1];

        int array2[] = new int[n.length-1];

        for (int i = 0; i < array2.length; i++) {
            array2[i] = n[i];
        }
        return array2;
    }
}
