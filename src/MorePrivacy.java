/* Refaktorer Person, så den har en konstruktør
   og private felter.
*/

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    //getters
    public String getName() {return name;}
    public int getAge() {return age;}
}

void main() {
    Person p = new Person("Alice", 20);

    IO.println(p.getName());
    IO.println(p.getAge());
}
