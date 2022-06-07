import java.util.ArrayList;


public class OnlinePurchaseManager
{
   
   public ArrayList<Gizmo> purchases;
   
   public OnlinePurchaseManager(){
      purchases = new ArrayList<>();
   }
   public void add(String a, boolean b, int c){
      purchases.add(new Gizmo(a,b,c));
   }
   public Gizmo countElectronicsByMaker(String elec){
      
   }
   public Gizmo getCheapestGizmoByMaker(String mkr)
   {
   	
   }
   
   
   public String toString()
   {
   	return "" + purchases;
   }
}
