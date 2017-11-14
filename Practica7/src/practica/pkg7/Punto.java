

package practica.pkg7;

public class Punto {
    private double x, y;
    
    Punto()
    {
        x = y = 1.0d;
    }
    
    Punto (double x, double cy)
    {
        this.x = x;
        y = cy;
    }
    
    Punto (Punto Objeto)
    {
        this(Objeto.x, Objeto.y);
    }
    
    public String Ver()
    {
        return new String ("\nCirculo con origen ("+x+","+y+")");
    }
    
    public double DarX()
    {
        return x;
    }
    
    public double DarY()
    {
        return y;
    }
    
}
