package Classes;

//Human Class
public class Human {
    //Three fields, age, name and occupation;
    int age;
    String name;
    String occupation;

    //One Constructor
    public Human(int age, String name, String occupation) {
        this.age = age;
        this.name = name;
        this.occupation = occupation;
    }

    //Three functions/methods

    public void age(int age) {
        this.age = age;
    }

    public void name(String name) {
        this.name = name;
    }

    public void occupation(String occupation) {
        this.occupation = occupation;
    }

    
    
}
