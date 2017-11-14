

package practica1;


public class Practica1 {
    
     static long binario(int n)
     {         
         long p=1l, nb = 0l;         
         int d = 0;         
         do         
         {             
             d = n%2;             
             n >>= 1;             
             nb += d*p;             
             p *= 10l;                 
         } while (n>0);         
         return nb;     
     } 

    
    public static void main(String[] args) {
        int nd= 745;
        long nb= binario(nd);
        System.out.println("El número decimal "+nd+"\nEs en binario = "+nb);
    }
    
}
