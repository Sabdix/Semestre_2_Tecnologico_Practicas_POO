

package practica11;

import java.io.*;
import java.util.*;



public class Practica11 {

   
    public static void main(String[] args) {
       Scanner stdin = new Scanner (System.in);
       System.out.print("Nombre del archivo ");
       String s = stdin.nextLine();
       Scanner arch = null;
       
       try
       {
           File flujo = new File(s);
           arch = new Scanner(flujo);
       } catch (FileNotFoundException e)
       {
           System.out.println(s + " No puede abrirse");
           System.exit(0);
       } catch (IOException e)
       {
           System.out.println("Error en el sistema de archivos");
           System.exit(1);
       }
       
       try
       {
           int num = arch.nextInt();
           int den = arch.nextInt();
           int coc = num / den;
           System.out.println(num + "/" + den + " = " + coc);
       }  catch (InputMismatchException e)
       {             
           System.out.println(s+" contiene datos no numéricos"); 
           System.exit(0);         
       }  catch (NoSuchElementException e)
       {             
           System.out.println(s+" No contiene 2 entradas"); 
           System.exit(0);         
       }  catch (ArithmeticException e)
       {             
           System.out.println(s+" contiene como denominador cero"); 
           System.exit(0);         
       }   
    }
    
}
