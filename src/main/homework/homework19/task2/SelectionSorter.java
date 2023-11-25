package homework.homework19.task2;

public class SelectionSorter {
    public static int[] sort(int[] inputArray) {
        int[] innerArray = new int[inputArray.length];
        System.arraycopy(inputArray, 0, innerArray, 0, innerArray.length);

        for (int i = 0; i < innerArray.length; i++) {
            int pos = i;
            int min = innerArray[i];
            for (int j = i + 1; j < innerArray.length; j++) {
                if (innerArray[j] < min) {
                    pos = j;
                    min = innerArray[j];
                }
            }
            innerArray[pos] = innerArray[i];
            innerArray[i] = min;
        }
        return innerArray;
    }
}
