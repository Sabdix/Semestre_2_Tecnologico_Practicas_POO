

package practica.pkg9;


public class Cuadrado extends Figura {
    private float Lado;
    
    Cuadrado(float L)
    {
        Lado = L;
    }
    
    public float Area()
    {
        return Lado * Lado;
    }
    
    public void mostrar()
    {
        super.mostrar();
        System.out.print(" Cuadrado con Lado = "+ Lado);
    }
}
