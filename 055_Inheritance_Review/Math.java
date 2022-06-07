public class Math extends Class{
    String difficulty;
    public Math(String difficulty, String teacher, int grade){
        difficulty = this.difficulty;
        super(teacher, grade);
    }
    public void toString(){
        System.out.println("The teacher is " + teacher + " and you got " + calcCredits + " credits and the difficulty of this math class is " + difficulty);
    }
    public void getDifficulty(){
        System.out.println("The difficulty of this class is " + difficulty);
    }
}