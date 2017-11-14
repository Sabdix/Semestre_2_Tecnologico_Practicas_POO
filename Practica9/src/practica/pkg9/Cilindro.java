

package practica.pkg9;


public class Cilindro extends Circulo {
    private float Altura;
    
    public Cilindro(float r, float h)
    {
        super(r);
        Altura = h;
    }
    
    public float Area()
    {
        float PI = 3.1415f;
        return 2 * PI * super.DarRadio() * Altura;
    }
    
    public void mostrar()
    {
        super.mostrar();
        System.out.print(" Cilindro con Radio = "+ super.DarRadio() + " y Altura = "+ Altura);
    }
}
