/**
 *
 * @author @Patricio Fernandez <patricio.fernandez.florez@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        recorrer();
    }
    
    public static void recorrer()
    {
        int numeroCamiones=0;
        int[] camiones=new int[500];
        
        for (int i = 1; i < 500; i++) {
            if(comprobar(i)!=0)
            {
                camiones[numeroCamiones++]=i;
            }
                
        }
        
        System.out.println("Hay "+numeroCamiones+" camiones");
        
        for (int i = 0; i < numeroCamiones; i++) {
            System.out.println("Camion Numero "+camiones[i]);
        }
        
    }
    
    public static int comprobar(int n)
    {
        String recibido=Integer.toString(n);
        String resultado=Integer.toString((int)Math.pow(n, 2)); 
        
        int tamano=recibido.length();
        
        if(resultado.substring(resultado.length()-tamano).equals(recibido))
        {
            return n;
        }
        return 0;
    }
    
}
