
public class Musician extends Performer{
    String instrument; 
    public Musician(){
        instrument = "Cello";
    }
    public Musician(String instrument){
        instrument = this.instrument;
    }
    public String getInstrument(){
        return instrument;
    }
    public void playInstrument(){
        System.out.println(name + " is playing the " + instrument);
    }
}