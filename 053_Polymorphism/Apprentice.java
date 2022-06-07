public class Apprentice extends Musician{
    String school;
    int yearsOfExperience;
    public Apprentice(){
        school = "CVHS";
        yearsOfExperience = 0;
    }
    public Apprentice(String school, int yearsOfExperience){
        school = this.school;
        yearsOfExperience = this.yearsOfExperience;
    }
    public Apprentice(String instrument, String school, int yearsOfExperience){
        super(instrument);
        school = this.school;
        yearsOfExperience = this.yearsOfExperience;
    }
    public Apprentice(String name, int age, String instrument, String school, int yearsOfExperience){
        super(name, age, instrument);
        school = this.school;
        yearsOfExperience = this.yearsOfExperience;
    }
    public void playInstrument(){
        System.out.println("The apprentice " + name + " is playing the " + instrument);
    }
    public void practice(){
        System.out.println(name + " is practicing the " + instrument + " and has " + yearsOfExperience + " years of experience");
    }
    public void perform(){
        System.out.println(name + " is performing and is playing the " + instrument);
    }
    public void practiceAtUniversity(){
        System.out.println(name + " is practicing at the university");
    }
}