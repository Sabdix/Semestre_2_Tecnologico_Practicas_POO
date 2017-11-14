

package practica8;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;

public class Practica8 {
    
    public Practica8()
    {
        System.out.println("\nOperaciones Básicos de Sets\n");
    }
    
    public static void main(String[] args) {
        Practica8 app = new Practica8();
        JTextArea areaSalida = new JTextArea(15, 50);
        JScrollPane areaScroll = new JScrollPane(areaSalida);
        areaSalida.setText("\nOperaciones Basicas de COnjuntos\n");
        Set.Mostrar(areaSalida);
        Set set1, set2;
        set1 = new Set(true);        
        set1.Mostrar("Set A     :",areaSalida);         
        set2 = new Set(true);         
        set2.Mostrar("Set B     :",areaSalida);         
        Set setR;         
        setR = set1.Union(set2);;         
        setR.Mostrar("Set A U B :",areaSalida);         
        setR = set1.Interseccion(set2);;         
        setR.Mostrar("Set A I B :",areaSalida);         
        setR = set1.Diferencia(set2);;         
        setR.Mostrar("Set A - B :",areaSalida);
        setR = set2.Diferencia(set1);
        setR.Mostrar("Set B - A :",areaSalida);
        
        String Elemento = JOptionPane.showInputDialog("Que elemento quieres ver si esta en conjunto A ");
        boolean existe = set1.Pertenencia(Elemento);         
        areaSalida.append("\nEl elemento "+Elemento);         
        areaSalida.append((existe) ? " Si " : " No ");        
        areaSalida.append("pertenece al conjunto A"); 
         
        JOptionPane.showMessageDialog(null,areaScroll,"Resultados", JOptionPane.INFORMATION_MESSAGE); 
    }
    
}
