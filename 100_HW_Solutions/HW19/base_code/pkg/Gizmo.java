package pkg;

public class Gizmo
{ 
   public String maker;
   public boolean isE;
   public double cost;
   public Gizmo(String maker, boolean isE, double cost){
      maker = this.maker;
      isE = this.isE;
      cost = this.cost;
   }
   public boolean isElectronic(){
      return isE;
   }
   public void getMaker(){
      return maker;
   }
   public String toString()
   {
   	return "" + maker + " " + isE + " " + cost;
   }
}
