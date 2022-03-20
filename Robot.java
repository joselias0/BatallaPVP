
package batallapvp;

import java.util.Random;


public class Robot extends Personajes{
      private int vidat;
    public Robot()
    {
        super();
        this.vidat=super.getSalud();
    }
    
    
    public void aumentodefensa()
    {
        Random d = new Random();
        int nume = d.nextInt(200);
        if (nume>150 &&((double)super.getSalud()/(double)this.vidat)<=0.20)
        {
            int def = super.getDefensa();
            def+=5;
            super.setDefensa(def);
            System.out.println("Eres muy debil JA-JA-JA");
        }
    }
}
