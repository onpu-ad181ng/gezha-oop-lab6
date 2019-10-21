package AD161.Gezha;

public class OddNumbersCounter implements CounterInterface {

    @Override
    public int fold(int[] arr) {
        int oddAmount = 0;
        for (int number: arr) {
            if (number % 2 == 1) {
                ++oddAmount;
            }
        }
        return oddAmount;
    }
}
