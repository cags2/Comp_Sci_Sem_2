package pkg;
public class CombinedTable extends SingleTable{
    int seats;
    SingleTable t1,t2;
    public CombinedTable(SingleTable t1 , SingleTable t2){
       seats = t1.getNumSeats() + t2.getNumSeats() - 2;
       this.t1 = t1;
       this.t2 = t2;
    }
    public boolean canSeat(int n){
        if(n < seats){
            return true;
        }
        else{
            return false;
        }
    }
    public int getDesirability(){
        if(t1.getHeight() == t2.getHeight()){
            int Height = (t1.getHeight + t2.getHeight)/2;
            return Height;
        }
        else{
            int Height = ((t1.getHeight + t2.getHeight)/2);
            return Height - 10;
        
    }
}
}