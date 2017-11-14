



package practica.pkg7;


public class Practica7 {

    
    public static void main(String[] args) {
        Circulo Objeto1 = new Circulo();
        
        System.out.print(Objeto1.Ver()+"\nTiene un perímetro de "+Objeto1.Perimetro());
        System.out.println(" y una area de "+Objeto1.Area());  
        
        Circulo Objeto2 = new Circulo(100, 100);     
         
        System.out.print(Objeto2.Ver()+"\nTiene un perímetro de "+Objeto2.Perimetro());     
        System.out.println(" y una area de "+Objeto2.Area());    
        Objeto2 = null;    
        System.gc(); //desreferenciar para el gc
         
        Circulo Objeto3 = new Circulo(150, 250, 10);     
        System.out.print(Objeto3.Ver()+"\nTiene un perímetro de "+Objeto3.Perimetro());     
        System.out.println(" y una area de "+Objeto3.Area());
        
        Circulo Objeto4 = new Circulo(Objeto3);     
        System.out.print(Objeto4.Ver()+"\nTiene un perímetro de "+Objeto4.Perimetro());     
        System.out.println(" y una area de "+Objeto4.Area()); 
    }
    
}
