
package batallapvp;

import java.util.Random;


public class Luchador extends Personajes {
    public Luchador()
    {
        super("Luchador",125,40,30,0.9,"F5");
        
    }
    
    public void aumentoataque()
    {
        Random d = new Random();
        int nume = d.nextInt(200);
        if(nume>100&&nume<150&&this.getSalud()<=50)
        {
            int ataq = this.getAtaque();
            ataq+=2;
            this.setAtaque(ataq);
           
            System.out.println("La batalla no ha terminado!");
            System.out.println("Peleare hasta el final!");
            
        }
    }
}
