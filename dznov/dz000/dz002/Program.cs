//Задача 25: Напишите цикл, который принимает на вход два числа (A и B) и возводит число A в натуральную степень B.
//3, 5 -> 243 (3⁵)
//2, 4 -> 16
//Console.Write("Введите число ");
//int A = Convert.ToInt32(Console.ReadLine());
//Console.Write("Введите число ");
//int B = Convert.ToInt32(Console.ReadLine());
//int C = 2;
//int D = A * A;
//while (C < B)
//{
   //D = D * A;
  // C = C + 1; 
//}
//Console.WriteLine(D);

//Задача 27: Напишите программу, которая принимает на вход число и выдаёт сумму цифр в числе.

//Console.Write("Введите число ");
//int A = Convert.ToInt32(Console.ReadLine());
//int C = 0;
//while (A > 0)
//{
  // int B = A % 10;
   //A = A / 10;
    //C = C + B;
//}
//Console.WriteLine(C);

//Задача 29: Напишите программу, которая задаёт массив из 8 элементов и выводит их на экран.

//1, 2, 5, 7, 19 -> [1, 2, 5, 7, 19]

//6, 1, 33 -> [6, 1, 33]

Console.WriteLine("Массив");
int[] array = new int[8];
Random rand = new Random();
for (int x = 0; x < array.Length; x++)
{
  array[x] = rand.Next(8);
  Console.WriteLine(array[x]);
}

