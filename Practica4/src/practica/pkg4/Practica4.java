

package practica.pkg4;


public class Practica4 {
    
    public static void main(String[] args) {
        
        Esfera Objetos[] = new Esfera[3];
        
        for (int contador=0; contador < 2; contador++)
        {
            Objetos[contador] = new Esfera();
            Objetos[contador].Asignar();
        }
        
        Objetos[2]= new Esfera(Objetos[0].DarRadio() + Objetos[1].DarRadio());
        
        System.out.println("Esfera \t Radio \t Volumen \t\t Color");
        for (int print=0; print < Objetos.length; print++)
        {
            System.out.println((print+1)+" \t "+Objetos[print].r+" \t "+Objetos[print].Volumen()+"\t"+Objetos[print].DarColor());
        }
    }
    
}
