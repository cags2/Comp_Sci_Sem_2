public class Class{
    String teacher;
    int grade;
    int credit;
    public Class(String teacher, int grade){
        teacher = this.teacher;
        grade = this.grade;
    }
    public void calcCredits(){
        if(grade >= 90){
            credit = 4;
        }
        else if(grade >= 80){
            credit = 3;
        }
        else if(grade >= 70){
            credit = 2;
        }
        else if(grade >= 60){
            credit = 1;
        }
        else if(grade < 60){
            credit = 0;
        }
    }
    public void toString(Object yes){
        System.out.println(teacher + " You got " + calcCredits + " credits this year");
    }
    public boolean equals(Object equal){
        if(!(equal instanceof Class)){
            return false;
        }
        else{
            return this.teacher == equal.teacher; 
        }
    }
}