public class HarmonicMeanCalculator {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        double sumOfReciprocals = 0;

        for (int number : numbers) {
            sumOfReciprocals += 1.0 / number;
        }

        double harmonicMean = numbers.length / sumOfReciprocals;

        System.out.println("The harmonic mean of the array: " + harmonicMean);
    }
}