

package practica6;


public class Dado {
    private int valor;
    
    public Dado()
    {
        valor = 1;
    }
    
    public int lanzar()
    {
        valor = (int)(Math.random()*6+1);
        return valor;
    }
}
