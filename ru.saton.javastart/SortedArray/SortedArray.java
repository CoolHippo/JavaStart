package SortedArray;

//Поиск номера элемента по значению в отсортированном массиве.

import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        int num ;
        int index;
        SelectionSort selSort = new SelectionSort();
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++) {
            //элементу массива присваивается случайное число от 0 до 99
            arr[i] = (int)(Math.random() * 100);

        }
        selSort.selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        System.out.println("Пожалуйста введите одно из представленных чисел");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        System.out.println("Введенное вами число находиться в arr[" + selSort.findNumberInMass(arr, num) + "]");




    }
}
