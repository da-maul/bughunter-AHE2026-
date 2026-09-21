/* Find fejlen i isOdd-metoden */

void main() {
    IO.println("Number 3 is odd: " + isOdd(3));
    IO.println("Number 4 is odd: " + isOdd(4));
}

boolean isOdd(int number) {
    return number % 2 == 1;
}
