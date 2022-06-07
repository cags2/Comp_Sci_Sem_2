public class Horsebarn{
    private Horse[] spaces;
    public int findHorseSpace(String name){
        for(int i = 0; i < spaces.length; i++){
            if(space[i].getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public void consolidate{
        boolean yes = false;
        while(yes == false){
            for(int i = 1; i < space.length; i++){
                if(space[i-1].equals(null)){
                    spaces[i-1]=spaces[i];
                    spaces[i]= null;
                }
                yes = true;
                for(int i = 0; i< space.length-1;i++){
                    if(space[i].equals(null)&&!spaces[i+1].equals(null)){
                        complete = false;
                    }
                }
            }
        }
    }
}