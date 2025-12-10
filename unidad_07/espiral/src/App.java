import java.util.Arrays;
public class App {

    static int n[][] = new int[9][9];
    static int capas = 0;
    public static void main(String[] args) throws Exception {

        n = library.setRandom(n);

        library.printArray(n);

        n = library.rotateArray(n);

    }
}
