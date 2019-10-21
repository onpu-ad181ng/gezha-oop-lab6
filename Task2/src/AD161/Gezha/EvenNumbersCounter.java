package AD161.Gezha;

public class EvenNumbersCounter implements CounterInterface {

    @Override
    public int fold(int[] arr) {
        int evenAmount = 0;
        for (int number: arr) {
            if (number % 2 == 0) {
                ++evenAmount;
            }
        }
        return evenAmount;
    }
}
