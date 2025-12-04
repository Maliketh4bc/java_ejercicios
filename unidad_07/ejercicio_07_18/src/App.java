import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        int array[] = new int[10];
        int men_may[] = new int[10];
        int may_men[] = new int[10];
        int intercalado[] = new int[10];

        System.out.println("Original");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*201);
        }
        System.out.println(Arrays.toString(array));

        men_may = burbuja_m_M(array);

        System.out.println("Menor a mayor");
        System.out.println(Arrays.toString(men_may));

        may_men = burbuja_M_m(array);

        System.out.println("Mayor a menor");
        System.out.println(Arrays.toString(may_men));

        intercalado = intercalar(men_may, may_men, intercalado);

        System.out.println("Intercalado");
        System.out.println(Arrays.toString(intercalado));
    }

    public static int[] burbuja_m_M(int array[]){

        int aux = 0;
        for(int i=0; i<array.length;i++){
            for(int j=0; j<array.length -i -1;j++){
                if(array[j] > array[j+1]){
                    aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }

        return array;
    }

    public static int[] burbuja_M_m(int array[]){

        int aux = 0;
        for(int i=0; i<array.length;i++){
            for(int j=0; j<array.length -i -1;j++){
                if(array[j] < array[j+1]){
                    aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }

        return array;
    }

    public static int[] intercalar(int array1[], int array2[], int sol[]){
        
        for (int i = 0; i < array1.length; i++) {
            if(i%2 == 0){
                int num = array1[i];
                sol[i] = array1[i];
            }else{
                sol[i] = array2[i];
            }
        }

        return sol;
    }
}
