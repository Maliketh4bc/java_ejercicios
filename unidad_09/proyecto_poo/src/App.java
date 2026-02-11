import mapa.Mapa;

/**
 * Clase principal del juego de Policías y Ladrones.
 * 
 * Esta clase contiene el punto de entrada del programa (main) y métodos
 * auxiliares para gestionar la interfaz de usuario en la consola.
 * 
 * El juego consiste en una simulación donde policías persiguen ladrones
 * en un mapa bidimensional con obstáculos. El juego termina cuando todos
 * los ladrones son capturados.
 * 
 * @author Marco
 * @version 1.0
 * @see Mapa
 */
public class App {

    /** Código ANSI para texto en color rojo */
    public static final String RED = "\u001B[31m";
    
    /** Código ANSI para resetear el color del texto a default */
    public static final String RESET = "\u001B[0m";
    
    /**
     * Punto de entrada principal del programa.
     * 
     * Flujo del juego:
     * 1. Crea un mapa de las medidas necesarias
     * 2. Genera ladrones, policías y cajas aleatoriamente
     * 3. Muestra pantalla de carga animada
     * 4. Ejecuta bucle principal hasta que todos los ladrones sean capturados
     * 5. Muestra mensaje de victoria
     * 
     * @param args Argumentos de línea de comandos (no utilizados)
     * @throws Exception Si ocurre algún error durante la ejecución
     */
    public static void main(String[] args) throws Exception{

        Mapa mapa = new Mapa(40, 80);

        mapa.generarLadrones();

        mapa.generarPolicias();

        mapa.generarCaja();

        pantallaCarga();

        limpiarPantalla();

        do {
            mapa.Pintar();
            mapa.moverPolicia();
            mapa.moverLadron();
            Thread.sleep(10);
            limpiarPantalla();
        } while (mapa.getVictoria() == false);

        limpiarPantalla();
        mapa.Pintar();
        Thread.sleep(500);
        System.out.printf(RED + "\nVICTORIA DEL DEPARTAMENTO DE POLICIA DE MIAMI" + RESET);

    }

    /**
     * Limpia la pantalla de la consola moviendo el cursor a la posición inicial.
     * 
     * Utiliza el código ANSI "\033[H" para mover el cursor a la esquina
     * superior izquierda de la terminal, creando el efecto de limpieza
     * sin borrar realmente el contenido.
     * 
     */
    public static void limpiarPantalla() {
        System.out.print("\033[H");
        System.out.flush();

    }

    /**
     * Muestra una pantalla de carga animada antes de iniciar el juego.
     * 
     * La animación consiste en:
     * 1. Texto "Cargando" con puntos suspensivos aleatorios (2-4 puntos)
     * 2. Cuenta regresiva de 3 a 0
     * 3. Mensaje "GO!"
     * 
     * Cada elemento de la animación tiene un delay de 500ms.
     * El número de puntos suspensivos es aleatorio para añadir variedad.
     * 
     * @throws InterruptedException Si el thread es interrumpido durante el sleep
     */
    public static void pantallaCarga() throws InterruptedException {
        System.out.printf(RED + "Cargando");

        for(int i=0; i<(int)((Math.random()*2)+2);i++){
            System.out.print(".");
            Thread.sleep(500);
        }
        System.out.println();
        for(int i=3; i>=0; i--){
            if (i>0) {
                System.out.printf("%s", i);
                System.out.println("");
            }else{
                System.out.print("GO!" + RESET);
            }
            Thread.sleep(500);
        }
        Thread.sleep(500);
    }
}