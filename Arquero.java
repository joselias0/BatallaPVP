
package batallapvp;

import java.util.Random;


public class Arquero extends Personajes{
     public Arquero()
    {
        super("Arquero",100,50,20,0.9,"Flecha de fuego");
    
    }
    
    public void aumentarsalud()
    {
        Random d = new Random();
        int nume = d.nextInt(200);
        if(nume<50 && ((double)super.getSalud()/75.0)<0.5)
        {
            int sal = this.getSalud();
            sal+=10;
            super.setSalud(sal);
            System.out.println("No me mataras!!");
            System.out.println("Te matare!!!");
                    
        }
    }
}
