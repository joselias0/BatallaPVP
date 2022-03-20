/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package batallapvp;


 
public class Personajes {
    private String Nombre;
    private int Salud;
    private int ataque;
    private int defensa;
    private double acierto;
    private String tipoAtaque;
    //metodo utilizado para insertar datos
    public Personajes(){
     this.setNombre("Luchador");
     this.setSalud(125);
     this.setAtaque(40);
     this.setDefensa(30);
     this.setAcierto(0.9);
    }
    
     
 
    
     
    //Modificar el nombre de personaje
    public void setNombre(String Nombre){
    this.Nombre=Nombre;
    }
    //Mostrar el nombre de personaje
    public String getNombre(){
    return this.Nombre;
    }
    //Modificar la salud del personaje
    public void setSalud(int Salud){
    this.Salud=Salud;
    }
    //Mostrar la salud del personaje
    public int getSalud(){
    return this.Salud;
    }
    //Modificar el daño de ataque de personaje
    public void setAtaque(int ataque){
    this.ataque=ataque;
    }
    //Mostrar el daño de ataque del personaje
    public int getAtaque(){
    return this.ataque;
    }
    //Modificar la defensa del personaje
    public void setDefensa(int defensa){
    this.defensa=defensa;
    }
    //Mostrar la defensa del personaje
    public int getDefensa(){
    return this.defensa;
    }
    //Modificar la tasa de acierto del personaje
    public void setAcierto(double acierto){
    this.acierto=acierto;
    }
    //Mostrar la tasa de acierto del personaje
    public double getAcierto(){
    return this.acierto;
    }
    //metodo utilizado para cuando el personaje rival ataca a nuestro personaje
    public void ataqueRival (int ataque){
    int daño=ataque-this.defensa;
    int EstadoVida=this.Salud;
    if(daño>0){
    System.out.println(this.Nombre+ "ha recibido un fuerte golpe y ha perdido "+ daño + " puntos de vida.");
    }else {
    System.out.println(this.Nombre + "ha recibido un ataque insignificante.");
    }
    this.Salud=EstadoVida;
    System.out.println(this.Nombre+ " tiene "+ this.Salud+ " puntos de vida restante.");
    }
    //metodo utilizado para esquivar el ataque rival dependiend
    public void esquivarAtaqueRival(){
    System.out.println(this.Nombre + " ha esquivado el golpe!!");
    }
    //metodo para determinar si el personaje utilizado sigue con vida o no
    public boolean EstadoDeSalud(){
    boolean vida = true;
    if(this.getSalud()<=0) vida=false;
    return vida;
    }
    
    
   public Personajes(String nombre,int salud, int ataqued,int defensad,double ta,String tipoAta) 
   {
    Nombre= nombre;
    Salud=salud;
    ataque= ataqued;
    defensa=defensad;
    acierto=ta;
    tipoAtaque=tipoAta;
  }
}
