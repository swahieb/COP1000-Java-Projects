import java.util.Random;

public class Wahieb_Chpt7_Project {

    public static void bubbleSort(int[] list) {
        int temp;
        for (int i = list.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

    public static int findMax(int[] list) {
        int max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
            }
        }
        return max;
    }

    public static void printArray(int[] list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
        }

        int max = findMax(arr);
        System.out.println("The largest value is " + max);

        System.out.print("The unsorted list is ");
        printArray(arr);

        bubbleSort(arr);

        System.out.print("The sorted list is ");
        printArray(arr);
    }
}
