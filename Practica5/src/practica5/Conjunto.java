

package practica5;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JTextArea;


public class Conjunto {
    private int bits;
    
    public void generar (boolean genera) throws IOException
    {
        bits=0;
        File Archivo = new File("Documento.txt");
        Scanner Teclado = new Scanner(Archivo);
        if (!genera) return;
        int ne;
        ne= Teclado.nextInt(); //(byte)Math.abs((byte)(Math.random()*31+1));
        int elemento;
        
        for (byte i=0; i < ne; i++)
        {
            elemento= Teclado.nextInt();
            bits= (bits|(0x80000000 >>> elemento));
        }
    }
    public void generar2 (boolean genera) throws IOException
    {
        bits=0;
        File Archivo = new File("Documento2.txt");
        Scanner Teclado = new Scanner(Archivo);
        if (!genera) return;
        int ne;
        ne= Teclado.nextInt(); //(byte)Math.abs((byte)(Math.random()*31+1));
        int elemento;
        
        for (byte i=0; i < ne; i++)
        {
            elemento= Teclado.nextInt();
            bits= (bits|(0x80000000 >>> elemento));
        }
    }
    
    public void mostrar(String msg, JTextArea areaSalida)
    {
        String salida = "\n01234567890123456789012345678901\n";
        for (byte i=0; i < 32; i++)
            if((bits & (0x80000000 >>> i)) != 0)
                salida += "1";
            else
                salida += "0";
        salida += "---->"+msg+"[";
        for (byte i=0; i < 32; i++)
            salida += ((bits & (0x80000000 >>> i)) != 0) ? i+"," : "";
        salida += "]";
        
        System.out.println(salida);
        areaSalida.append(salida+"\n");
    }
    
    public Conjunto Union(Conjunto b)
    {
        Conjunto resultante;
        resultante = new Conjunto();
        resultante.bits= bits |b.bits;
        return resultante;
    }
    
    public Conjunto Interseccion(Conjunto b)
    {
        Conjunto resultante;
        resultante = new Conjunto();
        resultante.bits= bits & b.bits;
        return resultante;
    }
    
    public Conjunto Diferencia(Conjunto b)
    {
        Conjunto resultante;
        resultante = new Conjunto();
        resultante.bits = bits &~ b.bits;
        return resultante;
    }
    
    public boolean subConjunto (Conjunto b) 
    {
        boolean sub=false;
        int aux=bits | b.bits;
        aux = aux | bits;
        if(bits == aux)sub=true;
            return sub;
}
    
}
