

package practica.pkg3;

import javax.swing.JTextArea;
public class Matriz {
    private int ab[][]={{0,1,2,3,4,5,6,7},{0,8},{0},{0,9,10}};
    
    public String mostrar(){
        sumar();
        String salida="\nMatriz: \n";
         for (int i=0; i < ab.length; i++)
         {             
             float prom = (ab[i].length > 1) ? ab[i][0] / (ab[i].length-1f): 0.0f; //else             
             salida += prom+"\t";             
             for(int j=1; j < ab[i].length; j++)                 
                 salida += ab[i][j]+"\t";             
             salida += "\n";         
         }         
         return salida;
    }
    
    private void sumar(){          
        for (int i=0; i < ab.length; i++)           
            for(int j=0; j < ab[i].length; j++)
                ab[i][0]+= ab[i][j];          
    }
    
    public void procesar(JTextArea area) {         
        float masElementos = 0;         
        int pos = 0;         
        for (int i=0; i<ab.length; i++)             
            if(ab[i].length > masElementos)
            {                 
                masElementos = ab[i].length;                 
                pos = i;             
            }         
        area.append("\nLa fila que tiene más elementos es : "+(pos+1));     
    } 
    
    public Matriz (boolean genera){
        if (genera)
        {
            ab=new int [(byte)(Math.random()*7+1)][];
            for (int i=0; i < ab.length; i++)
            {
                ab[i]=new int [(byte)(Math.random()*10+1)];
                for (int j=1; j < ab[i].length; j++)
                    ab[i][j]=Math.abs((byte)(Math.random()*100+50));
            }
        }
    }
    
    public void  maximo(JTextArea area){
        int MAX;
        
        for (int fila=0; fila < ab.length; fila++)
        {
            MAX=0;
            for (int columna=1; columna < ab[fila].length; columna++)
            {
                if (ab[fila][columna] > MAX)
                    MAX = ab[fila][columna];
            }
            area.append("\nMAYOR DE LA FILA "+(fila+1)+" es "+MAX+"\n");
        }
    }
    
    public void minimo(JTextArea area)
    {
        int MIN, columna=1,limite=0, ne;
        double promedio,suma=0;
        limite= elementos(limite);
        for (int col=1; col < limite; col++)
        {
            MIN=999999;
            ne=0;
            suma=0;
                for (int fila=0; fila < ab.length; fila++)
                {
                    if (columna < ab[fila].length)
                    {
                        ne++;
                        suma+=ab[fila][columna];
                        if (ab[fila][columna] < MIN)
                            MIN=ab[fila][columna];
                    }
                }
            promedio = suma/ne;
            area.append("\nPromedio de la columna "+columna+" es "+promedio+"\n");
            area.append("\nMENOR DE LA COLUMNA "+columna+" es "+MIN+"\n");
            columna++;
        }
    }
    private  int elementos (int limite)
    {         
        int pos = 0;         
        for (int i=0; i<ab.length; i++)             
            if(ab[i].length > limite)
            {                 
                limite = ab[i].length;                 
                pos = i;             
            }         
        return limite;
    }
    
    public void repeticion(JTextArea area)
    {
        int numero=0, maxrep=0;
        for (int fila=0; fila < ab.length; fila++)
        {   
            for (int columna=1; columna < ab[fila].length; columna++)
            {
                int repeticion=0;
                for (int f=0; f < ab.length; f++)
                {
                    for (int col=1; col < ab[f].length; col++)
                    {
                        if (ab[f][col] == ab[fila][columna])
                        {
                            repeticion++;
                        }
                    }
                }
                if (repeticion > maxrep)
                {
                    maxrep=repeticion;
                    numero=ab[fila][columna];
                }
            }
        }
        area.append("\nEl numero que mas se repite es "+numero+" con "+maxrep+" de repeticiones");
    }
}
