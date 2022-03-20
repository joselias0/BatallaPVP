
package batallapvp;

import java.util.Random;


public class Destructor extends Personajes {
   public Destructor()
    {
        super("Destructor",120,30,25,0.9,"Golpe final");
    }
    
    public void aumentodefensa()
    {
         Random d = new Random();
        int nume = d.nextInt(200);
        if(nume>100 && nume<150)
        {
            int def = this.getDefensa();
            def+=2;
            this.setDefensa(def);
            double ta = this.getAcierto();
            ta-=0.01;
            this.setDefensa(def);
            System.out.println("No me rendire!");
        }
    } 
}
