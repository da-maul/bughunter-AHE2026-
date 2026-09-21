/* Prøv at simplificere isWeekend-metoden */

void main() {
    String dayOfWeek = "Mandag";

    boolean weekend = isWeekend(dayOfWeek);
    IO.println("Er " + dayOfWeek + " i weekenden: " + weekend);
}

boolean isWeekend(String day) {
    boolean weekend = false;

    switch (day) {
        case "Lørdag":
            weekend = true;
            break;
        case "Søndag":
            weekend = true;
            break;
        default:
            weekend = false;
            break;
    }
    return weekend;
}
