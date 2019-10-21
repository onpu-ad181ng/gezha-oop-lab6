package AD161.Gezha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int arraySize = input.nextInt();

        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; ++i) {
            System.out.print("Input array element #" + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        CounterInterface evenCounter = new EvenNumbersCounter();
        CounterInterface oddCounter = new OddNumbersCounter();

        System.out.println("Even numbers amount: " + evenCounter.fold(array));
        System.out.println("Odd numbers amount: " + oddCounter.fold(array));
    }
}
