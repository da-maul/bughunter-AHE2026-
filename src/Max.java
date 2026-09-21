/* Find fejlen i max-metoden */

void main() {
    int[] numbers = {5, 40, 15, 30, 25};
    
    IO.println("Max: " + max(numbers));
}

int max(int[] numbers) {
    int max = 0;
    for (int number : numbers) {
        if (number > max) {
            max = number;
        }
    }
    return max;
}
