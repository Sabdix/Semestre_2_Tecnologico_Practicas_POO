

package practica.pkg4;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Esfera {
    
    public double r=0.0d;
    public Scanner Teclado = new Scanner(System.in);
    private double volumen = 0.0d;
    private String Color;
    
    Esfera (double radio)
    {
        r = radio;
        System.out.print("Dame el Color de la Esfera ");
        Color = Teclado.next();
    }
    
    Esfera(){}
    
    public String DarColor()
    {
        return Color;
    }
    
    public void Asignar()
    {
        String sradio;
        sradio = JOptionPane.showInputDialog("Dame el radio");
        r = Double.parseDouble(sradio);
        System.out.print("Dame el Color de la Esfera ");
        Color = Teclado.next();
        
    }
    
    public double Volumen ()
    {
        volumen = (double) 4/3 * Math.PI * Math.pow(r,3);
        return volumen;
    }
    
    public double DarRadio ()
    {
        return r;
    }
}
