public class App {
    public static void main(String[] args) {
        boolean correcto = false;
        int numero = 0;
        do{
            try {
                System.out.print("Introduzca un número entero: ");    
                numero = Integer.parseInt(System.console().readLine());
                correcto = true;
            } catch (NumberFormatException e) {
                System.out.println("Debes introducir un número entero");
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado");
            }            
        }while(!correcto);
        int digitosn = 0;        
        int aux = numero+4;
        do{            
            aux = aux / 10;            
            digitosn++;
        }while(aux != 0);
        

        int digitosn2 = 0;        
        aux = (int)Math.pow(numero+4,2);
        do{            
            aux = aux / 10;            
            digitosn2++;
        }while(aux != 0);
        

        int digitosn3 = 0;        
        aux = (int)Math.pow(numero+4,3);
        do{            
            aux = aux / 10;            
            digitosn3++;
        }while(aux != 0);
             
        //primera linea   
        String format = "%"+ (int)Math.ceil((digitosn+2)/2.0)+"s"+
        "n"+
        "%"+ (int)Math.floor(((digitosn+1)/2.0)+1)+"s"+
        "|"+ 
        "%"+ (int)Math.ceil((digitosn2+1)/2.0)+"s"+
        "n2"+
        "%"+ (int)Math.floor(((digitosn2+1)/2.0)+1)+ "s" +
        "|"+ 
        "%"+ (int)Math.ceil((digitosn3+1)/2.0)+"s"+
        "n3"+
        "%"+ (int)Math.floor((digitosn3+1)/2.0)+ "s%n";

        System.out.printf(format
            ,"", "", "", "", "", "");                  
        for(int i = 0; i<5;i++){
            format = "%"+ (int)Math.ceil((digitosn+1)/2.0)+"s"+
            "%d"+
            "%"+ (int)Math.floor((digitosn+1)/2.0)+"s"+
            "|"+ 
            "%"+ (int)Math.ceil((digitosn2+1)/2.0)+"s"+
            "%d"+
            "%"+ (int)Math.floor((digitosn2+1)/2.0)+ "s" +
            "|"+ 
            "%"+ (int)Math.ceil((digitosn3+1)/2.0)+"s"+
            "%d"+
            "%"+ (int)Math.floor((digitosn3+1)/2.0)+ "s%n";

            System.out.printf(format
                ,"", (int)Math.pow(numero+i,1), "", 
                "", (int)Math.pow(numero+i,2) , "", 
                "", (int)Math.pow(numero+i,3), "");     
        }
    }
    
}
