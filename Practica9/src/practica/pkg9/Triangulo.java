

package practica.pkg9;


public class Triangulo extends Figura {
    private float Base;
    private float Altura;
    
    Triangulo(float B, float A)
    {
        Base = B;
        Altura = A;
    }
    
    public float Area()
    {
        return Base * Altura / 2;
    }
    
    public void mostrar()
    {
        super.mostrar();
        System.out.print(" Triangulo con Base = "+ Base + " y Altura = "+ Altura);
    }
}
