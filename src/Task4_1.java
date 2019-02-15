import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/*
Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
Найти максимальный отрицательный и минимальный положительный элементы массива. Поменять их местами.
(Если в массиве больше одного отрицательного или положительного элемента, то меняется только первый элемент в цикле)
*/
public class Task4_1 {
    public static void main(String[] args) {
        int[] array = inititalizeArray(20);
        print(array);

        int maxNegativeIndex = findMaxNegativePosition(array);
        System.out.println("Максимальный отрицательный элемент: " + array[maxNegativeIndex]);
        int minPositiveIndex = findminPositivePosition(array);
        System.out.println("Минимальный положительный элемент: " + array[minPositiveIndex]);

        swapElements(maxNegativeIndex, minPositiveIndex, array);
        print(array);
    }

    /**Creates array with random numbers in range [-10;10]
     *
     * @param size number of element slots in array
     * @return  array
     */
    private static int[] inititalizeArray(int size) {
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(-10, 10 + 1);
        }
        return array;
    }

    /**Finds position of max negative number in array
     *
     * @param array
     * @return Index of max negative number
     */
    private static int findMaxNegativePosition(int[] array) {
        int maxNegativeValue = -11;
        int maxNegativeIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                if (array[i] > maxNegativeValue) {
                    maxNegativeValue = array[i];
                    maxNegativeIndex = i;
                }
            }
        }
        return maxNegativeIndex;
    }

    /**Finds position of min positive number in array
     *
     * @param array
     * @return Index of min positive number
     */
    private static int findminPositivePosition(int[] array) {
        int minPositiveValue = 11;
        int minPositiveIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                if (array[i] < minPositiveValue) {
                    minPositiveValue = array[i];
                    minPositiveIndex = i;
                }
            }
        }
        return minPositiveIndex;
    }

    /**Swaps two elements in array
     *
     * @param firstElement
     * @param secondElement
     * @param array
     */
    private static void swapElements(int firstElement, int secondElement, int[] array) {
        int temp = array[firstElement];
        array[firstElement] = array[secondElement];
        array[secondElement] = temp;
    }

    /**Prints all elements of array
     *
     * @param array array to print
     */
    private static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}
