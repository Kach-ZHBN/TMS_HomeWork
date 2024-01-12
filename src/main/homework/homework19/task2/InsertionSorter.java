package homework.homework19.task2;

public class InsertionSorter {
    public static int[] sort(int[] inputArray) {
        int[] innerArray = new int[inputArray.length];
        System.arraycopy(inputArray, 0, innerArray, 0, innerArray.length);

        int j;
        for (int i = 1; i < innerArray.length; i++) {
            int swap = innerArray[i];
            for (j = i; j > 0 && swap < innerArray[j - 1]; j--) {
                innerArray[j] = innerArray[j - 1];
            }
            innerArray[j] = swap;
        }
        return innerArray;
    }
}
