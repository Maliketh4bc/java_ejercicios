public class App {
    public static void main(String[] args) throws Exception {
        int grade1 = 0;
        int grade2 = 0;

        System.out.println("Introduce la primera nota: ");
        grade1 = Integer.parseInt(System.console().readLine());
        System.out.println("Introduce la segunda nota: ");
        grade2 = Integer.parseInt(System.console().readLine());

        float media = (grade1 + grade2)/2;

        if(media > 5){
            System.out.printf("La media del alumno es %.1f", media);
        }else{
            String recu = "";
            System.out.println("¿La recuperación es apta o no apta?(apto/no apto): ");
            recu = System.console().readLine();

            if(recu.toLowerCase().equals("apto")){
                System.out.println("La nota del alumno es 5.0");
            }else{
                System.out.printf("La nota del alumno es %.1f: ", media);
            }
        }
    }
}
