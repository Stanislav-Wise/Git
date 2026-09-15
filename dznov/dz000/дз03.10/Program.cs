// See https://aka.ms/new-console-template for more information
//Задача 41: Пользователь вводит с клавиатуры M чисел. Посчитайте, сколько чисел больше 0 ввёл пользователь.
//0, 7, 8, -2, -2 -> 2

//Console.Clear();
//Console.WriteLine("Задать длину массива ");
//int size = Convert.ToInt32(Console.ReadLine());
//int[] array = new int[size];
//Random rand = new Random();
//for (int x = 0; x < array.Length; x++)
//{
  //array[x] = rand.Next(-5, 1000);
  //if (array[x]  > 0)
 //{
    //Console.WriteLine(array[x]);
  //}
//}
//Задача 43: Напишите программу, которая найдёт точку пересечения двух прямых, заданных уравнениями y = k1 * x + b1, y = k2 * x + b2; значения b1, k1, b2 и k2 задаются пользователем.

// b1 = 2, k1 = 5, b2 = 4, k2 = 9 -> (-0,5; -0,5)
Console.Clear();
Console.Write("k1 ");
double k1 = Convert.ToDouble(Console.ReadLine());
Console.Write("b1 ");
double b1 = Convert.ToDouble(Console.ReadLine());
Console.Write("k2 ");
double k2 = Convert.ToDouble(Console.ReadLine());
Console.Write("b2 ");
double b2 = Convert.ToDouble(Console.ReadLine());
double x = (b2 - b1) / (k1 - k2);
double y = k1 * x + b1;
Console.WriteLine($"точкa ({x};{y})");