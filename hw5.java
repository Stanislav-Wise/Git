
/*
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class hw5 {
//   public static void main(String[] args) {
  //     Map<String, List<String>> phonBook = new HashMap<>();
    //   phonBook.put("Lena", List.of("8 926 333 33 33", "8 926 222 22 99"));
      // phonBook.put("Ira", List.of("8 926 333 33 55", "8 926 222 22 00"));
//       phonBook.put("Igor", List.of("8 926 333 33 66", "8 926 222 22 44"));
//       phonBook.put("Petr", List.of("8 926 333 33 77", "8 926 222 22 11"));
//       phonBook.put("Dima", List.of("8 926 333 33 88", "8 926 222 22 22"));

  //     menu(phonBook);

   //}

//   public static String scanner() {
  //     Scanner scanner = new Scanner(System.in);
    //   String scan = scanner.nextLine();
       // scanner.close();
      // return scan;
   //}

   //public static void find(Map<String, List<String>> phonBook) {
     //  System.out.println("Введите имя: ");
       //String name = scanner();
 //      System.out.println(phonBook.get(name));
   //}

 //  public static void allBook(Map<String, List<String>> phonBook) {
    //   System.out.println(phonBook);

//   }

 //  public static Map<String, List<String>> add(Map<String, List<String>> phonBook) {
  //     System.out.println("Если хотите выйте хотите перестать вводить номера введите 'stop'");
  //     System.out.println("Введите имя: ");
  //     String name = scanner();
  //     List<String> number = new ArrayList<>();
    //   while (true) {
     //      System.out.println("Введите номер: ");
     //      String phon = scanner();
      //     if (phon.equals("stop")) {
      //         break;
       //    } else {
    //      number.add(phon);
     //      }
      // }
      // phonBook.put(name, number);

    //   return phonBook;
  // }

   // public static Map<String, List<String>> menu(Map<String, List<String>> phonBook) {
   //    System.out.println(
   //            "Введите команду из списка: find - найти контакт, add - добавить контакт, all - показать всю телефонную книгу, exit - выйти");
   //    while (true) {
   //        String comands = scanner();
   //        if (comands.equals("exit")) {
   //            break;
   //        } else {
   //            switch (comands) {
   //                case "find":
   //                    find(phonBook);
    //                   break;
   //                case "add":
   //                    add(phonBook);
   //                    break;
   //                case "all":
   //                    allBook(phonBook);
   //                    break;
   //                default:
   //                    break;
   //            }
   //        }
   //    }
   //    return phonBook;
   // }
   // }
  
  
  // Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. 
  // Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
 // Отсортировать по убыванию популярности.
 

// import java.util.Comparator;
// import java.util.LinkedHashMap;
// import java.util.List;
// import java.util.Map;
// import java.util.stream.Collectors;

// public class hw5 {
  // public static void main(String[] args) {
 //  List<String> workers = List.of("Иван", "Пётр", "Пётр", "Антон", "Антон", "Иван", "Пётр", "Иван", "Пётр", "Иван",
 //             "Пётр", "Иван", "Пётр", "Антон", "Антон");
 //      System.out.println(repeat(workers));
 // }

 //  public static Map<String, Integer> repeat(List<String> workers) {
 //      Map<String, Integer> repeatNameCount = new LinkedHashMap<>();

 //      for (int i = 0; i < workers.size(); i++) {
 //          if (repeatNameCount.containsKey(workers.get(i))) {
 //              repeatNameCount.put(workers.get(i), repeatNameCount.get(workers.get(i)) + 1);
 //          } else {
 //              repeatNameCount.put(workers.get(i), 1);
 //          }
 //      }

 //      Map<String, Integer> sortedMap = repeatNameCount.entrySet().stream()
 //              .sorted(Comparator.comparingInt(e -> -e.getValue()))
 //              .collect(Collectors.toMap(
 //                      Map.Entry::getKey,
 //                      Map.Entry::getValue,
 //                      (a, b) -> {
 //                          throw new AssertionError();
 //                      },
 //                      LinkedHashMap::new));
 //      return sortedMap;
 //  }

 //}
  
 // Реализовать алгоритм пирамидальной сортировки (HeapSort).

// import java.util.Arrays;

 // public class hw5 {

  // private static int LEFT(int i) {
  //     return (2 * i + 1);
  // }

  // private static int RIGHT(int i) {
  //     return (2 * i + 2);
  // }

  // private static void swap(int[] A, int i, int j) {
  //     int temp = A[i];
  //     A[i] = A[j];
  //     A[j] = temp;
  // }

   // private static void heapify(int[] A, int i, int size) {//

  //     int left = LEFT(i);
  //     int right = RIGHT(i);

  //     int largest = i;

  //     if (left < size && A[left] > A[i]) {
  //         largest = left;
  //     }

  //     if (right < size && A[right] > A[largest]) {
  //         largest = right;
  //     }

  //     if (largest != i) {
  //         swap(A, i, largest);
  //         heapify(A, largest, size);
  //     }
  // }

  // public static int pop(int[] A, int size) {

 //   if (size <= 0) {
 //          return -1;
 //      }

 //    int top = A[0];

 //      A[0] = A[size - 1];

//    heapify(A, 0, size - 1);

//       return top;
// }

//   public static void heapsort(int[] A) {

//     int n = A.length;

//       int i = (n - 2) / 2;
//       while (i >= 0) {
//           heapify(A, i--, n);
//       }

//       while (n > 0) {
//           A[n - 1] = pop(A, n);
//           n--;
//       }
//   }

//   public static void main(String[] args) {
//       int[] A = { 8, 4, 7, 1, 9, 5 };

//       heapsort(A);

 //      System.out.println(Arrays.toString(A));
 //  }
 // }

 

// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.

// import java.util.Random;

// public class hw5 {
//   public static class Queen {
//       int x, y;
//       static int count = 0;

//       public Queen(Board board) {
//           while (true) {
//               // System.out.println("Создаем ферзя");
//               Random rnd = new Random();
//               int x = rnd.nextInt(8);
//               int y = rnd.nextInt(8);
//               if (board.cell[x][y] == 0) {
//                   this.x = x;
//                   this.y = y;
//                   count++;
//                   break;
//               }
//           }
//       }
//   }

//   public static class Board {
//       int size;
//       int[][] cell;

//       public Board(int size) {
//           this.size = size;
//           this.cell = new int[this.size][this.size];
//       }

//       public void addQueen(Queen queen, int index) {
//           this.cell[queen.x][queen.y] = index + 2;
//           for (int i = 1; i < 8; i++) {
//               int x = queen.x;
//               int y = queen.y;
//               if ((x + i) < 8 && (y + i) < 8 && (x + i) >= 0 && (y + i) >= 0 && this.cell[x + i][y + i] == 0) {
//                   this.cell[x + i][y + i] = 1;
//               }
//               if ((x + i) < 8 && (y - i) < 8 && (x + i) >= 0 && (y - i) >= 0 && this.cell[x + i][y - i] == 0) {
//                  this.cell[x + i][y - i] = 1;
//               }
//               if ((y + i) < 8 && (y + i) >= 0 && this.cell[x][y + i] == 0) {
//                   this.cell[x][y + i] = 1;
//               }
//               if ((y - i) < 8 && (y - i) >= 0 && this.cell[x][y - i] == 0) {
//                   this.cell[x][y - i] = 1;
//               }
//               if ((x - i) < 8 && (y + i) < 8 && (x - i) >= 0 && (y + i) >= 0 && this.cell[x - i][y + i] == 0) {
//                   this.cell[x - i][y + i] = 1;
//              }
//               if ((x - i) < 8 && (y - i) < 8 && (x - i) >= 0 && (y - i) >= 0 && this.cell[x - i][y - i] == 0) {
//                   this.cell[x - i][y - i] = 1;
//               }
//               if ((x + i) < 8 && (x + i) >= 0 && this.cell[x + i][y] == 0) {
//                   this.cell[x + i][y] = 1;
//               }
//               if ((x - i) < 8 && (x - i) >= 0 && this.cell[x - i][y] == 0) {
//                   this.cell[x - i][y] = 1;
//               }
//           }
//       }

//       public boolean checkBoard() {
//           for (int[] row : this.cell) {
//               for (int elem : row) {
//                  if (elem == 0) {
//                       return false;
//                   }
//               }
//           }
//           return true;
//       }

//     public void print() {
//           for (int i = 0; i < this.size; i++) {
//               for (int j = 0; j < this.size; j++) {
//                   if (this.cell[j][i] == 0 || this.cell[j][i] == 1) {
//                       System.out.print(" - ");
//                   } else {
//                       System.out.printf(" %d ", this.cell[j][i] - 1);
//                   }
//               }
//               System.out.println();
//           }
//           System.out.println();
//       }
 //   }

 //  public static void start() {
 //      int size = 8;
 //      Board board = new Board(size);
 //      nextTurn(board);
 //  }

 //  public static void nextTurn(Board board) {
 //      Queen[] queens = new Queen[8];
 //      for (int i = 0; i < 8; i++) {
 //          if (board.checkBoard()) {
 //              start();
 //              return;
 //          }
 //          queens[i] = new Queen(board);
 //          board.addQueen(queens[i], i);
 //      }
 //      board.print();
 //  }

 //   public static void main(String[] args) {
 //      start();
 //  }
 // }
 