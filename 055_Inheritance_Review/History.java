public class History extends Class{
    int Era;
    public History(int Era, String teacher, int grade){
        Era = this.Era;
        super(teacher, grade);
    }
    public void getEra(){
        System.out.println("The year of Era your learning is " + Era);
    }
    public void toString(){
        System.out.println("The teacher is " + teacher + " and you got " + calcCredits + " credits and the year of Era your learning is " + Era);
    }
}