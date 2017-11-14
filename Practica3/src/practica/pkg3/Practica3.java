

package practica.pkg3;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Practica3 {

    
    public static void main(String[] args) {
         JTextArea area = new JTextArea(30,40);         
         Matriz objeto = new Matriz(false);         
         area.setText("\nArreglo con inicializacion predefinida\n");         
         area.append(objeto.mostrar());
         objeto.procesar(area);
         area.append("\nArreglo con definicion aleatoria\n");
         Matriz otraMatriz = new Matriz(true);
         area.append(otraMatriz.mostrar());
         otraMatriz.repeticion(area);
         otraMatriz.procesar(area);
         otraMatriz.maximo(area);
         otraMatriz.minimo(area);
         JScrollPane areaSc = new JScrollPane(area);         
         JOptionPane.showMessageDialog(null,areaSc,"Matrices", JOptionPane.PLAIN_MESSAGE);
    }
    
}
