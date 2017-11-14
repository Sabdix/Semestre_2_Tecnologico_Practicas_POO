

package practica6;
import javax.swing.JOptionPane;

public class Experimento {
    private Dado dados[];
    private int frecuencias[];
    private int lanzamientos;
    private int mayor=0;
    
    public Experimento()
    {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("De la cantidad de dados "));
        dados= new Dado [cantidad];
        frecuencias = new int [cantidad*6];
        lanzamientos = Integer.parseInt(JOptionPane.showInputDialog("De la cantidad de lanzamientos"));
        for (int lanza=0; lanza < lanzamientos; lanza++)
        {
            int tirada=0;
            for (int D=0; D < dados.length; D++)
            {
                dados[D] = new Dado();
                tirada += dados[D].lanzar();
            }
            frecuencias[tirada-1] += 1;
        }
    }
    
    public void mostrar()
    {
        int repeticiones=0;
        System.out.println("\nValor \tFrecuencia");
        for (int i=0; i < frecuencias.length; i++)
            System.out.println((i+1)+"\t"+frecuencias[i]);
        for (int contador=0; contador < frecuencias.length; contador++)
            if (frecuencias[contador] > repeticiones)
            {
                mayor = contador+1;
                repeticiones = frecuencias[contador];
            }
        System.out.println("\n\nLa tirada con mayor ocurrencia es "+mayor);
    }
}
