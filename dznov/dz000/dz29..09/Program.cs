// See https://aka.ms/new-console-template for more information
//Задача 34: Задайте массив заполненный случайными положительными трёхзначными числами. Напишите программу, которая покажет количество чётных чисел в массиве.
//[345, 897, 568, 234] -> 2

//Console.WriteLine("Задать длину массива ");
//int size = Convert.ToInt32(Console.ReadLine());
//int[] array = new int[size];
//int count = 0;
//Random rand = new Random();
//for (int x = 0; x < array.Length; x++)
//{
  //array[x] = rand.Next(100, 200);
  //if (array[x] % 2 ==0)
 //{
    // Console.WriteLine(array[x]);
  //count ++;
//}
//}
  //Console.WriteLine(count);

//Задача 36: Задайте одномерный массив, заполненный случайными числами. Найдите сумму элементов, стоящих на нечётных позициях.
//[3, 7, 23, 12] -> 19

//Console.WriteLine("Задать длину массива ");
//int size = Convert.ToInt32(Console.ReadLine());
//int[] array = new int[size]
//int B = 0;
//Random rand = new Random();
//for (int x = 0; x < array.Length; x++)
//{
  //array[x] = rand.Next(1, 20);
  //if (array[x] % 2 > 0)
 //{
   //  Console.WriteLine(array[x]);
   //B = B + array[x];
//}
//}
  //Console.WriteLine(B);

//  Задача 38: Задайте массив вещественных чисел. Найдите разницу между максимальным и минимальным элементов массива.
//[3 7 22 2 78] -> 76

Console.WriteLine("Задать длину массива ");
int size = Convert.ToInt32(Console.ReadLine());
double[] array = new double[size];
Random rand = new Random();
for (int x = 0; x < array.Length; x++)
{
  array[x] = rand.Next(1, 20);
}
double max = array[0];
double min = array[0];
for (int x = 0; x < array.Length; x++)
{
   if (array[x] > max)
        {
            max = array[x];
        }
    if (array[x] < min)
        {
            min = array[x];
        }
 
}
  Console.WriteLine(max);
Console.WriteLine(min);
double raznost = max - min;
Console.WriteLine(raznost);

  