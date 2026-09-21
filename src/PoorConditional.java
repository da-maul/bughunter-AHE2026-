/* isCold er unødigt kompliceret, 
   refakterer den så den bliver enklere
*/

void main() {
    int temperature = 20;

    if (isCold(temperature)) {
        IO.println("It's cold");
    } else {
        IO.println("It's not cold");
    }
}

boolean isCold(int temperature) {
    return temperature > 20;
}
