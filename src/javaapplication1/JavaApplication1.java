package javaapplication1;

/**
 *
 * @author octrobpaa
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        int resultado =0;
        int resultado2 =0;
        
    for (int i = 1; i <= 100; ++i ){
        System.out.println(i);
        resultado = i%3;
        resultado2 = i%5;
        
        if (resultado == 0) {
            System.out.println("mare " + i);
        } 
   
        if (resultado2 == 0) {
            System.out.println("igua " + i);
        }  
        
        if (resultado2 == 0 && resultado == 0) {
            System.out.println("mareigua " + i);
        }  
        
    }
        
    }
    
}
