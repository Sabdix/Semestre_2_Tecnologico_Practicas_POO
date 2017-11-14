

package practica.pkg9;


public class Rectangulo extends Figura {
    private int Base;
    private int Altura;
    
    Rectangulo(int B, int A)
    {
        Base = B;
        Altura = A;
    }
    
    public float Area() //Funcion Abstracta
    {
        return Base * Altura;
    }
    
    public void mostrar()
    {
        super.mostrar();
        System.out.print(" Rectangulo con Base = "+ Base + " y Altura = " + Altura);
    }
}
