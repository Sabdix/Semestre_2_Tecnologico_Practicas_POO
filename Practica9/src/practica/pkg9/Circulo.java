

package practica.pkg9;


public class Circulo extends Figura {
    private float radio;
    
    Circulo(float r)
    {
        radio = r;
    }
    
    public float Area() //Funcion Abstracta
    {
        float PI = 3.1415f;
        return PI * radio * radio;
    }
    
    public void mostrar()
    {
        super.mostrar();
        System.out.print(" Circulo con radio = "+ radio);
    }
    
    public float DarRadio()
    {
        return radio;
    }
}
