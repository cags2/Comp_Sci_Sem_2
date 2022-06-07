import java.util.Scanner;
public class Hangman{
    private String guessingWord;
    private int numTries;
    Scanner a = new Scanner(System.in);
    public Hangman(){
        this.guessingWord = guessingWord;
        numTries = 5;
    }
    public Hangman(int numTries){
        this.guessingWord = guessingWord;
        this.numTries = numTries;
    }
    public int guessCheck(String letter, int start){
    System.out.print("Enter a letter");
    char b = a.nextChar();
    String c = guessingWord;
    if(b == c.substring(1)){
        return true;
    }
    if(b != c){
        return false;
    }
}
public boolean checkWin(boolean[]){
    
}
}