public class App {
    public static void main(String[] args) throws Exception {
        
        int num = 0;
        int invNum = 0;
        int digit = 0;
        boolean capicuo = false;
        boolean primo = false;

        System.out.print("Introduce tu número");
        num = Integer.parseInt(System.console().readLine());
        int numValue = num;

        //invertir numero
        while(num > 0){
            digit = num%10;
            invNum = (invNum*10) + digit;
            num /= 10;
        }

        if(invNum == numValue)capicuo = true;

        int aux = 0;
        int cont = 0;
        for(int i=1; i<=numValue; i++){
            aux = numValue%i;
            if(aux == 0){
                cont++;
            }
        }

        if(cont == 2)primo = true;

        //salida
        if(capicuo == true && primo == true){
            System.out.println("NUMERO PERFECTO, capicuo y primo");
        }else if(capicuo == true && primo == false){
            System.out.println("Es capicuo pero no primo");
        }else{
            int diff = Math.abs(numValue - invNum);
            digit = 0;
            cont = 0;
            aux = 0;
            for(int i=0; i<diff; i++){
                digit = diff % 10;
                if(digit%2 == 0){
                    cont++;
                }
                aux++;
                diff /= 10;
            }

            //cont == par
            int impar = Math.abs(aux - cont);
            
            if(impar>cont){
                System.out.printf("DIFERENCIA IMPAR-DOMINANTE: %d", impar);
            }else
                System.out.printf("DIFERENCIA PAR-DOMINANTE: %d", cont);


        }
    
    }
}
