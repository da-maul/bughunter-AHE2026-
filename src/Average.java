/* Find ud hvordan vi håndterer tomme lister */

void main() {
    IO.println("The average of 1, 2, 3, 4, 5 is: "
        + calculateAverage(new int[]{1, 2, 3, 4, 5}));
    IO.println("The avergae of an empty list: "
        + calculateAverage(new int[]{}));
}

double calculateAverage(int[] numbers) {
    int sum = 0;

    for (int number : numbers) {
        sum += number;
    }
    if (sum == 0){return 0;}

    return  sum / numbers.length;
}
