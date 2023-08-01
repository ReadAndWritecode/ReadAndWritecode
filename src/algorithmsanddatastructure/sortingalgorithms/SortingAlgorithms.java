package algorithmsanddatastructure.sortingalgorithms;

import java.util.Arrays;


public class SortingAlgorithms {


    public static void main(String[] args) {

        int[] arrayForDemo = {10, -20, 15, 55, 60, 1, 500, 0, 56, 7, 87, 2500, 80};
        System.out.println(Arrays.toString(arrayForDemo));

        bubbleSort1(arrayForDemo);
        System.out.println("bubbleSort1:\n" + Arrays.toString(arrayForDemo));

        bubbleSort2(arrayForDemo);
        System.out.println("bubbleSort2:\n" + Arrays.toString(arrayForDemo));

        bubbleSortHalf(arrayForDemo);
        System.out.println("bubbleSortHalf:\n" + Arrays.toString(arrayForDemo));

        selectionSort1(arrayForDemo);
        System.out.println("selectionSort1:\n" + Arrays.toString(arrayForDemo));

        selectionSort2(arrayForDemo);
        System.out.println("selectionSort2:\n" + Arrays.toString(arrayForDemo));

        insertionSort(arrayForDemo);
        System.out.println("insertionSort:\n" + Arrays.toString(arrayForDemo));

    }

    // Метод пузырьковой сортировки (Bubble Sort)
    // Сложность: O(n^2) квадратичное время выполнения в худшем и среднем случаях
    static void bubbleSort1(int[] array) {
        // Внешний цикл проходит по массиву с начала до конца
        for (int i = 0; i < array.length; i++) {
            // Внутренний цикл проходит по массиву с элемента после i до конца
            for (int j = i + 1; j < array.length; j++) {
                // Если текущий элемент больше следующего, меняем их местами
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    // Метод пузырьковой сортировки (Bubble Sort) с обратным порядком
    // Сложность: O(n^2) квадратичное время выполнения в худшем и среднем случаях
    static void bubbleSort2(int[] array) {
        // Внешний цикл проходит по массиву с конца до второго элемента
        for (int i = array.length - 1; i >= 1; i--) {
            // Внутренний цикл проходит по массиву с предыдущего элемента до начала
            for (int j = i - 1; j >= 0; j--) {
                // Если текущий элемент меньше предыдущего, меняем их местами
                if (array[i] < array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    // Метод пузырьковой сортировки (Bubble Sort) с условием выхода при отсутствии обменов
    // Сложность: В худшем случае O(n^2), а в лучшем случае (когда массив уже отсортирован или частично отсортирован) - O(n)
    static void bubbleSortHalf(int[] array) {
        int n = array.length;
        boolean swapped;
        // Внешний цикл проходит по массиву
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // Внутренний цикл проходит по массиву с элемента после i до конца
            for (int j = i + 1; j < n - i - 1; j++) {
                // Если текущий элемент больше следующего, меняем их местами и помечаем флаг обмена
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    swapped = true;
                }
            }
            // Если за проход по внутреннему циклу не было обменов, то массив уже отсортирован, выходим из цикла
            if (!swapped) {
                break;
            }
        }
    }

    // Метод сортировки выбором (Selection Sort) - Вариант 1
    // Сложность: O(n^2) в худшем, лучшем и среднем случаях
    static void selectionSort1(int[] array) {
        // Внешний цикл проходит по массиву с начала до предпоследнего элемента
        for (int i = 0; i < array.length - 1; i++) {
            // Внутренний цикл проходит по массиву с элемента после i до конца
            for (int j = i + 1; j < array.length; j++) {
                // Если текущий элемент больше следующего, меняем их местами
                if (array[i] > array[j]) {
                    int tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
    }

    // Метод сортировки выбором (Selection Sort) - Вариант 2
    // Сложность: O(n^2) в худшем, лучшем и среднем случаях
    static void selectionSort2(int[] array) {
        int out, in, min;
        // Внешний цикл проходит по массиву с начала до предпоследнего элемента
        for (out = 0; out < array.length - 1; out++) {
            min = out;
            // Внутренний цикл проходит по массиву с элемента после out до конца
            for (in = out + 1; in < array.length; in++) {
                // Находим минимальный элемент в неотсортированной части массива
                if (array[in] < array[min])
                    min = in;
            }
            // Меняем местами минимальный элемент с текущим элементом
            int tmp = array[out];
            array[out] = array[min];
            array[min] = tmp;
        }
    }

    // Метод сортировки вставками (Insertion Sort)
    // Сложность: O(n^2) в худшем и среднем случаях.В лучшем случае, когда массив уже отсортирован, сложность сокращается до O(n)
    static void insertionSort(int[] array) {
        // Внешний цикл проходит по массиву с начала до конца
        for (int out = 1; out < array.length; out++) {
            int tmp = array[out];
            int in = out;
            // Внутренний цикл перемещается влево и "вставляет" текущий элемент в отсортированную часть
            while (in > 0 && array[in - 1] >= tmp) {
                array[in] = array[in - 1];
                --in;
            }
            // Вставляем текущий элемент на его правильное место в отсортированной части
            array[in] = tmp;
        }
    }
}