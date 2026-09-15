  
//    import java.io.IOException;
//    import java.util.Arrays;
//    import java.util.Random;
//    import java.util.logging.FileHandler;
//    import java.util.logging.Logger;
//    import java.util.logging.SimpleFormatter;   

import java.util.Arrays;
import java.util.Scanner;
// 1. Реализовать алгоритм сортировки слиянием

public class hw3_1 {
//    public static int[] mergeSort(int[] sortArr) {
  //      int[] buffer1 = Arrays.copyOf(sortArr, sortArr.length);
    //    int[] buffer2 = new int[sortArr.length];
      //  int[] result = mergeSortInner(buffer1, buffer2, 0, sortArr.length);
        //return result;
//    }

//    public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
  //      if (startIndex >= endIndex - 1) {
    //        return buffer1;
       // }

        //уже отсортирован
//        int middle = startIndex + (endIndex - startIndex) / 2;
  //      int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
    //    int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        //слияние
//        int index1 = startIndex;
  //      int index2 = middle;
    //    int destIndex = startIndex;
      //  int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        //while (index1 < middle && index2 < endIndex) {
          //  result[destIndex++] = sorted1[index1] < sorted2[index2]
            //        ? sorted1[index1++] : sorted2[index2++];
//        }
  //      while (index1 < middle) {
    //        result[destIndex++] = sorted1[index1++];
      //  }
        //while (index2 < endIndex) {
          //  result[destIndex++] = sorted2[index2++];
//        }
  //      return result;
    //}
//    public static void main(String args[]) {
  //      int[] sortArr = {5, 9, 3, -2, 5, 0, 8, 1, 2};
    //    int[] result = mergeSort(sortArr);
      //  System.out.println("Исходный список: " + Arrays.toString(sortArr));
        //System.out.println("Отсортированный список: " + Arrays.toString(result));
//    }
//}

//2. Пусть дан произвольный список целых чисел, удалить из него четные числа.

//    public static void main(String[] args) {
        // заполняем массив
//        Scanner sc = new Scanner(System.in);
  //          System.out.print("Введите количество элементов массива: ");
    //        int n = sc.nextInt();
      //      int[] newArr = new int[n];
        //    System.out.println("Введите элементы массива: ");
          //  for (int i = 0; i < n; i++){
            //    newArr[i] = sc.nextInt();           
//            }
  //          System.out.println("Исходный массив: " + Arrays.toString(newArr));
        //сортируем массив
    //        int[] filterArr = Arrays.stream(newArr).filter(i -> i%2 != 0).toArray();
      //      System.out.println("Полученный массив: " + Arrays.toString(filterArr));
//    } 
//}
//3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.


    public static int[] mergeSort(int[] sortArr) {
        int[] buffer1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] buffer2 = new int[sortArr.length];
        int[] result = mergeSortInner(buffer1, buffer2, 0, sortArr.length);
        return result;
    }

    public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        //уже отсортирован
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        //слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
    public static void main(String args[]) {
        int[] sortArr = {2, 1, 8, -9, 2, 7, 15, 0};
        int[] result = mergeSort(sortArr);
        System.out.println("Исходный список: " + Arrays.toString(sortArr));
        // System.out.println("Отсортированный список: " + Arrays.toString(result));
        System.out.println("Минимальное значение: " + result[0]);
        System.out.println("Максимальное значение: " + result[result.length-1]);
        System.out.println("Среднее значение: " + (double)Arrays.stream(result).sum()/result.length);
    }
}

 