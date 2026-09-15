// See https://aka.ms/new-console-template for more information
//47 Задайте двумерный массив размером m×n, заполненный случайными вещественными числами.
//m = 3, n = 4.
//0,5 7 -2 -0,2
//1 -3,3 8 -9,9
//8 7,8 -7,1 9
//Console.Clear();
//Console.WriteLine("Задать длину строки массива ");
//int n = Convert.ToInt32(Console.ReadLine());
//Console.WriteLine("Задать высоту столбца массива ");
//int m = Convert.ToInt32(Console.ReadLine());
//double[ , ] array = new double[n,m];
//Random rand = new Random();
//for (int i = 0; i < array.GetLength(0); i++)
//{
  //for (int j = 0; j < array.GetLength(1); j++)  
  //{
    //array[i,j] = Convert.ToDouble(rand.Next(-100, 100)/10.0);
  //}
//}
//for (int i = 0; i < array.GetLength(0); i++)
//{
  //for (int j = 0; j < array.GetLength(1); j++)  
    //  {
    //Console.Write($"{array[i,j]} ");
  //}
  //Console.WriteLine();
  //}

  //Задача 52. Задайте двумерный массив из целых чисел. Найдите среднее арифметическое элементов в каждом столбце.

//Например, задан массив:
//1 4 7 2
//5 9 2 3
//8 4 2 4
//Среднее арифметическое каждого столбца: 4,6; 5,6; 3,6; 3.

//Console.Clear();
//Console.WriteLine("Найти среднее арифметическое каждого столбца массива ");
//int[ , ] array = {{1, 1, 1},
  //                {1, 2, 4},
    //              {3, 3, 3}};
//for (int i = 0; i < array.GetLength(0); i++)
//{
  //  double sum = 00;
  //for (int j = 0; j < array.GetLength(1); j++)  
    //{  
   //    {
     //   sum += array[j , i];
    //}
    //}
     //Console.Write($"{ sum / array.GetLength(0)} ");


//Console.WriteLine();
//}
//Задача 50. Напишите программу, которая на вход принимает позиции элемента в двумерном массиве, и возвращает значение этого элемента или же указание, что такого элемента нет.
//Например, задан массив:
//1 4 7 2
//5 9 2 3
//8 4 2 4
//17 -> такого числа в массиве нет



  Console.WriteLine("Введите размеры массива");
int m = Convert.ToInt32(Console.ReadLine());
int n = Convert.ToInt32(Console.ReadLine());
int[,] array = new int[m, n];
 
for (int i = 0; i < array.GetLength(0); i++) 
{
    for (int j = 0; j < array.GetLength(1); j++)
        array [i, j] = Convert.ToInt32(new Random().Next(0,10));  
}
 
for (int i = 0; i < array.GetLength(0); i++) 
{
    for (int j = 0; j < array.GetLength(1); j++)
        Console.Write(array[i,j] + "\t  ");
        Console.WriteLine();
}
 
 Console.WriteLine("Введите число");
 int a = Convert.ToInt32(Console.ReadLine());
 int b = Convert.ToInt32(Console.ReadLine());
 if (a>m && b>n)
 Console.WriteLine("такого числа нет");
 else
 {
 object c = array.GetValue(a,b);
 Console.WriteLine(c);
 }
