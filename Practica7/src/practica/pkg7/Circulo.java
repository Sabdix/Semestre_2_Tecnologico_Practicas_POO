

package practica.pkg7;


public class Circulo {
    static int instancias = 0;
    
    private Punto centro;
    private double radio;
    
    public Circulo()
    {
        instancias++;
        centro = new Punto();
        radio = 1.0d;
    }
    
    public Circulo(double cx, double cy)
    {
        instancias++;
        centro = new Punto(cx, cy);
        radio = 7.0d;
    }
    
    public Circulo(double cx, double cy, double radio)
    {
        this(cx, cy);
        this.radio = radio;
        //Verificar();
    }
    
    public Circulo(Circulo Objeto)
    {
        this(Objeto.centro.DarX(),Objeto.centro.DarY(),Objeto.radio);
    }
    
    public String Ver()
    {
        return new String("\nObjetos: "+instancias+centro.Ver()+" y radio "+radio); 
    }
    
    public double Perimetro()
    {
        return 2 * Math.PI * radio;
    }
    
    public double Area()
    {
        return Math.PI * radio * radio;
    }
    
     public void finalize() 
     {       
         System.out.println("\n\nDestruyendo objeto "+Ver());       
         instancias--;   
     }  
}
