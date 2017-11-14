

package practica.pkg9;


public class Practica9 {

   
    public static void main(String[] args) {
       Figura [] af = 
       {
           new Circulo(5.4f),
           new Cuadrado(7),
           new Triangulo(6, 8),
           new Cilindro(5, 8),
           new Rectangulo(5, 10)
       };
       
       for (short i = 0; i < af.length; i++)
       {
           af[i].mostrar();
           System.out.println(" Tiene una area de "+ af[i].Area() + "\n");
       }
    }
    
}
