

package practica5;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.io.IOException;

public class Practica5 {

    static public void VerEncabezado()
    {
        System.out.println("\nOperaciones Basicos de Conjuntos\n");
    }
    
    public static void main(String[] args)throws IOException {
         String sub;
         
         JTextArea areaSalida = new JTextArea(30, 50);         
         JScrollPane areaScroll = new JScrollPane(areaSalida);  
         
         areaSalida.setText("\nOperaciones basicos de Conjuntos \n");      
         
         VerEncabezado(); 
         
         Conjunto set1, set2;  
         
         set1 = new Conjunto(); 
         set1.generar(true);     
         set1.mostrar("Conjunto A     :",areaSalida); 
         
         set2 = new Conjunto();
         set2.generar2(true);         
         set2.mostrar("Conjunto B     :",areaSalida);         
         
         Conjunto setU;         
         setU = set1.Union(set2);         
         setU.mostrar("Conjunto A U B :",areaSalida); 
         
         Conjunto setI;
         setI = set1.Interseccion(set2);
         setI.mostrar("Interseccion A | B :", areaSalida);
         
         Conjunto setD;
         setD = set1.Diferencia(set2);
         setD.mostrar("Diferencia A - B :", areaSalida);
         
         if(set1.subConjunto(set2))
             sub="\n\nEl conjunto B es subconjunto de A\n A es identidad con B";
         else
             sub="\n\nEl conjunto B no es Subconjunto de A\n el conjunto A no es identidad con B";
	 areaSalida.append(sub);
         
         if(set2.subConjunto(set1))
             sub="\n\nEl conjunto A es subconjunto de B\n B es identidad con A";
         else
             sub="\n\nEl conjunto A no es subconjunto de B \nB no es identidad con A";
	 areaSalida.append(sub);
        
         JOptionPane.showMessageDialog(null,areaScroll,"Resultados", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
