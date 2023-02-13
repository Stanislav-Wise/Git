import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 * program
 */
// task1
public class program {
    //public static void main(String[] args) {
        //System.out.printf("Задайте число: ");
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("name");
        //int n = scanner.nextInt();

        //int[] array = {1,2,3,4};
        //System.out.printf("Треугольное число: %d/n", givemeNumber(n));
        //scanner.close();

        //System.out.println(Arrays.toString(array));
    //}
    
    //public static int givemeNumber(int a) {
      //  return (a * (a + 1))/2;
    //}
//}

//task2

//public static void main(String[] args) {
  //  System.out.print("Задайте положительное число: ");
    //Scanner scanner = new Scanner(System.in);
    
    //int input = scanner.nextInt();
    //scanner.close();
    //List<Integer> primes = new ArrayList<>();

    //for (int i = 2; i <= input; i++) {
      //  boolean isPrimeNumber = true;

        //for (int j = 2; j < i; j++) {
          //  if (i % j == 0) {
            //    isPrimeNumber = false;
              //  break;
            //}
        //}

        //if (isPrimeNumber) {
          //  primes.add(i);
        //}
    //}
    //System.out.println("Простые числа: " + primes);
//}


//task3

static int scanNumber() {
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
    return number;
}

static String scanOperations() {
    Scanner scan = new Scanner(System.in);
    String operations = scan.nextLine();
    return operations;

}
static int getResult(String opr, int num1, int num2) {
    int result = 0;
    switch (opr) {
        case "+":
            result = num1 + num2;
            break;
        case "-":
            result = num1 - num2;
            break;
        case "*":
            result = num1 * num2;
            break;
        case "/":
            result = num1 / num2;

        default:
            System.out.println("Введите оператор: -, +, *, /");
            break;
    }
    return result;

}

public static void main(String[] args) {
    System.out.println("Введите первое число: ");
    int num1 = scanNumber();
    System.out.println("Введите оператор: -, +, *, /");
    String operations = scanOperations();
    System.out.println("Введите второе число: ");
    int num2 = scanNumber();
    int result = getResult(operations, num1, num2);
    System.out.printf("%d %s %d = %d", num1, operations, num2, result);

}

}