
public class Musician extends Performer{
    String instrument; 
    public Musician(){
        instrument = "Cello";
    }
    public Musician(String name, String instrument){
        super(name);
        instrument = this.instrument;
    }
    public Musician(String name, int age, String instrument){
        super(name, age);
        instrument = this.instrument;
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
    public void toString(Object yes){
        System.out.println("Name is " + name + " and that person plays the " + instrument);
    }
}