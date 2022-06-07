package pkg;

public class Dwarf{
    private String name;
    private int age;
    public Dwarf(){
        name = "“”";
        age = 0;
    }
    public Dwarf(String name){
     name = this.name;   
     age = 0;
    }
    public Dwarf(int age){
        name = "“”";
        age = this.age;
    }
    public Dwarf(String name, int age){
        name = this.name;
        age = this.age;
    }
    public void setName(String name){
        name = this.name;
    }
    public void setAge(int age){
        age = this.age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}