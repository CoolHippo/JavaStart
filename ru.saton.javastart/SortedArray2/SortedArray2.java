package SortedArray2;



import java.util.Arrays;
import java.util.Scanner;

public class SortedArray2 {
    public static void main(String[] args) {
        int num;
        int index;
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
        }
        Arrays.sort(array);

        for (int arr:array
             ) {
            System.out.print(arr + " ");
        }
        System.out.println();
        System.out.println("Введите любое из представленных чисел если хотите узнать его индекс в массиве");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        System.out.println("Введенное вами число находиться в array[" + findIndexInArray(array, num) + "]");

    }
    private static int findIndexInArray(int[] array, int num){
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]){
                return i;
            }
        }
        return -1;
    }
}
