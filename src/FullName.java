/* Kan du forbedre klassen, så den returnerer fulde navne? */

void main() {
    Person person1 = new Person("Alice", "Smith");
    String person1FullName = person1.getName();

    Person person2 = new Person("Bob", "Johnson");
    String person2FullName = person2.getName();

    IO.println("Hello " + person1FullName);
    IO.println("Hello " + person2FullName);
}

public class Person {
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName(){
        return firstName+" "+lastName;
    }
}