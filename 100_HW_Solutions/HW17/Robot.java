public class Robot{
    private int[] hall;
    private int pos;
    private boolean facingRight;
    
    
    private boolean forwardMoveBlocked(){
        if(facingRight){
            if(pos < hall.length - 2){
                return false;
            }
            return true;
        }
        else{
            if(pos < 1){
                return false;
            }
            return true;
        }
    }
    private void move(){
        if(hall[pos] > 0){
            hall[pos]--;
            if(hall[pos]> 0){
                return;
            }
        }
        if(!forwardMoveBlocked()){
            if(facingRight){
                pos++;
            }
            else{
                pos--;
            }
        }
        else{
            facingRight = !facingRight;
        }
    }
    public int clearHall(){
        int moves = 0;
        while(!hallIsClear()){
            move();
            moves++;
        }
        return moves;
    }
}