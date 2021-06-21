package javafileio.classes;

public class Person {

    private String name;
    private String surname;
    private int age;

    
    public Person() {
        
    }
    
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String aName) {
        name = aName;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String aSurname) {
        surname = aSurname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int aAge) {
        age = aAge;
    }
    
    @Override
    public String toString() {
        return this.name + ", "+ this.surname +", " + this.age;
    }
    
}
