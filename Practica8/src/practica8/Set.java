

package practica8;
import javax.swing.JTextArea;


public class Set {
    private int bits;
    final static String Universo[]= {"Uva", "Melon", "Sandia", "Manzana", "Pera", "Limon", "Fresa", "Piña"};
    
    private String Bits()
    {
        String Salida = "\n01234567\n";
        for (byte i=0; i < Universo.length; i++)
            if((bits & (0x80000000 >>> i)) != 0)
                Salida +="1";
            else
                Salida += "0";
        return Salida;
    }
    
    private String Elementos()
    {
        String Salida = "[";
        for (byte i = 0; i < Universo.length; i++)
            Salida += ((bits & (0x80000000 >>> i)) != 0) ? Universo[i]+", ":"";
        Salida += "]";
        return Salida;
    }
    
    public Set()
    {
        bits = 0; //Conjunto Vacio
    }
    
    public Set(boolean genera)
    {
        this();
        if (!genera) return;
        byte ne;
        ne = (byte)(Math.random()*Universo.length + 1);
        short elemento;
        for (byte i = 0; i < ne; i++)
        {
            elemento = (short)(Math.random()*Universo.length +1);
            bits = (bits | (0x80000000 >>> elemento));
        }
    }
    
    public static void Mostrar(JTextArea areaSalida)
    {
        String Salida = "\n01234567\n";
        Salida += " Universo "+"[";
        for (byte i=0; i < Universo.length; i++)
            Salida += Universo[i]+", ";
        Salida += "]";
        System.out.println(Salida);
        areaSalida.append(Salida+"\n");
    }
    
    public void Mostrar(String msg, JTextArea areaSalida)
    {
         String Salida = Bits()+"   "+msg;         
         Salida += Elementos();         
         System.out.println(Salida);         
         areaSalida.append(Salida+"\n"); 
    }
    
    public Set Union(Set b)
    {
        Set Resultante;
        Resultante = new Set(false);
        Resultante.bits = bits | b.bits;
        return Resultante;
    }
    
    public Set Interseccion(Set b)
    {
        Set Resultante;
        Resultante = new Set(false);
        Resultante.bits = bits & b.bits;
        return Resultante;
    }
    
    public Set Diferencia(Set b)
    {
        Set Resultante;
        Resultante = new Set(false);
        Resultante.bits = bits &~ b.bits;
        return Resultante;
    }
    
    public boolean Pertenencia(String Elemento)
    {
        boolean existe = false;
        int pos = 0;
        for (int i = 0; i < Universo.length && !existe; i++)
            if (Universo[i].compareTo(Elemento) == 0)
            {
                existe = true;
                pos = i;
            }
        if (existe)
        {
            int elem = 0x80000000 >>> pos;
            existe = (bits & elem) != 0 ? true : false;
        }
        return existe;
    }
    
    
}
