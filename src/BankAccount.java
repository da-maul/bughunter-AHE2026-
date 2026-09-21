/* Skriv en klasse til at håndtere bankkonti */

double balance = 1000;

void main() {
    withdraw(1200);
    deposit(100);
    IO.println(balance);
}

void withdraw(double amount) {
    balance -= amount;
}

void deposit(double amount) {
    balance += amount;
}
