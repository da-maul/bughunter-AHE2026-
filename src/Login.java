/* Find ud af hvorfor koden ikke gør som vi forventer og ret den */

void main() {
    String username = "admin";
    String password = "9999";

    if (login(username, password)) {
        IO.println("Login successful");
    } else {
        IO.println("Login failed");
    }
}

boolean login(String username, String password) {
    return username == "admin" && password == "1234";
}