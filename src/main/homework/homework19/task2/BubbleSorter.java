package homework.homework19.task2;

public class BubbleSorter {
    public static int[] sort(int[] inputArray) {
        int[] innerArray = new int[inputArray.length];
        System.arraycopy(inputArray, 0, innerArray, 0, innerArray.length);

        for (int i = 0; i < innerArray.length - 1; i++) {
            for (int j = 0; j < innerArray.length - i - 1; j++) {
                if (innerArray[j + 1] < innerArray[j]) {
                    int swap = innerArray[j];
                    innerArray[j] = innerArray[j + 1];
                    innerArray[j + 1] = swap;
                }
            }
        }
        return innerArray;
    }
}
