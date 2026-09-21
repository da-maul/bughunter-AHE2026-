/* Refaktorer koden for at fjerne duplikerede if-betingelser */

void main() {
    int age = 25;

    if (age >= 18) {
        IO.println("Can vote");
        IO.println("Can drive");
        IO.println("Is an adult");
    }
}
