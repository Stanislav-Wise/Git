//import java.util.Arrays;
import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.List;
import java.io.IOException;
//import java.util.Random;
import java.util.logging.ConsoleHandler;
//import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter; 
import java.util.logging.*;

/**
 * program
 */
// task 2
public class program {
    
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
 
public static void main(String[] args) throws IOException{
  Logger logger = Logger.getLogger(program.class.getName());
    ConsoleHandler ch = new ConsoleHandler();

    logger.addHandler(ch);

    SimpleFormatter sFormatter = new SimpleFormatter();
    ch.setFormatter(sFormatter);
   
   logger.info("test ");

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
