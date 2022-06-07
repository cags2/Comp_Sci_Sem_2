public class Science extends Class{
    String field;
    public Science(String field, String teacher, int grade){
        field = this.field;
        super(teacher, grade);
    }
    public void APSci(){
        calcCredits = calcCredits + 1;
    }
    public void RecoverySci(){
        if(grade >= 60){
            System.out.println("You have passed the class");
        }
        else if(grade < 60){
            System.out.println("You have failed the class");
    }
}
    public void getField(){
        System.out.println("Your field for Science is " + field);
    }
    public void toString(){
        System.out.println("The teacher is " + teacher + " and you got " + calcCredits + " credits and the field was " + field);
    }
    
}